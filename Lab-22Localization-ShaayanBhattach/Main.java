import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import  java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    ArrayList<AbstractLocale> locales = getLocales();
    // Your code goes here.
    System.out.println(locales);
    Scanner scan = new Scanner(System.in);
    for(int i = 0;i<locales.size();i++){
    
      System.out.println((i+1)+". "+locales.get(i).getLocation()+" ("+locales.get(i).getLanguage()+")");

    }
    int l = 0;
    System.out.println("What locale do you want?");
    String selected = scan.nextLine();
       for(int j = 0;j<locales.size();j++){
      if(selected.equals(locales.get(j).getLocation())){
        System.out.println(locales.get(j).getGreeting());
        l = j;
      }
    }
System.out.println("What is the current hour?");
    int hour = scan.nextInt();
    System.out.println("What is the current minutes?");
    int minutes = scan.nextInt();
    System.out.println("The local time is: "+(locales.get(l).getLocalTime(hour,minutes)));
    System.out.println("How much money do you have in your wallet or purse");
    double money = scan.nextDouble();
    System.out.println("In " +locales.get(l).getLocation()+", that's worth: "+locales.get(l).getCurrencySymbol()+locales.get(l).getCurrencyValue(money));
    
  }

  /**
   * DO NOT MODIFY THIS METHOD.
   * Scans the directory of your .java file for all implementations of
   * AbstractLocale, instantiates them and puts them in an ArrayList.
   * @return the list of locale implementations.
   */
  public static ArrayList<AbstractLocale> getLocales() {
    ArrayList<AbstractLocale> locales = new ArrayList<AbstractLocale>();
    File pwd = new File(
        ClassLoader.getSystemClassLoader().getResource("").getPath());
    File[] classFiles = pwd.listFiles(new FilenameFilter() {
        public boolean accept(File dir, String name) {
          return name.endsWith(".class");
        }});
    for(File f : classFiles) {
      String className = f.getName().replace(".class", "");
      try {
        Class<?> c = Class.forName(className);
        if (!c.getName().equals("AbstractLocale")) {
          Object obj = c.newInstance();
          if (obj instanceof AbstractLocale)
            locales.add((AbstractLocale)obj);
        }
      } catch (ClassNotFoundException e) {
        System.err.println("Class not found: " + className);
      } catch (InstantiationException e) {
        System.err.println("Error instantiating the object: " + className);
      } catch (IllegalAccessException e) {
        System.err.println("Invalid method access for " + className);
      }
    }
    return locales;
  }
}
