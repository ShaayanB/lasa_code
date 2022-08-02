// name:  
// purpose: demonstrate further method prowess

public class Invoke 
{
   // method piggyBank(): returns what the change is worth in cents
   public static int piggyBank(int p, int n, int d, int q, int h){
     int total = (p + (n * 5) + (d * 10) + (q * 25) + (h * 50));
     return(total); 
   }
	
   public static int mp3Sizer(int songs, int videos, int photos){
     int total =(int)Math.ceil(((songs * 3.04) + (videos * 89.3) + (photos * 1.72))/1000.0);
     return(total); 
   }
	 // method mp3Sizer(): estimates the number of gB needed to store media
	
}