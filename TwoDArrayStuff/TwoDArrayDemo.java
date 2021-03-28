package TwoDArrayStuff;

import java.util.Arrays;

public class TwoDArrayDemo{

  // 11. getAverage() - nums
  public static double getAverage(int[][] a) {
    double total = 0;
    int value = 0;
    for (int row = 0; row < a.length; row++) {
      for (int col = 0; col < a[0].length; col++) {
        value = a[row][col];
        total = total + value;
      }
    }
    return total / (a.length * a[0].length);
  }
  // 14. countValues() - matrix
  public static int countValues(int value, int[][] a, int rowStart, int rowEnd, int colStart, int colEnd) {
    int count = 0;
    for (int row = rowStart; row <= rowEnd; row++) {
      for (int col = colStart; col <= colEnd; col++) {
        if (a[row][col] == value)
          count++;
      }
    }
    return count;
  }

  // *17.
  public static int checkForWinner(int[][] board){
    // vertical win
    for (int r = 0; r <= board.length-4; r++) {
      for (int c = 0; c < board[0].length; c++) {
        if (
          board[r][c] != 0 && 
          board[r][c] == board[r + 1][c] && 
          board[r + 1][c] == board[r + 2][c] && 
          board[r + 2][c] == board[r + 3][c]
        ){
          System.out.println("vertical win");
          return board[r][c];
        }
      }
    }
    // diagonal downward win
    /*
    for (int r = 0; r <= board.length-4; r++) {
      for (int c = 0; c <= board[0].length-4; c++) {
        if (
          board[r][c] != 0 && 
          board[r][c] == board[r + 1][c + 1] && 
          board[r + 1][c + 1] == board[r + 2][c + 2] &&
          board[r + 2][c + 2] == board[r + 3][c + 3]
        ){
          System.out.println("diagonal downward win");
          return board[r][c];
        }
      }
    }
    */
             
    // horizontal win
    for (int r = 0; r <board.length; r++) {
      for (int c = 0; c <= board[0].length -4; c++) {
        if (
          board[r][c] != 0 && 
          board[r][c] == board[r][c + 1] && 
          board[r][c + 1] == board[r][c + 2] && 
          board[r][c + 2] == board[r][c + 3]
        ) {
          System.out.println("horizontal win");
          return board[r][c];
        }
      }
    }
    // vertical upward win
    for (int r = 3; r < board.length; r++) {
      for (int c = 0; c <= board[0].length - 4; c++) {
        if (
          board[r][c] != 0 && 
          board[r][c] == board[r - 1][c + 1] && 
          board[r - 1][c + 1] == board[r - 2][c + 2] && 
          board[r - 2][c + 2] == board[r - 3][c + 3]
        ) {
          System.out.println("vertical upward win");
          return board[r][c];
        }
      }
    }
    
    // no winner
    return 0;
  }
  

