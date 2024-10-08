import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = keys.nextInt();
        System.out.println("You selected the number "+ num + ".");
    }
}
