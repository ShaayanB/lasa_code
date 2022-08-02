public class Quadratic
{

  public static int realRoots, imaginaryRoots;
   // instance variables - replace the example below with your own
   private double a;
   private double b;
   private double c;
   private QuadraticResult result;

   public Quadratic()
   {
      // initialise instance variables
      a = 0.0;
      b = 0.0;
      c = 0.0;
      result = null;
   }

  // Initializing Constructor
  // Result is set to default

   public Quadratic(double initA, double initB, double initC) {
       a = initA;
       b = initB;
       c = initC;
       result = null;
   } 

   public void solve()
   {
       result = new QuadraticResult();
       if ((Math.pow(b,2)) - 4*a*c > 0){
      result.setIsReal(true);
      result.setRoot(2);
      result.setFirst ((-1*b + (Math.sqrt(Math.pow(b,2)-4*a*c)))/(a*2));
      result.setSecond((-1*b - (Math.sqrt(Math.pow(b,2)-4*a*c)))/(a*2));
      realRoots++;
       }
      else if ((Math.pow(b,2)) - 4*a*c == 0){
    
        result.setIsReal(true);
        result.setRoot(1);
        result.setSecond((-1*b)/(2*a));
        realRoots++;
      }
      else{
        result.setIsReal(false);
        result.setRoot(2);
        result.setFirst((-1*b)/(2 * a));
        result.setSecond (Math.sqrt(Math.abs(Math.pow(b,2)-4*a*c))/(a*2));
        imaginaryRoots++;
      }

   }

    /***
     if:
    equation " has not been solved yet!!!"
    Or, equation + "real root " + result
    Or, equation + "real root1 " + result
    Or, equation + "real root2 " + result
    Or, equation + "imaginary root1 " + result + "i"
    Or, equation + "imaginary root2 " + result "i"

*/

   public String toString() {
    if (result == null)
    return "" + a + "x^2" + " + " + b + "x " + "+ "+ c + " has not been solved yet!!!" ;
    if (result.real){
    if (result.roots > 1)
    return "" + a + "x^2" + " + " + b + "x " + "+ "+ c + " real root1 " + result.firstResult + " real root2 " + result.secondResult;
    else 
    return "" + a + "x^2" + " + " + b + "x " + "+ "+ c + " real root " + result.secondResult;
    }
    else
    return "" + a + "x^2" + " + " + b + "x " + "+ "+ c + " imaginary root1 " + result.firstResult + "+" + result.secondResult + "i " + "imaginary root2 " + result.firstResult + "-" + result.secondResult + "i";
}
}
