public class LogMessage
{
  private String machineId;
  private String description;


  public LogMessage(String message)
  {
    /* to be implemented in part (a) */
    int colon = message.indexOf(":");
    machineId = message.substring(0,colon);
    description = message.substring(colon + 1);
  }

  /* Part (b) */

  public boolean containsWord(String keyword)
  {
      /* to be implemented in part (b) */
    if(description.equals(keyword)){
      return(true);
    }
    if(description.indexOf(" " + keyword + " ") != -1){
      return(true);
    }
    if(description.indexOf(keyword + " ") == 0){
      return(true);
    }
    if(description.length() > keyword.length()){
      if((description.substring(description.length() - keyword.length() - 1).equals(" " + keyword))){
        return true;
      }
      
    }
    
  return false;
}



  public String getMachineId()
  { return machineId; }

  public String getDescription()
  { return description; }

  public String toString()
  {
    return getMachineId() + ":" + getDescription();
  }
}
