import java.awt.event.InputEvent;
import java.io.*;
import java.util.*;

public class MergeSort {

    /**
     * Sorts the given array in ascending order.
     * DO NOT MODIFY THIS METHOD SIGNATURE.
     *
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    public static String[] sort(String[] array) {
      // * * * * * * * *
      // Your Code Here
      // * * * * * * * *
        if(array.length <= 1){
            return array;
        }
        int m = array.length/2;
        String[] left = new String[m];
        for(int i = 0; i < left.length; i++){
            left[i] = array[i];
        }

        String[] r = new String[array.length - m];
        for(int i = 0; i < r.length; i++){
            r[i] = array[i + m];
        }

        String[] leftSort = sort(left);
        String[] rightSort = sort(r);

        String[] sorted = new String[leftSort.length + rightSort.length];

        int leftIn = 0;
        int rightIn = 0;
        for(int i = 0; i < sorted.length; i++){
            if(rightSort.length <= rightIn){
                sorted[i] = leftSort[leftIn];
                leftIn++;
            }
            else if(leftSort.length <= leftIn){
                sorted[i] = rightSort[rightIn];
                rightIn++;
            }
            else if(leftSort[leftIn].compareTo(rightSort[rightIn]) <= 0){
                sorted[i] = leftSort[leftIn];
                leftIn++;
            }
            else{
                sorted[i] = rightSort[rightIn];
                rightIn++;
            }
        }
        return sorted;
    }



}