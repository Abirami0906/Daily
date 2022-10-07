import java.util.Scanner;
public class JavaExample
{
  public static void main(String args[])
  {
    int num, sumProductDigits=1, sumNumberDigits=0, temp;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter any number: " );
    num=scanner.nextInt();
    scanner.close();
    int number  = num;
    while(number>0)
    {
      temp=number%10;
      sumNumberDigits=sumNumberDigits+temp;
      sumProductDigits=sumProductDigits*temp;
      number=number/10;
    }
    if(sumNumberDigits==sumProductDigits)
      System.out.println(num+" is a spy number.");
    else
      System.out.println(num+" is not a spy number.");
  }
}
