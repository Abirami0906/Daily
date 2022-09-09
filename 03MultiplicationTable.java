import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("ENTER THE NUMBER");
    int n=sc.nextInt();
    for(int i=1;i<20;i++)
    {
     int  j=i*n;
       System.out.println(i+"*"+n+"="+j+"\n");
        
    }
  }
}
