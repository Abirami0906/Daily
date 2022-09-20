import java.util.Scanner;
public class Main
{ 
    public static void main(String[] args)
        {
            int row , r, c ;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Row : ");
            row=sc.nextInt(); 
            for(r=row;r>0;r--)
                {
                    
                    for( c=row-r;c>0;c--)
                        System.out.print(" ");
   
                    for( c=0;c<r;c++)
                        System.out.print("*");
                   
                    System.out.println();
                }
         }
}
