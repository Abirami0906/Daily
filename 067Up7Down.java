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
      if(a[i]>7)
         System.out.println("UP");
      else if (a[i]==7)
         System.out.println("EQUAL");
      else
          System.out.println("DOWN");
}
    
  }
}
