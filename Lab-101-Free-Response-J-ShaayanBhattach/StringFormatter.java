import java.util.List;
import java.util.ArrayList;

public class StringFormatter
{
  /* Part (a) */

  public static int totalLetters(List<String> wordList)
  {
    /* to be implemented in part (a) */
    int t = 0;

    for(String x: wordList){
      t = t + x.length();
    }
    return t;
  }

  /* Part (b) */

  public static int basicGapWidth(List<String> wordList,
                                  int formattedLen)
  {
      /* to be implemented in part (b) */
    return(formattedLen - totalLetters(wordList))/(wordList.size() - 1);
  }
  /***********/
  /* Part (c) */

  public static String format(List<String> wordList, int formattedLen)
  {
      /* to be implemented in part (c) */
    String format = "";
    int gap = basicGapWidth(wordList, formattedLen);
    int remaining = leftoverSpaces(wordList,formattedLen);

    for(int w = 0; w < wordList.size() - 1;w++){
      format = format + wordList.get(w);
    for(int x= 0; x < gap;x++){
      format = format + " ";
      }
    if(remaining > 0){
      format = format + " ";
      remaining--;
      }
    }
    format = format + wordList.get(wordList.size() - 1);
    return format;
  }


  public static int leftoverSpaces(List<String> wordList, int formattedLen){
    return formattedLen - totalLetters(wordList) -
                 basicGapWidth(wordList, formattedLen) * (wordList.size() - 1);
  }


}
