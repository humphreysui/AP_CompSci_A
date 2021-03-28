package ArrayListStuff;

import java.util.*;

/*
  In this question,you are asked to write a constructor for a class called Digits. This constructor takes an integer number as its argument and divides it up into its digits and puts the digits into an ArrayList. For example, new Digits(154) creates an ArrayList with the digits [1, 5, 4].
*/

public class Digits {

  /** A list of digits */
  private ArrayList<Integer> digitList;

  /** Constructs a list of digits from the given number */
  public Digits(int number) {

    // initialize digitList to an empty ArrayList of Integers
    this.digitList = new ArrayList<Integer>();

    // Use a while loop to add each digit in number to digitList
    while (number > 0) {
      digitList.add(number%10);
      number /= 10;
    }

    // (Provided) Use Collections.reverse(digitList); to reverse the digits
    Collections.reverse(digitList);
  }

  /* returns the string representation of the digits list */
  public String toString() {
    return digitList.toString(); 
  }

  public static void main(String[] args) {
    Digits d1 = new Digits(1546);
    System.out.println(d1);
  }

}
