
import java.util.Scanner;  
public class HollowDiamondPattern2  
{  
public static void main(String args[])  
{  
int i,j;  
Scanner scan=new Scanner(System.in);  
System.out.print("Enter the number of rows: ");    
int rows=scan.nextInt();  
System.out.print("Enter the symbol you want to print: ");   
char symbol=scan.next().charAt(0);  
i=1;  
while(i<=rows)  
{  
j=rows;  
while(j>i)  
{  
System.out.print(" ");  
j--;  
} 
System.out.print(symbol);  
j=1;  
while(j<(i-1)*2)  
{  
System.out.print(" ");  
j++;  
}   
if(i==1)  
{           
System.out.print("\n");  
}  
else  
{           
System.out.print(symbol+"\n");  
}  
i++;  
}  
i=rows-1;  
while( i>=1)  
{  
j=rows;  
while(j>i)  
{  
System.out.print(" ");  
j--;  
}  
System.out.print(symbol);  
j=1;  
while(j<(i-1)*2)  
{  
System.out.print(" ");  
j++;  
}
if(i==1)  
{            
System.out.print("\n");  
}  
else  
{                
System.out.print(symbol+"\n");  
}  
i--;  
} 
}  
}  
