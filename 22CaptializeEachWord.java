import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      String str, newstr="", firstchr, remchrs, capwrd;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      str = s.nextLine();
      
      String words[] = str.split("\\s+");
      
      for(String word: words)
      {
         firstchr = word.substring(0, 1);
         firstchr = firstchr.toUpperCase();
         remchrs = word.substring(1);
         newstr = newstr + firstchr + remchrs + " ";
      }
      
      System.out.println("\nThe string \"" +str+ "\" is capitalized.");
      System.out.println("\nThe new string is:");
      System.out.println(newstr);
   }
}
