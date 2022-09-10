import java.util.*;
class Main
{
    public static void main(String arg[])
    {
        int j=0,o=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=0;n!=0;i++)
        {
            int m=n%10;
            o=o*10+m;
            n=n/10;
        }
        System.out.println("The reversed number is "+o);
    }
}
