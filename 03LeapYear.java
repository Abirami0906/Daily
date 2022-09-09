import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE YEAR");
    int n=sc.nextInt();
    boolean leap = false;
    if (((n % 4 == 0) && (n % 100!= 0)) || (n%400 == 0))
    {
      System.out.println("The given year is a leap year");
    }
    else
    {
       System.out.println("The given year is a not leap year"); 
    }
  }
}
