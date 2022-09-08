import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    int b=1;
    Scanner sc =new Scanner(System.in);
    System.out.println("ENTER THE INTEGER");
    int a=sc.nextInt();
    for(int i=1;i<=a;i++)
      b*=i;
    System.out.println("THE FACTORIAL OF "+a+" NATURAL NUMBER IS "+b);

  }
}
