public class Deal
{
	//instance variables (DO NOT ADD ANY MORE)
	private int prizeLoc;
	private int userGuess;
	
	//constructor
	public Deal()
	{
		setPrizeLoc();
		setUserGuess();
	}
	
	//modifier method for userGuess (should call random number method)
	public void setUserGuess(){
    userGuess = randNumber();
  }
	
	//modifier method for prizeLoc (should call random number method)
	public void setPrizeLoc(){
    prizeLoc = randNumber();
  }
	
	//accessor method for userGuess
	public int accessGuess(){
    return(userGuess);
  }
	
	//accessor method for prizeLoc
	public int accessLoc(){
    return(prizeLoc);
  }
	
	//method to generate random number between 1 & 3
	public int randNumber(){
    int value = 1 + (int)(Math.random() * ((3 - 1) + 1));
    return(value);
  }
	
	//method to reveal the door
	public int doorReveal(){
    int result = 0;
    for (int i = 1; i<=3; i++){
      if (i != userGuess && i != prizeLoc){
        result = i;
        break;
      }
    }
    return(result);
  }
	
	//method to update user's guess
	public int newGuess(){
    int result = 0;
    for (int i = 1; i<=3; i++){
      if (i != userGuess && i != doorReveal()){
        result =i;
        break;
      } 
    }
	return(result);
    
  }
	//toString method
	public String toString()
	{
		return "user guess: " + userGuess + " prizeLoc: " + prizeLoc;
	}
}
