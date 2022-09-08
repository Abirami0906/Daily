import java.util.Scanner;
public class Sample{

    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
System.out.println("ENTER THE CHARACTER");
        char al=(sc.nextLine()).charAt(0);
        if (al=='a'||al=='e'||al=='i'||al=='o'||al=='u'||al=='A'||al=='E'||al=='I'||al=='O'||al=='U')
        System.out.println(al+"IS A VOWEL");
        else
System.out.println(al+"IS A CONSONANT");
        
    }
}
