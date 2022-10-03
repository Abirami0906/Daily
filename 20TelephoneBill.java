import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      int numberOfCalls;
      float phoneBill;
      Scanner scan = new Scanner(System.in);
      numberOfCalls = scan.nextInt();
      
      if(numberOfCalls<=60)
         phoneBill = 14;
      else
      {
         numberOfCalls = numberOfCalls - 60;
         phoneBill = 14 + (float)(numberOfCalls * 0.12);
      }
      
      System.out.println(phoneBill);
   }
}
