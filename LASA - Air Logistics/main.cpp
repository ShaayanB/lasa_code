
//
//  main.cpp
//  LLTemplate
//
//  Created by James Shockey on 12/6/16.
//  Copyright © 2016 James Shockey. All rights reserved.
//


/*
 *
 *	Linked List lab.
 *	- Build a library for singly linked list.
 *	- Replace the airport array in main with a Linked List.
 *  - sort the array. 
 *	
 */


#include <iostream>
#include <fstream>
#include <cmath> 
#include "slist.h"
using namespace std;
#include <string>
// #include "slist.h"

using namespace std;

class Airport
{
public:
  string    code;
  double   longitude;
  double   latitude;
  double   distance;
  Airport* next;
};



void simpleSortTotal(Airport* s[], int c);
double distanceEarth(double lat1d, double lon1d, double lat2d, double lon2d);
void append(Airport** head, string code, double longitude, double latitude, double distance);
double distanceFromAUS(double lat1d, double lon1d);
void simpleSortTotal(Airport* head, int size);

int main()
{
  ifstream infile;
  int i = 0;
  char cNum[255];
  string temp;
  int   airportCount;
  Airport* head = NULL;   // Linked list for Airport class

  infile.open("airport-codes_US.csv", ifstream::in);
  if (infile.is_open())
  {
    int   c = 0;
    while (infile.good())
    {
      infile.getline(cNum, 256, ',');
      string temp(cNum);  // code
      if (temp != "ident" &&  temp.length() != 0)  // ignore first line and blank entries
      { 
        string code = temp;
        infile.getline(cNum, 256, ',');  //type
        infile.getline(cNum, 256, ',');  // name
        infile.getline(cNum, 256, ','); //long
        double longitude = atof(cNum); 
        infile.getline(cNum, 256, ','); //lat
        double latitude = atof(cNum);
        infile.getline(cNum, 256, '\n'); //rest

        double distance = distanceFromAUS(latitude, longitude);

        // Append data to linked list
        append(&head, code, longitude, latitude,distance);


        //if (!(c % 1000))
        //  cout << head->code << " long: " << head->longitude << " lat: " << head->latitude << endl;

        i++;
        c++;
      }
      else{
        infile.getline(cNum, 256, '\n');  // get rest of the line
      }
    }
    airportCount = c - 1;
    infile.close();

    // Sort the list, takes a long time
    simpleSortTotal(head,airportCount);

    int count = 0;
    //traverse the list to display each node
    /* while (head != NULL)
    {
      if (!(count % 1000))
      {
        cout << head->code << " long: " << head->longitude << " lat: " << head->latitude << endl;
        cout << head->next->code << " long: " << head->next->longitude << " lat: " << head->next->latitude << endl;
        cout << "Distance between " << head->code << " and " << head->next->code << " is "
          << distanceEarth(head->longitude, head->latitude, head->next->longitude, head->next->latitude) << endl;
      }
      head = head->next;
      count++;
    }*/
   
    string farthest_code = "";
    double farthest_distance = 0.0;

    while (head != NULL)
    {
      if (head->distance < 100)
      {
        cout << head->code << " distance: " << head->distance << endl;
      }

      if (head->distance > farthest_distance){
        farthest_code = head->code;
        farthest_distance = head->distance;
      }

      head = head->next;
      count++;
    }

    cout << farthest_code << " farthest distance: " << farthest_distance << endl;

  }
  else
  {
    cout << "Error opening file";
  }
  return(0);
}



#define pi 3.14159265358979323846
#define earthRadiusKm 6371.0

// This function converts decimal degrees to radians
double deg2rad(double deg) {

  return (deg * pi / 180);
}

//  This function converts radians to decimal degrees
double rad2deg(double rad) {
  return (rad * 180 / pi);
}

double distanceFromAUS(double lat1d, double lon1d){

  //KAUS,large_airport,Austin Bergstrom International Airport,-97.66989899,30.19449997,542,NA,US,US-TX,Austin,KAUS,AUS,AUS, 
  return(distanceEarth(lat1d, lon1d, 30.19449997, -97.66989899));

}
/**
* Returns the distance between two points on the Earth.
* Direct translation from http://en.wikipedia.org/wiki/Haversine_formula
* @param lat1d Latitude of the first point in degrees
* @param lon1d Longitude of the first point in degrees
* @param lat2d Latitude of the second point in degrees
* @param lon2d Longitude of the second point in degrees
* @return The distance between the two points in kilometers
*/
double distanceEarth(double lat1d, double lon1d, double lat2d, double lon2d) {
  double lat1r, lon1r, lat2r, lon2r, u, v;
  lat1r = deg2rad(lat1d);
  lon1r = deg2rad(lon1d);
  lat2r = deg2rad(lat2d);
  lon2r = deg2rad(lon2d);
  u = sin((lat2r - lat1r) / 2);
  v = sin((lon2r - lon1r) / 2);
  return 2.0 * earthRadiusKm * asin(sqrt(u * u + cos(lat1r) * cos(lat2r) * v * v));
}


/* insert new Airport at the end of the linked list */
void append(Airport** head, string code, double longitude, double latitude, double distance)
{
  /* 1. create and allocate Airport */
  struct Airport* newNode = new Airport;

  struct Airport *last = *head; /* used in step 5*/

  /* 2. assign data to the Airport */
  newNode->code = code;
  newNode->longitude = longitude;
  newNode->latitude = latitude;
  newNode->distance = distance;

  /* 3. set next pointer of new Airport to null as its the last Airport*/
  newNode->next = NULL;

  /* 4. if list is empty, new Airport becomes first Airport */
  if (*head == NULL)
  {
    *head = newNode;
    return;
  }

  /* 5. Else traverse till the last Airport */
  while (last->next != NULL)
    last = last->next;

  /* 6. Change the next of last Airport */
  last->next = newNode;
  return;
}

/*
Provide sort routine on linked list
*/

void simpleSortTotal(Airport* head, int size)
{
  Airport* cur1 = head;
  Airport* cur2 = head;

  for (int i = 0; i < size; i++) {
    for (int j = 0; j < size - 1; j++) {
      if (cur1->distance < cur2->distance) {
        double temp1 = cur1->distance;
        string temp2 = cur1->code;
        cur1->distance = cur2->distance;
        cur2->distance = temp1;

        cur1->code = cur2->code;
        cur2->code = temp2;


      }
      cur2 = cur2->next;
    }
    cur2 = head;
    cur1 = head->next;
    for (int k = 0; k < i; k++) {
      cur1 = cur1->next;
    }
  }
}

