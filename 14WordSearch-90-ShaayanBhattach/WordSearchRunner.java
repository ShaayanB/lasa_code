import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

 public class WordSearchRunner {
	public static void wsMain(String fileName) throws FileNotFoundException
	{
    Scanner scan = new Scanner(new File(fileName));
    int row_len_word = scan.nextInt();
    int column_len_word = scan.nextInt();
    scan.nextLine();
    char [] [] words = new char[row_len_word][column_len_word];


    for(int rowFor = 0; rowFor < row_len_word; rowFor++){
      for(int columnFor = 0; columnFor < column_len_word; columnFor++){ 
        words[rowFor][columnFor] = scan.next().charAt(0);
      }
    System.out.println(words[13][13]);
    }

  scan.nextLine();  
  int max = scan.nextInt();
  scan.nextLine();
  String[] search_words = new String[max];
  for(int x = 0; x < max; x++){
    String word = scan.nextLine();
    search_words[x] = word;
  }

    String[] word_row_forward = new String[row_len_word];

    for(int rowI = 0; rowI < row_len_word; rowI++){
      String name = "";
      for(int columnI = 0; columnI < column_len_word; columnI++){
          name = name + words[rowI][columnI];
        }
        word_row_forward[rowI] = name;
      }
    for(int i = 0; i < search_words.length; i++){
      for(int z = 0; z < word_row_forward.length; z++){
        if(word_row_forward[z].indexOf(search_words[i]) != -1){
          System.out.println(word_row_forward[z] + "true");
        }
      }
    }
  

    // String[] word_row_backward = new String[row_len_word];
    // for (int backrowI = 0; backrowI < row_len_word; backrowI++){
    //   String nameback = "";
    //   for(int backcolumnI = column_len_word - 1; backcolumnI >= 0; backcolumnI--){
    //     nameback = nameback + words[backrowI][backcolumnI]; 
    //   }
    //   word_row_backward[backrowI] = nameback;
    // }

    // System.out.println(Arrays.toString(word_row_backward));

    // String[] word_column_forward = new String[column_len_word];
    // for (int forwardColumnI = 0; forwardColumnI < column_len_word; forwardColumnI++){
    //   String nameColumnFor = "";
    //   for(int forwardRowI = 0; forwardRowI < row_len_word; forwardRowI++){
    //     nameColumnFor = nameColumnFor + words[forwardRowI][forwardColumnI];
    //   }
    //   word_column_forward[forwardColumnI] = nameColumnFor;
    // }
    
    // System.out.println(Arrays.toString(word_column_forward));

    // String[] word_column_backward = new String[column_len_word];
    // for (int backColumnI = 0; backColumnI < column_len_word; backColumnI++){
    //   String nameColumnFor = "";
    //   for(int backRowI = row_len_word - 1; backRowI >= 0; backRowI--){
    //     nameColumnFor = nameColumnFor + words[backRowI][backColumnI];
    //   }
    //   word_column_backward[backColumnI] = nameColumnFor;
    // }

    // System.out.println(Arrays.toString(word_column_backward)); 
    

		// instantiate Scanner object to read in from file
		
		// read in rows
		
		// read in columns
		
		// instantiate WordSearch object passing in number of rows & columns for 2D array
		
		// loop through the rows in the file
		
			// loop through the columns in the file
			
				// read in value from file using local variable
				
				// pass row, column, and value into the 2D array
				
		// read number of words to search for from file
		
		// loops through the words
		
			// read in word from file
			
			// method call to search for the word in the 2D array
			
			// print out word to search for and true/false
			
	}
}