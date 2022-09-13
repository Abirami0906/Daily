import java.util.*;
public class Main {

  public static void main(String[] args) {
    int rows, k = 0;
Scanner sc=new Scanner (System.in);
rows=sc.nextInt();

    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int s = 1; s <= rows - i; ++s) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
  }
}
