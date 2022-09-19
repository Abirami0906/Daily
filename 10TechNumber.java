import java.util.Scanner;
public class JavaExample
{
    public static void main(String args[])
    {
        int n, num, firstHalf, secondHalf, numberOfDigits=0, squareOfTwoHalves;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = scan.nextInt();
        num = n;
        while (num > 0)
        {
            numberOfDigits++;
            num = num / 10;
        }
        if (numberOfDigits % 2 == 0)
        {
            num = n;
            firstHalf = num % (int) Math.pow(10, numberOfDigits / 2);
            secondHalf = num / (int) Math.pow(10, numberOfDigits / 2);
            squareOfTwoHalves = (firstHalf + secondHalf) * (firstHalf + secondHalf);
            if (n == squareOfTwoHalves)
            {
                System.out.println(n +" is a Tech number.");
            }
            else
            {
                System.out.println(n +" is not a Tech number.");
            }
        }
        else
        {
            System.out.println(n + " is not a Tech number.");
        }
    }
}
