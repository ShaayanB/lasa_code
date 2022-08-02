/*
*
*   Your Player.java
*
*/
public class Player{
  private String name;
  private int score;

public Player(String n,int s){
  this.name = n;
  this.score = s;

}
public String getName(){
  return this.name;
}

public int getScore(){
  return this.score;
}

public void setName(String setN){
  this.name = setN;
}

public void setScore(int setS){
  this.score = setS;
}

public void updateScore(int addToScore){
  this.score = this.score + addToScore;
}

//public String toString(){}
}