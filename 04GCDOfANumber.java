import java.util.*;
class Main
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        while(b!=0)
        {
            int t=b;
            b=a%b;
            a=t;
        }
        System.out.println("THE GCD IS "+a);
    }
}
