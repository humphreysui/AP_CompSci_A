package SortAndSearch;

import java.util.Arrays;

public class InsertionSort {

  /*Insertion Sort - *video

    Insert the next unsorted element in the already sorted part of the array by moving larger values to the right. 
    Start at index 1 and loop through the entire array.

  */

  /*  insertion sort visualization

      0   1   2   3   4   <-- index
      10  5   3   7   2   <-- elements in the array
      3  5   10             <-- sorted part
              i           <-- outer loop - unsorted 
      j                  <-- inner loop - possible index 

    temp = 3
  */

  public static void insertionSort(int[] arr) {
  
    /*   
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i];
      int j = i;
      while (j > 0 && temp < arr[j-1]) // * Conditions are evaluated left to right.
      { 
        arr[j] = arr[j-1];
        j--;
      }
      arr[j] = temp;
    } 
    */

    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > temp) // * Conditions are evaluated left to right.
      { 
        arr[j+1] = arr[j]; //move large to the right
        j--;
      } 
      arr[j+1] = temp;
    }
  }

  public static void main(String[] args) {
    int[] arr1 = { 10, 5, 3, 7, 2 };
    System.out.println(Arrays.toString(arr1));
    insertionSort(arr1);
    System.out.println(Arrays.toString(arr1));
  }

}
