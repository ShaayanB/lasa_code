public class GCD
{
	//instance variables - DO NOT ADD ANY MORE INSTANCE VARIABLES
	private int numerator;
	private int denominator;
	
	//default constructor
	public GCD(){
    numerator = 0;
    denominator = 0;
  }
	
	//initialization constructor
	public GCD(int initnum, int initdem){
    numerator = initnum;
    denominator = initdem;
  
  }
	
	//modifier method for numerator
	public void changeNum(int numChange){
    numerator = numChange;
  }
	
	//modifier method for denominator
	public void changeDem(int demChange){
    denominator = demChange;
  }
	
	//accessor method for numerator
	public int getNum(){
    return(numerator);
  }
	
	//accessor method for denominator
	public int getDem(){
    return(denominator);
  }
	
	//method to determine gcd
	public int findGCD(){
    int result = numerator;
    if (numerator >= denominator)
      result = denominator;
    while(!(numerator % result == 0 && denominator % result == 0)){
      result--;
      }
    return(result);
    }      
    
  
	
	//method to determine lowest term of numerator
	public int lowestNum(){
    int num = numerator/findGCD();
    return(num);
  }
	
	//method to determine lowest term of denominator
	public int lowestDem(){
    int dem = denominator/findGCD();
    return(dem);
  } 
	
	//toString() method (only return the GCD value)
	public String toString(){
    return("The GCD is: " + findGCD());
  }
}