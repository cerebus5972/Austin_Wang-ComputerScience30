import java.util.Scanner;
public class NumberCompareMethods {

    private int a, b;
    Scanner sc = new Scanner(System.in);

    public void getnumbers() {
        System.out.print("Please input your first number: ");
        a = sc.nextInt();
        System.out.print("Please input your second number: ");
        b = sc.nextInt();
    }

    public void returnnumbers() {
        System.out.println("Your numbers were " + a + " and " + b + ". ");
        if (a>b) System.out.println(a + "is larger than " + b + ". ");
        else if (a < b) System.out.println(a + " is smaller than " + b + ". ");
        else System.out.println("The two numbers are the same. ");
    }
}
