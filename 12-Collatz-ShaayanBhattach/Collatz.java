// If you are doing this correctly your code should not be more then 125 lines
// (including comments & blank lines separating the methods).
public class Collatz {
	 // instance variables (aka members, fields)
    private int startNum;
    private int[] SequenceList = null;

    // default constructor
    public Collatz(){
        startNum = 1;
        SequenceList = sequence();
    }
    // initialization constructor
    //initialization constructor
    public Collatz(int initStartNum){
        startNum = initStartNum;
        SequenceList = sequence();
    }
    // Add a method called steps() that returns the number of steps
    // that are required for the starting number to reach 1.
    public int steps()
    {
        int step =0;
        if(startNum != 1) {
            int tempStart = startNum;
            while (tempStart != 1) {
                if (tempStart % 2 == 0) {
                    tempStart = tempStart / 2;
                } else
                    tempStart = tempStart * 3 + 1;
                step++;
            }
        }
        return (step + 1);
    }
    // Add a method called sequence() that returns an array of the sequence of
    // numbers from the starting number to 1. Use your steps() function to
    // determine how the size of your array.
    public int[] sequence(){
        int[] sequence = new int[steps()];
        int tempStart = startNum;
        sequence[0] = startNum;
        int index =1;
        while (tempStart != 1) {
            if (tempStart % 2 == 0) {
                tempStart = tempStart / 2;
            } else
                tempStart = tempStart * 3 + 1;
            sequence[index] = tempStart;
            index++;
        }
        return(sequence);
    }
    // Add a method called maxValue() that returns the maximum value in the sequence.
    // Iterate through the values returned by a call to sequence().
    public int maxValue(){
        int max = Integer.MIN_VALUE;
        for(int x : SequenceList) {
            if (x > max)
                max =x;
        }
        return(max);
    }
    // A method called minOddValue() that returns the minimum value of all the odd numbers,
    // except for 1, in the sequence. Iterate through the values returned by a call to sequence().
    public int minOddValue(){
        int minOdd = Integer.MAX_VALUE;
        for(int x : SequenceList) {
            if (x%2 != 0 && x != 1) { //odd
                if(x < minOdd){
                    minOdd = x;
                }
            }
        }
        if (minOdd == Integer.MAX_VALUE) //take care of 1
            minOdd = 1;
        return(minOdd);
    }
    // Add a method called oddValues() that returns an array of all the odd numbers in the sequence.
    // Iterate through the values returned by a call to sequence().
    public int[] oddValues(){

        //find the number of odds
        int number_of_odd = 0;
        for(int x : SequenceList) {
            if (x%2 != 0) { //odd
                number_of_odd++;
            }
        }
        int[] oddValues = new int[number_of_odd];
        int index =0;
        for(int x : SequenceList) {
            if (x%2 != 0) { //odd
                oddValues[index] = x;
                index++;
            }
        }
        return(oddValues);
    }
    // Add a method called sumValues() that returns the sum of all the values in the sequence.
    // Iterate through the values returned by a call to sequence().
    public int sumValues(){
        int sum = 0;
        for(int x:SequenceList){
            sum = sum + x;
        }
        return(sum);
    }

    // Add a toString() method that returns ...    Starting number # takes # steps
    public String toString(){
        return("Starting Number " + String.valueOf(startNum) + " takes " + String.valueOf(steps()) + " steps");
    }
   
}

