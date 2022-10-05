import java.util.*;
public class JavaExample
{
  public static boolean checkPrime(int num)
  {
    if (num <= 1)
      return false;
    for (int i = 2; i < num; i++)
      if (num % i == 0)
        return false;
    return true;
  }
  public static boolean checkEmirp(int num)
  {
    if (checkPrime(num) == false)
      return false;
    int reverseNum = 0;
    while (num != 0)
    {
      int lastDigit = num % 10;
      reverseNum = reverseNum * 10 + lastDigit;
      num = num/10;
    }
    return checkPrime(reverseNum);
  }
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter any number: ");
    int num = scanner.nextInt();
    if (checkEmirp(num) == true)
      System.out.println(num+ " is an Emirp number.");
    else
      System.out.println(num+ " is not an Emirp number.");
  }
}
