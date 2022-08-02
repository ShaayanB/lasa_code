import java.util.*;
public class DIYsort{
/** DIYsort Class
  *  Contains student written sort routines
  */

  
/** selectionSort - Selection sort for primitive array
*  @param int[] array to sort 
*   @param boolean Direction to sort (ascending == true or descending == false).
* @return void
* When the method is complete the array is in sorted order
  */

public void selectionSort(int[]array, boolean t){
  int size = array.length;

  if(t){
    for (int i = 0; i < array.length - 1; i++)  
        {  
          int index = i;  
          for (int j = i + 1; j < array.length; j++){  
            if (array[j] < array[index]){  
              index = j;  
                }  
            }  
            int SN = array[index];   
            array[index] = array[i];  
            array[i] = SN;  
        }  
    }  
  else{
  int len = array.length;
  for (int i = 0 ;i< len-1; i++){
    int min = i;
    for (int j = i+1; j< len; j++){
      if (array[j] > array[min]){
        min = j;
}
}
int temp = array[min];
array[min] = array[i];
array[i] = temp;
} 
  }
}

/** selectionSort - Selection sort for arrayList
*  @param arrayList<Integer> to sort 
*   @param boolean Direction to sort (ascending == true or descending == false).
* @return void
* When the method is complete the array list is in sorted order
  */

 public static void selectionSort(ArrayList<Integer> arr, boolean b) {
    if(b) {
      int s = arr.size();
      for(int i = 0; i < s; i++) {
        int minI = i;
        for(int x = i+1; x < s; x++) {
          if(arr.get(x) < arr.get(minI))
            minI = x;
        }
        int temp = arr.get(i);
        arr.set(i, arr.get(minI));
        arr.set(minI, temp);
      }
    }
    else {
      int s = arr.size();
      for(int i = s - 1; i >= 0; i--) {
        int minI = i;
        for(int x = i-1; x >= 0; x--) {
          if(arr.get(x) < arr.get(minI))
            minI = x;
        }
        int temp = arr.get(i);
        arr.set(i, arr.get(minI));
        arr.set(minI, temp);
      }
    }
  }


/** bubbleSort - Bubble sort for primitive array
*  @param int[] array to sort 
*   @param boolean Direction to sort (ascending == true or descending == false).
* @return void
* When the method is complete the array is in sorted order
  */

public static void bubbleSort(int[] array, boolean z){
  int size = array.length;
  if(z){
    for(int i = 0;i < size-1; i++){
    boolean swap = false;
    for(int j = 0; j < size-i-1; j++){
      if(array[j] > array[j + 1] ) {
    		int temp = array[j];
    		array[j] = array[j + 1];
    		array[j + 1] = temp;		swap = true;
	}
}
}    
}
  else{
    int n = array.length;
 int temp = 0;
 
 for(int i=0; i < n; i++){
 for(int j=1; j < (n-i); j++){
 
 if(array[j-1] < array[j]){
 temp = array[j-1];
 array[j-1] = array[j];
 array[j] = temp;
 }
 
 }
 }
    
  }
}

  
/** bubbleSort - Bubble sort for arrayList
*  @param arrayList<Integer> to sort 
*   @param boolean Direction to sort (ascending == true or descending == false).
* @return void
* When the method is complete the array list is in sorted order
  */
public static void bubbleSort(ArrayList<Integer> arr, boolean b) {
    int s = arr.size();
    if(b) {
      for(int i = 0; i < s - 1; i++) {
        boolean swap = false;
        for(int x = 0; x < s-i-1; x++) {
    	    if(arr.get(x) > arr.get(x+1)) {
        		int temp = arr.get(x);
        		arr.set(x, arr.get(x+1));
        		arr.set(x+1, temp);
        		swap = true;
        	}
        }
        if (!swap)
          break;
      }
    }
    else {
      for(int i = 0; i < s - 1; i++) {
        boolean swap = false;
        for(int x = 0; x < s-i-1; x++) {
    	    if(arr.get(x) < arr.get(x+1)) {
        		int temp = arr.get(x);
        		arr.set(x, arr.get(x+1));
        		arr.set(x+1, temp);
        		swap = true;
        	}
        }
        if (!swap)
          break;
      } 
    }
  }  
}