import java.util.*;
public class JavaExample
{
  public static void main(String args[])
  {
    int num, multiply2, multiply3;
    Scanner sc=new Scanner(System.in);
    num = sc.nextInt();
    multiply2 = num * 2;
    multiply3 = num *3;
    String str = num + "" + multiply2 + multiply3;
    boolean flag = true;
    for(char ch = '1'; ch <= '9'; ch++)
    {
      int count = 0;
      for(int i = 0; i < str.length(); i++)
      {
        char ch2 = str.charAt(i);
        if(ch2 == ch)
          count++;
      }
      if(count > 1 || count == 0)
      {
        flag = false;
        break;
      }
    }
    if(flag)
      System.out.println(num + " is a fascinating number.");
    else
      System.out.println(num + " is not a fascinating number.");
  }
}  
