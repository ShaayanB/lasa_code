public class Crossword
{
  private Square[][] puzzle;

  /* Part (b) */

  public Crossword(boolean[][] blackSquares)
  {
    /* to be implemented in part (b) */ 
    
    puzzle = new Square[blackSquares.length][blackSquares[0].length];
    int temp = 1;

    for(int x = 0; x < blackSquares.length; x++){
      for(int y = 0; y < blackSquares[0].length; y++){
        if(blackSquares[x][y] == true){
          puzzle[x][y] = new Square(true,0);
        }
        else{
          if(toBeLabeled(x,y,blackSquares)){
            puzzle[x][y]= new Square(false,temp);
            temp++;
            }
          else{
            puzzle[x][y] = new Square(false,0);
          }
          }
        }
      }
  }

  /* Part (a) */

  private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
  {
      /* to be implemented in part (a) */
      return (!(blackSquares[r][c]) && (c == 0 || r == 0 || blackSquares[r-1][c] || blackSquares[r][c-1]));
  }

  public Square getSquare(int r, int c) { return puzzle[r][c]; }
}
