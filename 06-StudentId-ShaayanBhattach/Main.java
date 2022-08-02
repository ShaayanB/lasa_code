class Main {
  public static void main(String[] args) {
    StudentId id1 = new StudentId();
    System.out.println(id1.toString());
    id1.setfirstName("Ada");
    id1.setlastName("Lovelace");
    id1.setstudentId(223344);
    System.out.println(id1.toString());

    StudentId id2 = new StudentId("Buzz","Lightyear",123456);
    System.out.println(id2.toString());
    System.out.println(id2.getFirstName() + " " + id2.getLastName() + " ID = " + id2.getStudentId() + " Password = " + id2.getPassword());

  }
}
