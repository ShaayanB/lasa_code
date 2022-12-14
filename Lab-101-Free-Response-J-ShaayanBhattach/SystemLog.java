import java.util.List;
import java.util.ArrayList;

public class SystemLog
{
  private List<LogMessage> messageList;

  public SystemLog(String[] messages)
  {
    messageList = new ArrayList<LogMessage>();
    for (String s : messages)
      messageList.add(new LogMessage(s));
  }

  /* Part (c) */

  public List<LogMessage> removeMessages(String keyword)
  {
      /* to be implemented in part (c) */
    ArrayList<LogMessage> rem = new ArrayList<LogMessage>();

    for(int x = 0; x < messageList.size();x++){
      if(messageList.get(x).containsWord(keyword)){
        rem.add(messageList.remove(x));
        x--;
      }
    }
  return(rem);
    
  }

  public String toString()
  {
    String s = "";
    for (LogMessage msg : messageList)
      s += msg + "\n";
    return s;
  }

}
