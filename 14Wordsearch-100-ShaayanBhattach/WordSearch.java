import java.util.Arrays;

public class WordSearch
{
	/** 2D array instance variable
     You CANNOT add any additional instance variables */
    char[][] words;
    int num_rows;
    int num_columns;

    /** constructor used to set the number of rows and columns in the 2D array
     * @param row
     * @param col*/
    public WordSearch( char[][] initwords,int row, int col)
    {
        words = initwords;
        num_rows = row;
        num_columns = col;
    }

    /** method to set an element in the 2D array
     * @param s which is the value to store in the 2D array
     * @param row the row to use
     * @param col the column to use*/
    public void setSpot(String s, int row, int col)
    {
        words[row][col] = s.charAt(0);
    }

    /** methods to check for the word in the 2D array
     * @param word the word to search for
     * @return return true or false*/
    public boolean inGrid(String word)
    {
       boolean overallResult = false;
        for (int i = 0; i < num_rows; i++) {
            for (int j = 0; j < num_columns; j++) {
                if (findInGrid(i, j, word)) {
                    overallResult = true;
                    break;
                }
            }
        }
        return overallResult;
    }

    /**
     * Searches for word in the grid
     * @param row_index
     * @param col_index
     * @param word
     * @return
     */
    boolean findInGrid(int row_index, int col_index, String word)
    {
        boolean result = false;

        // For searching in all 8 direction
        int[] rowDirection = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] columnDirection = { -1, 0, 1, -1, 1, -1, 0, 1 };

        // if the first character of word doesn't match, it's false
        if (words[row_index][col_index] != word.charAt(0))
            return false;

        int len = word.length();

        // Search word in all 8 directions starting from (row_index, col_index)
        for (int dir = 0; dir < 8; dir++) {

            // Initialize starting point for current direction
            int val;
            int rowDir = row_index + rowDirection[dir];
            int colDir = col_index + columnDirection[dir];

            // match remaining characters
            for (val = 1; val < len; val++) {

                // If outside range break
                if (rowDir >= num_rows || rowDir < 0 || colDir >= num_columns || colDir < 0)
                    break;
                // If not matched, break
                if (words[rowDir][colDir] != word.charAt(val))
                    break;
                // Moving in some direction
                rowDir += rowDirection[dir];
                colDir += columnDirection[dir];
            }

            // If all character matched, then value of must be equal to length of word
            if (val == len)
                result=true;
        }
        return result;
    }

    /** toString method
     * @return String containing all elements in the 2D array_directions*/
    public String toString()
    {
        String s = "[";
        for(int i =0; i < words.length; i++) {
            if(i == 0)
                s += Arrays.toString(words[i]).replace(",","") + '\n'; //first row don't add space
            else if(i == (words.length-1))
                s += " "+ Arrays.toString(words[i]).replace(",","");  //last row don't add \n
            else
                s += " " +Arrays.toString(words[i]).replace(",","") + "\n";
        }

        s += "]";
        return (s);
    }
}