/*
*
*   Your Card.java
*
*/
public class Card implements Comparable<Object> {
  /**
  * Set instance variables as follows;
  *   variable "name" of type string
  *   variable suit of type string
  *   variable "value" of type primitive integer
  * Note: use the correct access specifier
  */
  private String name;
  private String suit;
  private int value;
    // example with "name" instance variable
   
  /**
  * Card Constuctor - default
  * Creates a default card object with;
  *   name set to "default"
  *   suit set to "default"
  *   value set to 0
  * @param none
  */

  // ** Your code here **
  public Card(){
    name = "default";
    suit = "default";
    value = 0;
  }

  /**
  * Card Constuctor - initializing
  * Creates a default card object with;
  *   name set to "default"
  *   suit set to "default"
  *   value set to 0
  * @param  name a string with name of card
  * @param  suit a string with name of suit
  * @param  value an integer with the value of the card
  */

  // ** Your code here **
  public Card(String name_init, String suit_init, int value_init){
    name = name_init;
    suit = suit_init;
    value = value_init;
  }


  /**
  * Accessor Methods for each instance variable
  */

  // ** Your code here **
  public String getName(){
    return(name);
  }

  public String getSuit(){
    return(suit);
  }

  public int getValue(){
    return(value);
  }

  /**
  * Mutator Methods for each instance variable
  */
  
  // ** Your code here **
  public void setName(String x){
    name = x;
  }

  public void setSuit(String y){
    suit = y;
  }

  public void setValue(int z){
    value = z;
  }


  /**
  * sortRank - Helper function to give rank of card, weighted
  *            by suit. 
  *                diamonds 0-12, hearts 13-25, 
  *                spades 26 - 38, clubs 39 - 51
  *  So you simply need to add a wight to value of this card object
  *                diamonds: value + 0
  *                hearts: value + 13
  *                spades: value + 26
  *                clubs: value + 39
  */



  private int sortRank() {     // ** You have to fix this method declaration

  // ** Your code here **
  int amount = 0;
  if(suit.equals("hearts")){
    amount = 13;
  }
  else if (suit.equals("clubs")){
    amount = 39;
  }
  else if (suit.equals("spades")){
    amount = 26;
  
   }
  return(amount + value);
  }


  /**
  * compareTo - Override the compareTo() method default
  * 
  */

  public int compareTo(Object temp)  {     // ** You have to fix this method declaration

  // ** Your code here **
  Card x = (Card) temp;
  if(x.sortRank() < sortRank()){
    return 1;
  }
  else if(x.sortRank() > sortRank()){
    return -1;
  }
  else{
    return 0;
  }
   }

  /**
  * equals - Override the equals() method default
  *  for indexOf() to work on an array of cards we 
  *   need to define what it means for two cards to 
  *   be equal.  We use indexOf() to find the 2 of 
  *   clubs in the CardGame class.
  */
   
  // ** Your code here **
  public boolean equals(Object obj){
    Card x = (Card)obj;
    if ((x.getName() == getName()) && (x.getSuit() == getSuit()) && x.getValue() == getValue()){
      return true;
    }
    else{
      return false;
    }
  }

  /**
  * toString - Override the toString method default
  * 
  */

  // ** Your code here **
public String toString(){
  return suit.charAt(0) + name + "(" + value + ")";
}

}