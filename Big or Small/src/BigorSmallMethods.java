import java.util.Scanner;
public class BigorSmallMethods {
    Scanner sc = new Scanner(System.in);
    public void compare() {
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        if (a>b) {
            System.out.println("Yes, the first number is bigger. ");
        } 
        else if (a<b) {
            System.out.println("No, the first number isn't bigger! ");
        }
        else System.out.println("Uhhh... I don't know if the first number was bigger...");
    }
}
