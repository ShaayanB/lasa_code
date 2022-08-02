public class InOrder
{
	private int numOne;
	private int numTwo;
	private int numThree;
	
	public InOrder()
	{
		// complete default constructor
    numOne = 0;
    numTwo = 0;
    numThree = 0;
		
	}
	
	public InOrder(int n1, int n2, int n3)
	{
		// complete initialization constructor
    numOne = n1;
    numTwo = n2;
    numThree = n3;
		
	}
	
	public void setNumOne(int n1)
	{
		// complete modifier method for numOne
    numOne = n1;
		
	}
	
	// add modifier method for numTwo
	public void setNumTwo(int n2){
    numTwo = n2;
  }
	// add modifier method for numThree
	public void setNumThree(int n3){
    numThree = n3;
  }
	public int getNumOne()
	{
		// complete accessor method for numOne
    return(numOne);
	}
	
	// add accessor method for numTwo
	public int getNumTwo(){
    return(numTwo);
  }
	// add accessor method for numThree
	public int getNumThree(){
    return(numThree);
  }
	// add method that returns a boolean indicating that the 
	// instance variables are in order or not 
	// i.e. numOne is the smallest, numThree is the largest
	
	// add a VOID method to put the instance variables in order
  // numOne = lowest value, numTwo = middle value, numThree = highest value	
 public boolean isOrder(){
    if ((numOne < numTwo) && (numTwo < numThree))
      return(true);
    else;
      return(false); 
  }
  public String makeInOrder(){
    int low = numOne;
    int mid = numTwo;
    int high = numThree;
    int temp =0;
    if (isOrder() == true)
      return( low + " <= " + mid + " <= " + high + " is\ntrue");
    else{
      if (low > mid){
        temp = low;
        low = mid;
        mid = temp;
      }
      if (low > high){
        temp = low;
        low = high;
        high = temp;
      }
      if (mid > high){
        temp = mid;
        mid = high;
        high = temp;
      }
      return( numOne + " <= " + numTwo + " <= " + numThree + " is\nfalse" + "\nThe correct order is "+ low + " <= " + mid + " <= " + high);
    }
  }
	
	
	public String toString()
	{
		return "numOne = " + numOne + "numTwo = " + numTwo + "numThree = " + numThree;
	}
}

