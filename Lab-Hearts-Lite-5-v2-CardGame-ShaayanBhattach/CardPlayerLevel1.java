import java.util.*;
/*
*
*   Your CardPlayerLevel.java
*
*/
public class CardPlayerLevel1 extends CardPlayer{
  

public CardPlayerLevel1(String init_name, int init_score, ArrayList<Card> init_hand){
  super(init_name,init_score,init_hand);
}

public Card chooseCard(ArrayList<Card> playedInRound, ArrayList<Card> allPrevious) {
    Card x = new Card("2", "clubs", 2);
    for(int i = 0; i < getHand().size(); i++) {
      if(getHand().get(i).compareTo(x) == 0)
        return playCard(i);
    }
    if(playedInRound.size() == 0)
      return playCard((int) Math.random() * (getHand().size() - 2) + 1);
    else {
      String temp = playedInRound.get(0).getSuit();
      for(int i = 0; i < getHand().size(); i++) {
        if(getHand().get(i).getSuit().equals(temp))
          return playCard(i);
      }
      
      Card QOS = new Card("Q","spades",13);
      for(int i = 0; i < getHand().size(); i++) {
        if(getHand().get(i).equals(QOS))
          return playCard(i);
      }
      int highest = 0;
      int index = -1; 
      for(int i = 0; i < getHand().size(); i++) {
        if(getHand().get(i).getSuit().equals("hearts")) {
          if(getHand().get(i).getValue() > highest) {
            highest = getHand().get(i).getValue();
            index = i;
          }
        }
      }
      if(index > -1)
        return playCard(index);
    }
    return playCard((int) Math.random() * (getHand().size() - 2) + 1);
  }
}
