/***
* QuadraticResult
* Class defining an object that contains the 

* result of the calculation.
*
*/

  public class QuadraticResult{
    boolean real;
    int roots;
    double firstResult;
    double secondResult;
    public void setIsReal (boolean isReallyReal){
    real = isReallyReal;
    }
    public void setRoot (int NumOfRoots){
    roots = NumOfRoots;
    }
    public void setFirst (double doub1){
    firstResult = doub1;
    }
    public void setSecond (double doub2){
    secondResult = doub2;
    }

    public boolean getReal(){
    return real;
    }

    public int getRoots (){
    return roots;
    }

    public double getFirst(){
    return firstResult;
    }

    public double getSecond(){
    return secondResult;
    }
    /***
    * Print if:
    equation " has not been solved yet!!!"
    Or, equation + "real root " + result
    Or, equation + "real root1 " + result
    Or, equation + "real root2 " + result
    Or, equation + "imaginary root1 " + result + "i"
    Or, equation + "imaginary root2 " + result "i"

    */
   
}