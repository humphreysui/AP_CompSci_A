package SortAndSearch;

public class MergeSort {
  /*
   * Insertion Sort Merge sort - "divide and conquer"
   * 
   * CSAWESOME demo
   */

  public static void mergeSort(int[] array){
     
    mergeSort(array, new int[array.length], 0, array.length-1);
    
  }
  
  public static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {

    if (leftStart >= rightEnd) return;

    int middle = (leftStart + rightEnd)/2;

    // merge sort on left half
    mergeSort(array, temp, leftStart, middle);
    // merge sort on right half
    mergeSort(array, temp, middle+1, rightEnd);
    // merge both halves
    mergeHalves(array, temp, leftStart, rightEnd);
  }

  public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd){

    int leftEnd = (leftStart + rightEnd)/2; // same with the middle
    int rightStart = leftEnd + 1;
    int size = rightEnd -leftStart + 1; //whole size of the array
    
    int left = leftStart; // left side index
    int right = rightStart; // right side index
    int index = leftStart;  // temp array ind
    while(left <= leftEnd && right <= rightEnd){
      // when left side is less than and equal to right side
      if(array[left] <= array[right]){
        // copy the left side to the temp array
        temp[index] = array[left];
        // move up index and left side index
        // index ++;
        left++;
      }else{
        temp[index] = array[right];
        right++;
      }
      index++;
    }

    // when index out of balance, copy over the remainder of the elements
    
  }


  public static void main(String[] args) {
    int[] arr = { 86, 3, 43, 5 };
    
  }
}
