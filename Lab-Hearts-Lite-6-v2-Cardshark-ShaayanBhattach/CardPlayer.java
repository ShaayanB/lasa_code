import java.util.*;

public class CardPlayer extends Player {

  private ArrayList<Card> hand = new ArrayList<Card>();
  private ArrayList<Card> takenCards = new ArrayList<Card>();

  public CardPlayer(String init_name, int init_score, ArrayList<Card> init_hand) {
    super(init_name, init_score);
    this.hand = init_hand;
  }
  public ArrayList<Card> getHand() {
    return hand;
}
  public ArrayList<Card> getTakenCards() {
    return takenCards;
  }

  public void setHand(ArrayList<Card> set) {
    hand = set;
}

  public void setTakenCards(ArrayList<Card> s2) {
    takenCards = s2;
  }

  public void addCard(Card c) {
    hand.add(c);
  }

  public Card playCard(int i) {
    return this.hand.remove(i);
  }

  public Card chooseCard(ArrayList<Card> playedInRound, ArrayList<Card> allPrevious) {
    for (int x = 0; x < hand.size(); x++) {
      if (hand.get(x).getSuit().equals(Deck.SUITS[0])) {
        return playCard(x);
      }
    }

    if (allPrevious.size() == 0) {
      return playCard((int) Math.random() * (hand.size() - 2) + 1);
    } else {
      for (int x = 0; x < hand.size(); x++) {
        if (hand.get(x).equals(allPrevious.get(0))) {
          return (hand.get(x));
        } else if (hand.get(x).getSuit().equals(Deck.SUITS[2])) {
          return (hand.get(x));
        }}

    }
    return playCard((int) Math.random() * (hand.size() - 2) + 1);
  }

  public String toString() {
    Collections.sort(hand);
    return super.getName() + " (" + super.getScore() + ") " + hand;
  }

}