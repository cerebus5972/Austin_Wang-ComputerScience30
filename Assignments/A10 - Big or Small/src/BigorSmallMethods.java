import java.util.Scanner;
public class BigorSmallMethods {
    Scanner sc = new Scanner(System.in);
    public void compare() {
        System.out.print("Enter your first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter your second number: ");
        double b = sc.nextDouble();
        if (a>b) {
            System.out.println("Yes, the first number is bigger. ");
        } 
        else if (a<b) {
            System.out.println("No, the first number isn't bigger! ");
        }
        else System.out.println("Uhhh... I don't know if the first number was bigger...");
    }
}
