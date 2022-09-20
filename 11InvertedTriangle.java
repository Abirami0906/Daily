import java.util.Scanner;
public class Main
{ 
    public static void main(String[] args)
        {
            int row , r, c ;
            // creating Object
            Scanner sc=new Scanner(System.in);
            // entering no. of rows
            System.out.print("Enter Row : ");
            row=sc.nextInt(); 
            for(r=row;r>0;r--)
                {
                    // printing space 
                    for( c=row-r;c>0;c--)
                        System.out.print(" ");
                    // printing stars
                    for( c=0;c<r;c++)
                        System.out.print("*");
                     //taking to new line
                    System.out.println();
                }
         }
}
