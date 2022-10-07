import java.util.Scanner;
public class JavaExample
{
  private static boolean checkAutomorphic(int num)
  {
    int length=0;
    int square = num*num;
    int temp = num;
    while(temp>0)
    {
      length++;
      temp=temp/10;
    }
    int lastDigits = (int) (square%(Math.pow(10, length)));
    if (num == lastDigits)
      return true;
    else
      return false;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int first, last;
    System.out.print("Enter the starting range: ");
    first = in.nextInt();
    System.out.print("Enter the ending range: ");
    last = in.nextInt();
    System.out.println("Automorphic numbers between "+first+" and "+last+" are: ");
    for(int i=first; i<=last; i++)
    {
      if(checkAutomorphic(i))
        System.out.print(i+" ");
    }
  }
}  
