class SkyView {
  private double view[][];

  /**
   * Writes data from a telescope in an two dimensional array in a sweeping pattern when a SkyView object is created
   * @param numRows
   * @param numCols
   * @param scanned
   */
  public SkyView(int numRows, int numCols, double[] scanned) {
    /* to be implemented in part (a) */
      int index = 0;
      view = new double[numRows][numCols];
      for(int i = 0; i < view.length; i++){
          int col = numCols - 1;
          for(int x = 0; x < view[0].length; x++){
              if(i % 2 == 1){
                  view[i][col] = scanned[index];
                  col--;
              }
              else{
                  view[i][x] = scanned[index];
              }
              index++;
          }
      }
  }

  /**
   * Returns the average for a rectangle of indexes in view
   * @param startRow
   * @param endRow
   * @param startCol
   * @param endCol
   * @return average
   */
  public double getAverage(int startRow, int startCol, int endRow, int endCol) {
    double sum = 0;
    int count = 0;
      for(int i = startRow; i <= endRow; i++){
          for(int x = startCol; x <= endCol; x++){
              sum += view[i][x];
              count++;
          }
      }
      return (sum/count);
  }

  public double[][] getView() {
    return view;
  }
}