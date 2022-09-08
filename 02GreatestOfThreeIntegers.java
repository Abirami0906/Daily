import java.util.Scanner;
public class Sample{

    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
System.out.println("ENTER THREE INTEGERS");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();  
        if(a>b &&a>c)      
          System.out.println(a+ "IS BIG");
        else if (b>c)
          System.out.println(b+"IS BIG");
        else
          System.out.println(c+"IS BIG"); 
    }
}
