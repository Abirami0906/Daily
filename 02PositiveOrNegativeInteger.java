import java.util.Scanner;
public class Sample{

    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER THREE INTEGERS");
        int a=sc.nextInt();
        if(a>0)     
           System.out.println(a+ "IS POSITIVE");
        else if (a==0)
           System.out.println(a+"IS ZERO");
        else
           System.out.println(a+"IS NEGATIVE");       
    }
}
