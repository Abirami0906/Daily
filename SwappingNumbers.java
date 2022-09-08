import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a,b,c;
Scanner sc=new Scanner (System.in);
a=sc.nextInt();
b=sc.nextInt();
System.out.println("THE NUMBER BEFORE SWAPPING"+a+" AND "+b);
c=a;
a=b;
b=c;
System.out.println("THE NUMBER AFTER SWAPPING"+a+" AND "+b);
  }
}
