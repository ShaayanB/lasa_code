/*
*
*   Your Deck.java
*
*/
// **** Your Code Goes Here ****
import java.util.ArrayList;
import java.util.Random;

public class Deck{

private ArrayList<Card> deck = new ArrayList<Card>();
public static final String[] NAMES = {"2","3","4","5","6","7","8","9","T","J","Q","K","A"};
public static final String[] SUITS = {"clubs", "spades", "hearts", "diamonds"};
public static final int[] RANKS = {2,3,4,5,6,7,8,9,10,11,12,13,14};



public Deck()
{
  initializeDeck();
}

public ArrayList<Card> getDeck()
{
  return(deck);

}

public void setDeck(int index, Card c)
{
deck.set(index, c);

}

public void initializeDeck()
{
deck.clear();
for(int i = 0; i < 4; i++){
for(int x = 0; x < NAMES.length; x++){
  deck.add(new Card(NAMES[x], SUITS[i], RANKS[x]));
}
}
}

public Card getCard(int index){
  return deck.get(index);
}

public Card dealTopCard(){
  Card top = deck.get(0);
  deck.remove(0);
  return(top);
}

public void shuffle()
{
ArrayList<Card> temp = new ArrayList<Card>();
Random rand = new Random();
int high = 10;
int low = 2;
int r = rand.nextInt(high - low) + low;
for (int x = 0; x < r; x++){
  temp.add(deck.remove(x));
}
int rindex = rand.nextInt(deck.size() + 1);
if (rindex == 0){
  while(rindex == 0){
    rindex = rand.nextInt(deck.size() + 1);
  }
}
deck.addAll(rindex,temp);
}

public String toString(){
  if(deck.size() > 0) {
      String s = "";
      for(Card i : deck) {
        s += i.getSuit().charAt(0) + i.getName() + "(" + i.getValue() + ")";
      }
      return s;
    }
  else{
    return("No cards in the deck!");
  }
}

}