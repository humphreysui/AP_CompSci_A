package ArrayStuff;

import java.util.Arrays;

class ArrayDemo{

  // 17
  public static void addNum(int[] someArr, int someNum){
    for(int i = 0; i < someArr.length; i++){
      someArr[i] += someNum;
    }
  }

  // 19
  public static void addFirst4Num(int[] someArr, int someNum) {
    for (int i = 0; i < someArr.length && i<4; i++) {
      someArr[i] += someNum;
    }
  }

  // 20
  public static void addLastHalf(int[] someArr, int someNum) {
    for (int i = someArr.length/2 ; i < someArr.length; i++) {
      someArr[i] += someNum;
    }
  }



  public static void main(String[] args) {

    // 1. declare an integer variable called score

    /*int score;*/
    
    // 2. declare an array called scoreList that holds integers
    int [] scoreList;
     
    // 3. create the scoreList array that hold 5 elements
    scoreList = new int[5];

    // 4. declare and create an array called scoreArray that also holds 5 elements "in one step"

    /*int [] scoreArray = new int [5];*/

    /* to see the results by printing both arrays to the console
    use "Arrays.toString" method introduced in Codecademy */

    // 5. save the returned value from the method into a correct type variable called betterPrintOut
    String betterPrintOut = Arrays.toString(scoreList);

    // 6. print betterPrintOut to the console
    System.out.println(betterPrintOut);

    // 7. declare and create arrays that holds 3 elements of int, double, boolean, String respectively and then print to the console to see their default values
    int[] intArray = new int[3];
    double[] doubleArray =  new double[3];
    boolean[] boolArray = new boolean[3];
    String[] stringArray = new String[3];
    
    System.out.println(Arrays.toString(intArray));
    System.out.println(Arrays.toString(doubleArray));
    System.out.println(Arrays.toString(boolArray));
    System.out.println(Arrays.toString(stringArray));

    // 8. create a string variable called str1 that holds "good"
    String str1 = new String("good");

    // 9. create a string variable called str2 that holds "day"
    String str2 = new String("day");

    // 10. assign both to the string Array you created above
    stringArray[1] = str1;
    stringArray[2] = str2;
    System.out.println(Arrays.toString(stringArray));

    /*When you create an array of an object type (like String) with initial values, space is set aside for that number of object references. The objects are created and the object references set so that the objects can be found.*/


    // 11. create an array of integers using initializer list {1, 2 ,3 ,4}
    int[] initArray = {1, 2 ,3 ,4};
    System.out.println(Arrays.toString(initArray));

    // 12. create an array of Strings using initializer list {"a", "b", "c"}
    String[] stringInitArray = {"a", "b", "c"};
    System.out.println(Arrays.toString(stringInitArray));

    // 13. print both first index value 
    System.out.println(initArray[0]);
    System.out.println(stringInitArray[0]);

     
    // 14. now try to declare an array variable called arr first and then assign initializer list {1, 2, 3, 4, 5, 6} to creata an array (PPT-P4)
    
    /* 
      int[] arr;
      arr = {1, 2, 3, 4, 5, 6};  
    */

    // 15. properly use initializer list with 2 steps
    int[] arr;
    arr = new int[]{1, 2, 3, 4, 5, 6};
    System.out.println(Arrays.toString(arr));

    /* the bare {1, 2, 3, 4, 5, 6} could cause difficulties during semantic analysis. */ 

    // 16. use for loop to traverse arr
    for (int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }

    // 17. write a static method called "addNum" in the class that adds any integer you specify to each element in "arr" and run the method below to see the resault of new "arr"
    int num = 1;
    addNum(arr, num);
    System.out.println(Arrays.toString(arr));

    // *18. traverse arr from back to front  

    for(int i = arr.length - 1; i >= 0; i--){
      System.out.println(arr[i]);
    }

    // *19. try alter "addNum" method to "addFirst4Num", which only increase first 4 elements by 10
    addFirst4Num(arr, 10);
    System.out.println(Arrays.toString(arr));

    // *20. try alter "addNum" method to "addLastHalf", which only increase
    addLastHalf(arr, 100);
    System.out.println(Arrays.toString(arr));

    // *21. try it on an odd numbered array
    int[] newArray = new int[] {12, 13, 14, 15, 6};
    addLastHalf(newArray, 100);
    System.out.println(Arrays.toString(newArray));

    // 22. write foreach loop to traverse "arr"

    /* foreach loop does not involve an index variable or the use of the []. It just sets up a variable that is set to each value in the array successively.*/
    for (int arrItem : arr){
      System.out.println(arrItem);
    } 

    // 23. get all even value from {6, 2, 1, 7, 12, 5}
    int[] values = { 6, 2, 1, 7, 12, 5 };
     
    for (int value : values) {
      if (value % 2 == 0) {
        System.out.println(value + " is even!");
      }
    }

    // 24. use foreach loop to increase each element and print each new value, then print the original values array and compare results
    for (int value : values) {
      value+=100;
      System.out.println(value);
    }
    System.out.println(Arrays.toString(values));

    /*
     only the variable in the loop changes, not the real array values. To modify array elements, we would need an indexed loop.
    */

    /* check your understanding 6-3-5 */

    // *25. declare a class "GetAvg" that has the array "numbers" as a private instance variable in the class and provides a public method "getAverage" that uses a for-each loop.

  
    // 26. find min and max 

    // 27. swap value

    // 28. P.284 arrays as parameters vs string as parameters

    // 29. Deck
    
  
    
  }
}