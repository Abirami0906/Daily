import java.util.Scanner;  
public class ZigZagNumberPattern  
{  
    public static void main(String[] args)   
    {   
        Scanner sc= new Scanner(System.in);  
        int r,c,row;  
        int ascii=64;    
        row=sc.nextInt();  
        int count=sc.nextInt();      
        for (int i=1;i<=count;i++)  
        {  
           for(r=1; r<=row; r++)  
           {     
              for(c=1; c<=row; c++)  
              {           
                 if(r==c)        
                    System.out.print(r+" ");        
                 else            
                    System.out.print("  ");        
              }   
              System.out.println("");  
           }  
            for(r=1;r<=row;r++)  
            {    
              for(c=1;c<=row;c++)  
              {  
                    if(c <= (row+1-r))  
                    {  
                       if( c == (row+1-r) )  
                          System.out.print(r+" ");  
                       else  
                          System.out.print("  ");  
                    }  
              }  
              System.out.println("");  
           }  
        }  
    }  
}  
