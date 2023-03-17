package Sorting;
import java.util.Arrays;
public class InsertionSort{
static void insertionSort(int []arr, int n) 
{ 
   for ( int i = 1; i < n; i++) 
   { 
       int key = arr[i]; 
       int j = i-1; 
  
       // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position 
       while ( j >= 0 && arr[j] > key) 
       { 
           arr[j+1] = arr[j]; 
           j = j-1; 
       } 
       arr[j+1] = key; 
   
    }
}
    public static void main(String[] args) {
        int[]arr={5,4,6,3,2};
        int n =arr.length;
        System.out.println(arr);
        System.out.println("Array before sorting: " + Arrays.toString(arr));

        
        insertionSort(arr, n);
        

        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
