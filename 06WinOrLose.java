import java.util.*;
class Main {

  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int a[]=new int[100];
    for (int i=0;i<n;i++)
        a[i]=sc.nextInt();
    for (int i=0;i<n;i++)
    {
      for (int j=i+1;j<n;j++)
      {
        if(a[i]>a[j])
        {
          int t=a[i];
          a[i]=a[j];
          a[j]=t;
        }
      }
    }
    if((a[n-1])%2==0)
    System.out.print("WON");
    else
    System.out.print("LOS");
    
  }
}
