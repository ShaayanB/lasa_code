class StudentId{
  private String studentFirstName;
  private String studentLastName;
  private int studentId;

  public StudentId(){
    studentFirstName = "First";
    studentLastName = "Last";
    studentId = 111111;
  }
  public StudentId(String initFirst, String initLast, int initId){
    studentFirstName = initFirst;
    studentLastName = initLast;
    studentId = initId;
  }
  public String getPassword (){
    
    char first = studentLastName.charAt(0);
    char last = studentLastName.charAt(studentLastName.length() - 1);
    String id = String.valueOf(studentId);
    
    return(first +  id + last);

  }
  public String toString (){
    String name = "Name = " + studentFirstName + " " + studentLastName;
    String identification = " Student ID = " + String.valueOf(studentId);
    //return(name + '\n' + identification);
    return(name + identification);
  }    
  public String getLastName(){
    return(studentLastName);
  }
  public String getFirstName(){
    return(studentFirstName);
  }
  public int getStudentId(){
    return(studentId);
  }
  public void setlastName(String ln){
    studentLastName = ln;
  }
  public void setfirstName(String fn){
    studentFirstName = fn;
  }
  public void setstudentId(int id){
    studentId = id;
  }
}  