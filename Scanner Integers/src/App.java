//Austin wang
//Scanner Integers
//25 September 2024
//Adds up two integers and two doubles inputted by the user

//Sets up the scanner and the project page
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scantron = new Scanner(System.in);
        
        //Asks the user to input the integers/decimals and makes the scanner read them
        System.out.print("Enter your first integer: ");
        int int1 = scantron.nextInt();
        System.out.print("\nEnter your second integer: ");
        int int2 = scantron.nextInt();
        System.out.print("\nEnter your first decimal: ");
        double double1 = scantron.nextDouble();
        System.out.print("\nEnter your second decimal: ");
        double double2 = scantron.nextDouble();

        //Returns the sum of the integers/decimals
        System.out.println("\nThe sum of your integers is " + (int1 + int2) + ". ");
        System.out.println("\nThe sum of your decimals is " + (double1 + double2) + ". ");
    }
}
