import java.util.ArrayList;
public class RandomStringChooser{

  public ArrayList<String>array = new ArrayList<String>();
  int count = 0;
  public RandomStringChooser(String[] letter){
    for(String x:letter){
      array.add(x);
    }
  }

  
  public String getNext(){
    if(array.size() > 0){
      return(array.remove((int)(Math.random() * array.size())));
    }
    else{
      return("NONE");
    }
  }
  
}
/* Part (a) */
