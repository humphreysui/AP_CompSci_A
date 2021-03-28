package ArrayStuff;

public class GetAvg {
  private int[] numbers;
  
  public GetAvg(int[] numbers){
    this.numbers = numbers;
  }

  public double getAverage(){
    double sum = 0;
    for(int number: numbers){
      sum+=number;
    }
    return sum/numbers.length;
  }
  public static void main(String[] args) {
    int[] arr = {2, 6, 7, 12, 5};
    GetAvg obj = new GetAvg(arr);
    System.out.println(obj.getAverage());
  }
}
