import java.util.*;
class Main
{
    public static void main(String arg[])
    {
        int j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=0;n!=0;i++)
        {
            n=n/10;
            j++;
        }
        System.out.println("The number of digits is "+j);
    }
}
