public class Calculator
{
	//instance variables
	private double num1;
	private double num2;
  private double result;
  private int validOrNot;
	private char operator;
	
	//default constructor
	public Calculator()
	{
		num1 = 0;
		num2 = 0;
		operator = 0;
    validOrNot = 0; 
	}
	
	//inialization constructor
  public Calculator(double initNum1, double initNum2, char initOperator, int initValidOrNot)
  {
    num1 = initNum1;
    num2 = initNum2;
    operator = initOperator;
    validOrNot = initValidOrNot;
    result = 0.0;
  }
	
	//modifier method for num1
	public void setNum1(double n1)
	{
		num1 = n1;
	}
	
	//modifider method for num2
	public void setNum2(double n2)
	{
		num2 = n2;
	}
	
	//modifier method for operator
  public void setOperator(char o)
  {
    operator = o;
  }

	
	//accessor method for num1
	public double getNum1()
	{
		return num1;
	}
	
	//accessor method for num2
	public double getNum2()
	{
		return num2;
	}
	
	//accessor method for operator
	public double getOperator()
	{
		return operator;
  }

	//Create method to calculate the result
 public void calculate()
  {
    if (validOrNot == 1)
    {
      if (operator == '+')
      {
        result = num1 + num2;
      }
      else if (operator == '-')
      {
        result = num1 - num2;
      }
      else if (operator == '*')
      {
        result = num1 * num2;
      }
      else if (operator == '/')
      {
        result = num1 / num2;
      }
    }
  }
  
	
	//Create the toString() method
	public String toString(){
    return ("result = " + result + "\n" + num1 + " " + operator + " " + num2 + " = " + result);
  }
  
}
	

