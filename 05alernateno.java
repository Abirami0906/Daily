import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();

    
        for(int i=0;i<n;i=i+2)
        System.out.print(a[i]+" ");
    
	}
}
