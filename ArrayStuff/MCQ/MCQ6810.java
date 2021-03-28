package ArrayStuff.MCQ;

public class MCQ6810 {
  private static int[] nums = { 7, 10, 10, 15, 15, 15, 15, 10, 10, 10, 15, 10, 10 };

  public static int findLongest(int target) {

   int lenCount = 0; // length of current consecutive numbers
   int maxLen = 0;   // max length of consecutive numbers
   for (int k = 0; k < nums.length; k++) {
      if (nums[k] == target) {
        lenCount++;
      } else if (lenCount > maxLen) {
        maxLen = lenCount;
      }else{
        lenCount = 0;
      }
   }
   return maxLen;
  }
  public static void main(String[] args) {
    System.out.println(findLongest(10));
  }
}
