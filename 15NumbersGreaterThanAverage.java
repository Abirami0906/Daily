import java.util.Scanner;

public class ArrayTest {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter size of the array: ");
    int n = scan.nextInt();
    int numbers[] = new int[n];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < n; ++i) {
      numbers[i] = scan.nextInt();
    }
    double avg = average(numbers);
    System.out.println("Average = " + avg);
    System.out.println("Numbers greater then average = ");
    display(numbers, avg);
    scan.close();
  }
  public static void display(int[] numbers, double avg) {
    // traverse through the array
    for (int i : numbers) {
      if(i > avg)
      System.out.print(i+" ");
    }
    
  }
  public static double average(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i]; // find sum
    }
    
    return sum/numbers.length;
  }
}
