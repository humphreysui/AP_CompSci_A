package Recursion;

import java.util.Scanner;

public class RecursionDemo {

  /*
   * Recursion is the process of repeating instructions in a self-similar way. 
   * A recursive method is a method that calls itself.
   * 
   * All recursive methods must have a base case and a recursive call. The base
   * case of a recursive method is a comparison between a parameter of the
   * method and a predefined value strategically chosen by the programmer. The
   * base case comparison determines whether or not the method should call itself
   * again.
   * 
   * All method calls are placed on a stack, the returns are executed in the
   * reverse order of how they were placed. This order is known as last-in,
   * first-out (LIFO), which means that the last recursive call made is the first
   * one to return a value.
   * 
   * If the base case is never satisfied, then the method calls pile up in its RAM
   * and the computer eventually runs out of memory. This will cause a stack
   * overflow error and it occurs when you have an infinite recursion.
   */
  
  // Recursion intro demo
  public static void stackWords(){
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter a Word:");
    String word = s1.nextLine();
    
    if(word.equals(".")){
      System.out.println();
      s1.close();
    }else{
      stackWords(); // recursive call
    }
    System.out.println(word);
  }

  // Factorial demo
  public static int factorial(int n){
    if (n==1){
      return 1;
    }else{
      return n*factorial(n-1);
    }
  }

  /*
   * Stack: 
   *  1               -- 4 
   *  2*factorial(1)  -- 3 
   *  3*factorial(2)  -- 2 
   *  4*factorial(3)  -- 1
   * 
   * Java Tutor - Visualize
   * 
   * When tracing a recursive method call, write out each call to the method
   * including its parameter. When the base case is reached, replace the result
   * from each method call with its result, one at a time. This process will force
   * you to calculate the return values in the reverse order from the way that the
   * calls were made.
   * 
   * Each recursive call has its own set of local variables, including the formal
   * parameters. In the example above a new formal parameter n gets created with
   * each call to the factorial method. The parameter values capture the progress
   * of a recursive process, much like loop control variables capture the progress
   * of the loop. Once the parameter n reaches the value 1, the recursion reaches
   * the base case and ends.
   */

  // Fibonacci demo - hand trace the result of fibonacci(6)
  public static int fibonacci(int n){
    if (n==1 || n==2){
      return 1;
    }else{
      return fibonacci(n-1) + fibonacci(n-2);
    }
   }
  
  // extract digits in reverse order
  public static void revDigs(int n)
  {
    System.out.print(n % 10); //rightmost digit
    if (n / 10 != 0) //base case
    revDigs(n / 10);
  }

  public static void main(String[] args) {
    
    // stackWords() 
    /* 
    System.out.println("Enter list of words, one per line.");
    System.out.println("Final word should be a period (.)");
    stackWords(); 
    */

    //factorial
    System.out.println(factorial(4));

    // fibonacci
    System.out.println(fibonacci(6));
    
    revDigs(147);

  }

}
