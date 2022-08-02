public class Book{
  private String bookName;
  private int bookISBN;
  //private because you dont want outside classes to access the variables. No default values are assigned through the constructor.
  public Book(){
    bookName = "";
    bookISBN = 0;

  }
  public Book(String initBookName, int initBookISBN){
    bookName = initBookName;
    bookISBN = initBookISBN;


  }
  public void setBookName(String name){
    bookName = name;

  }
  public String getBookName(){
    return(bookName);
  }
  public void setBookISBN(int isbn){
    bookISBN = isbn;
  }
  public int getBookISBN(){
    return(bookISBN);
  }
  public String toString(){
    return(bookName + " " + String.valueOf(bookISBN));
  }
}
