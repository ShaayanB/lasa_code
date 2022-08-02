
// See BLEND page for instructions

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
               // instantiate a Scanner object
        Scanner in = new Scanner(System.in);
        // prompt the user for the text to encrypt
        System.out.println("Enter text to encrypt:");
        // assign user input to a variable
        String plainText = in.nextLine();
        // prompt the user for a keyword to use
        System.out.println("Enter your keyword:");
        // assign user input to a variable
        String key = in.nextLine();
        System.out.println("plain Text     = " + plainText);
        System.out.println("key            = " + key);

        // instantitate a Vigenere object and pass in the user input
        Vigenere vigenere = new Vigenere(plainText, key);
        String encr = vigenere.encrypt();
        String decr = vigenere.decrypt(encr);
        System.out.println("encrypted Text = " + encr);
        
        // check the equals() method
        Vigenere v2 = new Vigenere();
        v2.setPlainText(plainText);
        v2.setKey(key);
        System.out.println("Messages & Keys same = " + vigenere.equals(v2));
        Vigenere v3 = new Vigenere();
        v3.setPlainText(plainText);
        v3.setKey("QWERTY");
        System.out.println("Messages & Keys same = " + vigenere.equals(v3));
        Vigenere v4 = new Vigenere();
        v4.setPlainText("QWERTY");
        v4.setKey(key);
        System.out.println("Messages & Keys same = " + vigenere.equals(v4));
    }
}



