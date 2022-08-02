import java.util.Arrays;
public class QuickSort{
  
    public static String[] sort(String[] array) {
      // * * * * * * * *
      // Your Code Here
      // * * * * * * * *
        return quickSort(array, 0, array.length - 1);
        
    }
    private static String[] quickSort(String[] array, int start, int end){
        if(start >= end){
            return array;
        }
        int newStart = partitionSort(array, start, end);
        quickSort(array, start, newStart - 1);
        quickSort(array, newStart + 1, end);
        return array;
    }
    
    private static int partitionSort(String[] array, int start, int end){
        int mid = (start + end)/2;
        int pivot = end;
        int j = start;
        if(array[mid].compareTo(array[start]) < 0){
            String temp = array[start];
            array[start] = array[mid];
            array[mid] = temp;
        }
        
        else if(array[end].compareTo(array[start]) < 0){
            String temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }

        else if(array[mid].compareTo(array[end]) < 0){
            String temp = array[end];
            array[end] = array[mid];
            array[mid] = temp;
        }
            
        
        while(pivot > j){
            if(array[j].compareTo(array[pivot]) > 0){
                String temp = array[pivot];
                array[pivot] = array[j];
                pivot--;
                array[j] = array[pivot];
                array[pivot] = temp;
            }
            else {
                j++;
            }
            
        }
        return pivot;
    }
}