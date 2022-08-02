public class Main {

    public static void main(String[] args) {
      int x = 27;
      
      System.out.println("x = " + x);
    
      x = x + 1;
      System.out.println("x = " + (x + 1));

      System.out.println("x = " + x);


      
      
      x = 2147483647;
      System.out.println("x = " + x);

      x = x + 1;
      System.out.println("x = " + (x + 1));

      System.out.println("x = " + x);

      System.out.println(Integer.MAX_VALUE);

      System.out.println(Integer.MIN_VALUE);

      double y = 6.2;
      System.out.println("y = " + y);
      y = 27;
      System.out.println("y = " + y);

      char a = '$';
      System.out.println("a = " + a);
      a = '\'';
      System.out.println("a =" + a);
      
      String b = "Hello";
      String c = "World";

     
      final float DAYS_PER_WEEK = 7;
      final float days = 212;
      System.out.println(days + "days is " + days / DAYS_PER_WEEK);

      int e = 6;
      int f = 27;
      System.out.println(e + "+" + f + "=" + (e+f) + " (not 627)");

      double g = 5.8 * 2;
      double h = 2.5;
      System.out.println("integer part of g / h = " + (int)(g/h));


    }
}
