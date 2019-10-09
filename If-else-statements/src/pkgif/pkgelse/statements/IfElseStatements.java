
package pkgif.pkgelse.statements;

// Import Scanner Here
import java.util.Scanner;


/**
 *
 * Name: Zein
 * Period: 2
 * Project Name: If-Else Statements
 * 
 * 
 */
public class IfElseStatements {

    // Create Scanner Object here So it may be used in all methods
   private static Scanner kb = new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        // Happy Coding!
        
        
        //Invoke the methods here 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

    }
    
    
    public static void question1(){
        kb = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int grade = kb.nextInt();
        
        if(grade > 70)
        {
            System.out.println("PASSING");
        }
        else
        {
            System.out.println("NOT PASSING");
        }
    }
    
    public static void question2(){
        kb = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = kb.nextInt();
        
        if(number <= 50)
        {
            System.out.println("GO");
        }
        else
        {
            System.out.println("STOP");
        }
        
    }
    
    public static void question3(){
        
        kb = new Scanner(System.in);
        System.out.println("Enter an Int: ");
        int number = kb.nextInt();
        
        if(number%2 == 0)
        {
            System.out.println("EVEN");
        }
        else
        {
            System.out.println("ODD");
        }
    }
    
    public static void question4(){
        kb = new Scanner(System.in);
        System.out.println("Enter an Int: ");
        int number = kb.nextInt();
        
        if(number%5 == 0)
        {
            System.out.println("MULTIPLE OF 5");
        }
        else
        {
            System.out.println("NOT A MULTIPLE OF 5");
        }
        
    }
    
    public static void question5(){
        kb = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = kb.nextInt();
        
        if(number < 10)
        {
            System.out.println("ONE DIGIT");
        }
        else if(number >= 100)
        {
            System.out.println("THREE DIGITS");
        }
        else
        {
            System.out.println("TWO DIGITS");
        }
        
    }
    
    public static void question6(){
        kb = new Scanner(System.in);
        System.out.println("Enter a jersey number: ");
        int number = kb.nextInt();
        
        if(number == 12 || number == 71 || number == 80)
        {
            System.out.println("That number is retired from the Seattle Seahawks");
        }
    }
    
    public static void question7(){
        
        kb = new Scanner(System.in);
        System.out.println("Enter a State: ");
        String state = kb.nextLine();
        
        if(state.equals("Washington") || state.equals("Oregon") || state.equals("Idaho"))
        {
            System.out.println("This state is in the PNW");
        }
        else
        {
            System.out.println("You should move to tge PNW; it's great here!");
        }
        
    }
    
    public static void question8(){
        
    }
    
    public static void question9(){
        
    }
    
    public static void question10(){
        
    }
    
}
