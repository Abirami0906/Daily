import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        char i;
        int choice;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your choice\n 1. Upper \n 2. Lower");
        choice=sc.nextInt();
        if(choice==1)
        {
            for(i='A';i<='Z';i++)
            System.out.print(i+" ");
            
        }
        else
        { 
            for(i='a';i<='z';i++)
            System.out.print(i+" ");
            
        }
        
    }
}
