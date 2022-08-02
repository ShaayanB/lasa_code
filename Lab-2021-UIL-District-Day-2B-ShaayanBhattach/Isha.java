import java.util.*;
import java.io.File;

public class Isha {
  public static void main(String[]args) throws FileNotFoundException{

    File file = new File("isha.dat");
    Scanner sc = new Scanner(file);
    ArrayList<String>flights = new ArrayList<String>();
    int count = sc.nextInt();
    
    for(int x = 0; x < count; x++){
      flights.add(sc.nextLine());
    }
  
  for(int i = 0; i < flights.size(); i++){
    String state1 = sc.next();
    if(state1.equals("San")){
      state1 = "San Diego";
    }
    //String state2 = flights.get(i).substring(flights.lastIndexOf('.') + 2,flights.size()-1);
    if(state2.equals("San")){
      state2 = "San Diego";
    }
    int hour = flights.get(i).substring((flights.indexOf("M") + 1), 4)
    if((state1 == "Charlotte") || (state1 == "orlando")){
      if(state2 == "Houston"){
        
      }
    }
  }
  
  }
}