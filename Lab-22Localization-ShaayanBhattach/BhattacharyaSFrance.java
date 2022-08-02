public class BhattacharyaSFrance extends AbstractLocale{
  public BhattacharyaSFrance(){
    super("France","French");
  }
  public String getGreeting(){
    return "Bonjour";
  }

  public String getCurrencySymbol(){
    return "F";
  }
  public double getCurrencyValue(double c){
    return c*1.0;
  }
  
}