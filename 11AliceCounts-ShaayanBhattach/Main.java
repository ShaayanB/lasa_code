// add import statements
import java.util.Scanner;
import java.io.*;

// create class AliceCount (For REPL.IT this class would be "Main")
public class Main{


	// create main method - remember to throw the exception
	public static void main(String[] args) throws FileNotFoundException{
	
		// instantiate Scanner object using text file "alice.txt".
    Scanner in = new Scanner(new File("alice.txt"));
		
		// instatiate PrintWriter with output file name
    PrintWriter out = new PrintWriter(new FileOutputStream("alice_output.txt"));
		
		// create variable to track the number of words in the text
    int numOfWords = 0;
		
		// create variable to track each of the letters
    int trackE = 0;
    int trackT = 0;
    int trackA = 0;
    int trackO = 0;
    int trackI = 0;
		
		// loop through the file		
    while (in.hasNextLine()){
		
			// read in the word one at a time
      String word = in.next();
			//System.out.println(word);
			// increment the word counter
      numOfWords++;
      
      boolean isThereLetter = false;

			// check to see if the letter occurs in the word
      if (word.toUpperCase().indexOf("E") != -1){
        isThereLetter = true;
        trackE++;
      }
        
      if (word.toUpperCase().indexOf("T")!=-1){
        trackT++;
        isThereLetter = true;
      }

      if (word.toUpperCase().indexOf("A")!=-1){
        trackA++;
        isThereLetter = true;
      }

      if (word.toUpperCase().indexOf("O")!=-1){
        trackO++;
        isThereLetter = true;
      }

      if (word.toUpperCase().indexOf("I")!=-1){
        trackI++;
        isThereLetter = true;
      }
			
		// increment the letter counter
   	// write the word to the output file
    if (isThereLetter)
        out.write(word.replaceAll("[^a-zA-Z---]","") +"\n");
    }
		// calculate the percentage of words containing the character
    System.out.println("Words with the letter 'e' = " + trackE);
		System.out.println("Total number of Words = " + numOfWords);

    System.out.println("Percentage of words containing the letter 'e' is " + Math.round((double)trackE/(double)numOfWords *100.0 * 100.0)/100.0 +  "%");

    System.out.println("Percentage of words containing the letter 't' is " + Math.round((double)trackT/(double)numOfWords *100.0 *  100.0)/100.0 +  "%");

    System.out.println("Percentage of words containing the letter 'a' is " + Math.round((double)trackA/(double)numOfWords * 100.0 * 100.0)/100.0 + "%");

    System.out.println("Percentage of words containing the letter 'o' is " + Math.round((double)trackO/(double)numOfWords * 100.0 * 100.0)/100.0 + "%");

    System.out.println("Percentage of words containing the letter 'i' is " + Math.round((double)trackI/(double)numOfWords *100.0 *  100.0)/100.0 + "%");
		
		
		//  close the files
    out.close();
    in.close();
  }
}