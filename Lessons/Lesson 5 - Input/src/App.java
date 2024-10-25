import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.print(Math.round(2.5));
        Scanner keys = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = keys.nextInt();
        System.out.println("You selected the number "+ num + ".");
    }
}
