import java.util.*;
class Main
{
    public static void main(String argv[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STARTING NUMBER");
        int s=sc.nextInt();
        System.out.println("ENTER THE ENDING NUMBER");
        int e=sc.nextInt();
        for(int i=s+1;i<=e;i++)
        {
            {
                int k=0;
                for(int j=2;j<e/2;j++)
                {
                    if(i%j==0)
                    {
                        k=1;
                        break;
                    }

                }
                if(k==0)
                {
                    System.out.print(i+" ");
                }
            }
        }
        
        
    }
}
