package ArrayStuff;

/* Basic Swap between two values, a and b: 

  *Algorithm:
    1. delcare and create variables a and b
    2. create a temp variable c
    3. assign the value of a to c
    4. assign the value of b to a
    5. assign the value of c to b
  
  *Code:
    int a = 1;
    int b = 2;
    int c;
    c = a;
    a = b;
    b = c;  

*/
 

// rotate array { 6, 2, 1, 7, 12, 5 } elements to the left by one index to {2 1 7 12 5 6}

public class Swap {
  public static void main(String[] args) {
    int[] values = { 6, 2, 1, 7, 12, 5 };
    int first = values[0];
    for (int i = 0; i < values.length; i++) {
      // if it's not the last element, copy the next one over
      if (i < values.length - 1) {
        values[i] = values[i + 1];
      } else {
        // last element gets first
        values[i] = first;
      }
    }
    // print them out to see the results
    for (int val : values) {
      System.out.print(val + " ");
    }
  }
  
}
