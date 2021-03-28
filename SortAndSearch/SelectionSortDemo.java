package SortAndSearch;

import java.util.Arrays;

public class SelectionSortDemo {

  /* Selection Sort - "search-and-swap" *video

    Select the smallest item from the current location on to the end of the array and swap it with the value at the current position. 
    Do this from index 0 to the array length - 2. 
    You don’t have to process the last element in the array, it will already be sorted when you compare the prior element to the last element.

   * Read 7.6
   */

  /*  selection sort visualization

      0   1   2   3   4   <-- index
      10  5   3   7   2   <-- elements in the array
      i                   <-- outer loop  
          j               <-- inner loop  

    temp = 
    
  */

  // selection sort demo - Java Tutor visualiation
  public static void selectionSort(int[] arr) {
    // outer loop index i starts from index 0 to the array length - 2
    for (int i = 0; i < arr.length - 1; i++) {

      int minIndex = i; // set a min value

      // inner loop index j starts at the outer loop index i + 1, tracking the smallest element
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }

      // swaps the value   
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp; 

      //swap(arr, minIndex, i);

    }
  }

  // utility method for swap
  /*
  private static void swap(int[] arr, int i, int minIndex) {
    int temp = arr[i];
    arr[i] = arr[minIndex];
    arr[minIndex] = temp;
  }
  */
  
  public static void main(String[] args) {
    int[] nums = { 10,5,3,7,2 };
    System.out.println(Arrays.toString(nums));
    selectionSort(nums);
    System.out.println(Arrays.toString(nums));
  }
  
}
