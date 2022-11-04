
public class Star {

public static void main(String[] args) {

int rows = 5;

for (int i = 1; i <= rows; ++i) {  //Outer loop for rows

for (int j = 1; j <= i; ++j) { //Inner loop for Col

System.out.print("* "); //Print *

}

System.out.println(); //New line

}

}

}

Pattern 2
java-pattern-programs-P2

/*Star Pattern 2

* * * * * 

* * * * 

* * * 

* * 

*   */

package Patterns;

public class Star {

    public static void main(String[] args) {

        int rows = 5;

        for(int i = rows; i >= 1; --i) {  //For Loop for Row 

            for(int j = 1; j <= i; ++j) { //For Loop for Col

                System.out.print("* "); //Prints *

            }

            System.out.println(); //Get to newline

        }

    }

}

Free Course: Programming Fundamentals
Learn the Basics of ProgrammingENROLL NOW
Pattern 3
java-pattern-programs-P3

/*Star Pattern 3

* 

* * 

* * * 

* * * * 

* * * * * 

* * * * 

* * * 

* * 

*   */

package Patterns;

import java.util.Scanner;

public class Star {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in); //Input

System.out.println("Enter the number of rows: ");

int rows = sc.nextInt();

for (int i = 0; i <= rows - 1; i++) { //For Loop for Row 

for (int j = 0; j <= i; j++) { //For Loop for Col

System.out.print("*" + " "); //prints * and blank space

}

System.out.println(""); // new line

}

for (int i = rows - 1; i >= 0; i--) { //For Loop for Row

for (int j = 0; j <= i - 1; j++) { //For Loop for Col

System.out.print("*" + " "); //prints * and blank space

}

System.out.println("");// new line

}

sc.close();

}

}

Post Graduate Program: Full Stack Web Development
in Collaboration with Caltech CTMEENROLL NOW
Pattern 4
java-pattern-programs-P4

/*Star Pattern 4

           * 

         * * 

       * * * 

     * * * * 

   * * * * *   */

package Patterns;

public class Star {

public static void printStars(int n) {

int i, j;

for (i = 0; i < n; i++) {  

for (j = 2 * (n - i); j >= 0; j--) { //For Loop for Row

System.out.print(" "); // Print Spaces

}

for (j = 0; j <= i; j++) { //For Loop for col

System.out.print("* "); // Print Star

}

System.out.println();

}

}

public static void main(String args[]) {

int n = 5; //Number of Rows

printStars(n);

}

}

Webinar: An Overview of Job Guarantee Programs
Get Job-Ready With Our Intense BootcampsREGISTER NOW
Pattern 5
java-pattern-programs-P5

/*Star Pattern 5

* * * * *

  * * * *

    * * *

      * *

        *  */

package Patterns;

import java.util.Scanner;

public class Star {

public static void main(String[] args) {

Scanner S = new Scanner(System.in); //Input

System.out.println("Enter row value ");

int r = S.nextInt();

for (int i = r; i >= 1; i--) { 

for (int j = r; j > i; j--) { 

System.out.print(" "); // Prints Blank space

}

for (int k = 1; k <= i; k++) {

System.out.print("*"); //Prints *

}

System.out.println(" "); //Prints blank spaces

}

S.close();

}

}



Pattern 6
java-pattern-programs-P6

/*Star Pattern 6

    *

   *

import java.util.Scanner;

public class Star {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number of rows: ");

int rows = sc.nextInt();

for (int i = 1; i <= rows; i++) {

for (int j = i; j < rows; j++) {

System.out.print(" "); // Blank Space

}

for (int k = 1; k <= i; k++) {

System.out.print("*"); // Prints *

}

System.out.println("");

}

for (int i = rows; i >= 1; i--) {

for (int j = i; j <= rows; j++) {

System.out.print(" "); 

}

for (int k = 1; k < i; k++) {

System.out.print("*"); 

}

System.out.println("");

}

sc.close();

}

}
