public class Main        
{ 
// method main():   program starting point
public static void main( String[] args    ) 
   {
      System.out.println("Running main() in Tasking class!\n");
      System.out.println("Trying mission()");
      mission();       //: The Liberal Arts and Science Academy cultivates ...
      System.out.println();
      System.out.println("Trying favorite()");
      int nbr1 = Task.favorite();     //: nbr1 = 1112
      int nbr2 = Task.favorite();     //: nbr2 = 1112
      System.out.println("nbr1=" + nbr1);
      System.out.println("nbr2=" + nbr2);

      System.out.println();
      System.out.println("Trying wasted()");
      double dpm = 3.75;
      int days = 30;
      Task.wasted( dpm, days );  // 11 gallons
      Task.wasted( 7.50,  5 );   // 4 gallons
      
      System.out.println();
      System.out.println("Trying count()");
      int count1 = Task.count( 1.5, 0.9, 500 );   //: 438 beans
      int count2 = Task.count( 2.0, 1.0,  25 );   //: 13 beans\

      System.out.println("Task.count(1.5,0.9,500): "+ count1 + " beans");
      System.out.println("Task.count(2.0,1.0,25): " + count2 +  " beans");
         
   }
   
   // Local declaration of mission() method
   //method mission(): prints 1st sentence of the mission statement of LASA
	public static void mission() 
	{
		System.out.println("The Liberal Arts and Science Academy cultivates responsible leaders, problem solvers, and thinkers by offering a nationally recognized, rigorous, innovative, evolving curriculum.");
	}
   
}