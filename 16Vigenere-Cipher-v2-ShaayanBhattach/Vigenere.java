
/*
/   Vigenere class
/    Implement the class to include the methods exactly
/    as described in the comments.
/   Do not add any additional instance variables
/
*/


class Vigenere
{
  // declare instance variables for text and keyword
    private String plainText;
    private String key;

    // default constructor
    public Vigenere ()
    {
        plainText = "";
        key = "";
    }

    // initialization constructor
    public Vigenere (String theMsg, String theKey)
    {
        plainText = theMsg;
        key = theKey;
    }

    // modifier method for plainText setter
    public void setPlainText(String PT){
        plainText = PT;
    }

    // modifier method for key
    public void setKey(String K){
        key = K;
    }

    // accessor method for plainText getter
    public String getPlainText(){
        return plainText;
    }

    // accessor method for key
    public String getKey(){
        return key;
    }
    // encrypt method
    //   return a String
    //   no parameters
    public String encrypt()
    {
        int NUM_ALPHABETS = 26;
        char[] key_arr = key.toCharArray();
        char[] plaintxt_arr = plainText.toCharArray();

        char[] new_key_arr = new char[plaintxt_arr.length];
        char[] encrypt_arr = new char[plaintxt_arr.length];

        int j =0;
        for (int i = 0; i < plaintxt_arr.length; i++){
            if( j== key_arr.length){
                j =0;
            }
            new_key_arr[i] = key_arr[j];
            j++;
        }

        for(int i = 0; i < plaintxt_arr.length; ++i)
            encrypt_arr[i] = (char) (((plaintxt_arr[i] + new_key_arr[i]) % NUM_ALPHABETS) + 'A');

        String encrypted_msg = String.valueOf(encrypt_arr);

        return(encrypted_msg);
    }
    // decrypt method
    //   return a String
    //   no parameters
    public String decrypt(String encrypt_txt)
    {
        int NUM_ALPHABETS = 26;
        char[] key_arr = key.toCharArray();
        char[] encrypted_arr = encrypt_txt.toCharArray();

        char[] new_key_arr = new char[encrypted_arr.length];
        char[] dectrypted_arr = new char[encrypted_arr.length];

        int j =0;
        for (int i = 0; i < encrypted_arr.length; i++){
            if( j== key_arr.length){
                j =0;
            }
            new_key_arr[i] = key_arr[j];
            j++;
        }
        //dectrypt
        for(int i = 0; i < encrypted_arr.length; ++i)
            dectrypted_arr[i] = (char) (( ((encrypted_arr[i] - new_key_arr[i]) + NUM_ALPHABETS) % NUM_ALPHABETS) + 'A');

        String decrypted_msg = String.valueOf(dectrypted_arr);
        return(decrypted_msg);
    }
    // equals method
    //   return a boolean
    //   Vigenere reference parameter
    public boolean equals(Object obj){
        Vigenere vig = (Vigenere)obj;
        if(vig.plainText == plainText && vig.key == key)
            return(true);
        else
            return(false);
    }
    // toString() method
    public String toString()
    {
        return("plain Text     = " + plainText + "\nkey            = " + key + "\nencrypted Text = " + encrypt());
    } 
}





