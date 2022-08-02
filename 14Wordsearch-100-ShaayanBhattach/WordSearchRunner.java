import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

 public class WordSearchRunner {
	public static void wsMain(String fileName) throws FileNotFoundException{
		
    System.out.println("Starting main");
        // instantiate Scanner object to read in from file
        Scanner scan = new Scanner(new File(fileName));
        // read in rows
        // read in columns
        int totalRows = scan.nextInt();
        int totalColumns = scan.nextInt();
        scan.nextLine();

        char[][] wordGrid = new char[totalRows][totalColumns];

        // loop through the rows in the file
        // loop through the columns in the file
        for(int i =0; i <totalRows; i++){
            for(int j=0; j<totalColumns; j++) {
                wordGrid[i][j] = scan.next().charAt(0);
            }
        }
        // read in value from file using local variable
        // pass row, column, and value into the 2D array
        // read number of words to search for from file
        // loops through the words
        // read in word from file
        scan.nextLine();
        int totalKeywords = scan.nextInt();
        scan.nextLine(); //read one more to end line
        String[] searchWords = new String[totalKeywords] ;
        for(int i =0; i < totalKeywords; i++)
            searchWords[i] = scan.nextLine();
        System.out.println("Done with array");
        System.out.println();
        // instantiate WordSearch object passing in number of rows & columns for 2D array
        WordSearch wordsearch = new WordSearch(wordGrid, totalRows,totalColumns);
        System.out.println(wordsearch.toString());
        System.out.println();
        for(int i =0; i< searchWords.length; i++){
            // method call to search for the word in the 2D array
            // print out word to search for and true/false
            boolean pass = wordsearch.inGrid(searchWords[i]);
            System.out.println(searchWords[i] + " -> " + Boolean.toString(pass));
        }
        scan.close();
			
	}
}