  public static void main(String[] args) {

    // 1. first declare a 2D array of String type called 'studentName'
    /*
    String[][] studentNames;
    */
    // 2. initialize 'studentNames' with 2 rows and 2 columns using keyword new 
    /*
    studentNames = new String[2][2]; 
    */
    // 3. print out studentNames using Arrays.deepToString()
    /*
    System.out.println(Arrays.deepToString(studentNames));
    */
    // 4. declare and initialize a 2D array of int type called 'nums' 
    //using initializer {{1,2,3,4},{5,6,7,8},{9,10,11,12}}
    
    int[][] nums = { 
                      { 1, 2, 3, 4 }, 
                      { 5, 6, 7, 8 }, 
                      { 9, 10, 11, 12 } 
                    };
    System.out.println(Arrays.deepToString(nums)); 
    
    // 5. declare and initialize a 2D array of int type called 'numbers' using keyword new and initializer {{1,2,3},{4,5,6}}
    /*
    int[][] numbers = new int[][]{{1,2,3},{4,5,6}};
    */
    // 6. assign values [[Alex, Bob], [Chris, Dave]] to studentNames
    /*
    studentNames[0][0] = "Alex";
    studentNames[0][1] = "Bob";
    studentNames[1][0] = "Chris";
    studentNames[1][1] = "Dave";
    System.out.println(Arrays.deepToString(studentNames));
    */
    // 7. get the number of rows in 'nums' 
    System.out.println(nums.length);
    // 8. get the number of columns in 'nums'
    System.out.println(nums[0].length);
    // 9. get the number of total elements in 'nums'
    System.out.println(nums.length* nums[0].length);
    // 10. traverse 2D array 'nums' in row-major order (use row and col instead of i and j)
    /*
     1 2 3 4 
     5 6 7 8 
     9 10 11 12
     */
    /*
    for (int row = 0; row < nums.length; row++) {
      
      for (int col = 0; col < nums[0].length; col++) {
        System.out.print(nums[row][col] + " ");
      }
      System.out.println();
    }
    */
    // 11. write a static method called 'getAverage' to calculate the average of elements in 'nums'
    System.out.println(getAverage(nums));
    // 12. traverse 2D array 'nums' in column-major order 
    /*
    1 5 9 
    2 6 10 
    3 7 11 
    4 8 12
     */
    /*
    for (int col = 0; col < nums[0].length; col++) {

      for (int row = 0; row < nums.length; row++) {
        System.out.print(nums[row][col] + " ");
      }
      System.out.println();
    }
    */
    // 13. use for-each loop to traverse 2D array 
    for(int[] arr: nums){
      for(int element: arr){
        System.out.print(element + " ");
      }
      System.out.println();
    }

    // All array algorithms can be applied to 2D arrays: Acculmulation, find MinMax, Search, (Sort)...
    
    // 14. Write a method called 'countValues' that counts the number of a given value in a subset of the given 2D array. The method has 4 parameters: the value that needs to be counted, a 2D array, rowStart and rowEnd, colStart and colEnd
    int[][] matrix = { { 3, 2, 3 }, { 4, 3, 6 }, { 8, 9, 3 }, { 10, 3, 3 } };
    System.out.println(countValues(3, matrix, 0, 2, 0, 2));

    // You can pass object to 2D array
    // *15. student class example - changeAge() 
    
    // *16. The major and minor diagonals of a square matrix - whiteboard
    int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

    // main diagonal
    for(int i = 0; i<mat.length; i++){
       System.out.print(mat[i][i] + " "); 
    }
    System.out.println();

    // anti-main diagonal
    for (int i = 0; i < mat.length; i++) {
      System.out.print(mat[i][mat.length - i - 1] + " ");
    }

    // *17. The Connect-Four Advanced Algorithm
    /*
     * Connect Four is a two-player game played on a grid of six rows and seven
     * columns. Players take turns inserting disks into the grid in hopes of
     * connecting four disks in a row to win the game. You have been hired to work
     * on the app version of the game, and it is your responsibility to determine
     * whether a player has won the game.
     */
    /*
     * Problem: Write a method called checkForWinner that has one parameter: a 2D
     * array of int. The 2D array consists of 1s and 2s to represent a move by
     * player one or player two. Cells that do not contain a move have a value of 0.
     * This method checks all four directions to win (vertical, horizontal,
     * diagonally downward, and diagonally upward). The method should return the
     * number of the player who won or return 0 if nobody has won.
     */

    int[][] board={
                    {0,0,0,0,0,0,0},
                    {0,0,0,0,2,1,0},
                    {0,0,2,0,1,2,0},
                    {1,0,1,2,1,1,0},
                    {2,2,1,2,2,2,1},
                    {1,1,2,1,2,2,1}
                  };

    System.out.println(checkForWinner(board));
    
    // Homework: 8.5 code practice with 2D arrays

    // Homework: 8.7 MCQ


  }

}