package ArrayStuff;

/*

*Problem: Find min and max 

*Algorithm: [Find max]

  1. create a variable called max, and set it to the first element in the list
  2. look at each value in the list
  3. if the value is greater than the max we set, then make it be the new max
  4. loop till the end of the list
  5. return the max you find 

*Pseudo Code: [Find max]

  set max = first max
  for (iterate thru all value in the list){
    if(value>max){
      max = value
    }
  }
  return max 

*/

// { 6, 2, 1, 7, 12, 5 }

public class MinMax {
  public static void main(String[] args) {
    int[] values = { 6, 2, 1, 7, 12, 5 };
    int min = values[0];  
    for (int val : values) {
      if (val < min)  
        min = val;
    }
    System.out.println("Min is " + min);
  }
}
