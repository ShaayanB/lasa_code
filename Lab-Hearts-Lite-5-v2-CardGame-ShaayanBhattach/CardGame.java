import java.util.*;

public class CardGame{
  private Deck deckOfCards;
  private String nameOfGame;
  private ArrayList<CardPlayer> players;
  private int numberOfPlayers;
  private int currentPlayer;


  public CardGame(String n, int num, String names[], int current) {
    deckOfCards = new Deck();
    players = new ArrayList<CardPlayer>();
    nameOfGame = n;
    numberOfPlayers = num;
    for (String name : names) {
        players.add(new CardPlayer(name, 0, new ArrayList<Card>()));
    }
    currentPlayer = current;
  }

  public Deck getDeckOfCards() {
    return deckOfCards;
  }

  public String getNameOfGame() {
    return nameOfGame;
  }

  public ArrayList<CardPlayer> getPlayers() {
    return players;
  }

  public int getNumberOfPlayers() {
    return numberOfPlayers;
  }

  public int getCurrentPlayer() {
    return currentPlayer;
  }

  public CardPlayer getPlayer(int i) {
    return players.get(i);
  }

  public void setDeckOfCards(Deck deck) {
    deckOfCards = deck;
  }

  public void setNameOfGame(String name) {
    nameOfGame = name;
  }

  public void setPlayers(ArrayList<CardPlayer> p) {
    players = p;
  }

  public void setNumberOfPlayers(int num) {
    numberOfPlayers = num;
  }

  public void setCurrentPlayer(int current) {
    currentPlayer = current;
  }

  public void deal(int num, int index) {
    for(int i = 0; i < num; i++) {
      players.get(index).getHand().add(deckOfCards.dealTopCard());
    }
  }

  public void playGame() {
    Card toC = new Card("2", "clubs", 2);
        ArrayList<Card> game = new ArrayList<Card>();
        
        for (int i = 0; i < players.size() - 1; i++) {
            if (players.get(i).getHand().indexOf(toC) < 0) {
                currentPlayer = i;
                break;
            }
        }

        for (int i = 0; i < 13; i++) {
            ArrayList<Card> round = new ArrayList<Card>();

            for (int x = 0; x < players.size() - 1; x++) {
                round.add(players.get(currentPlayer).chooseCard(round, game));
                if (currentPlayer == players.size() - 1) {
                    currentPlayer = 0;
                } else {
                    currentPlayer++;
                }
            }

            Card firstCard = round.get(0);
            int highIndex = 0;
            for (int k = 0; k < round.size(); k++) {
                if (round.get(k).getSuit().equals(firstCard.getSuit()) && round.get(k).getValue() > round.get(highIndex).getValue()) {
                    highIndex = k;
                }
            }

            int index = (highIndex + currentPlayer) % players.size();
            players.get(index).getTakenCards().addAll(round);
            game.addAll(round);
            currentPlayer = index;
        }

        for (int i = 0; i < players.size(); i++) {
            int score = 0;
            for (Card card : players.get(i).getTakenCards()) {
                if (card.getSuit() == "hearts") {
                    score++;
                } else if (card.getSuit() == "spades" && card.getValue() == 12) {
                    score += 13;
                }
            }
            players.get(i).setScore(score);
        }
  }


  public String toString() {
    return nameOfGame + " " + players + " " + deckOfCards;
  }

}