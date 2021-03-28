package ArrayStuff.MCQ;

class MCQ6813{
  static int[] a = { 7, 3, -1 };

  public static int m1(int[] a) {
    a[1]--;
    return (a[1] * 2);
  }
  public static void main(String[] args) {
    System.out.println(m1(a));
    System.out.println(a[1]);
  }
}