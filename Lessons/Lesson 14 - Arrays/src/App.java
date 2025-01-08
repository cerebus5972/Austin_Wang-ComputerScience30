import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] nums = null;

        System.out.println("How many numbers would you like to input?");
        int SIZE = sc.nextInt();

        nums = new int[SIZE];

        for (int i = 0; i<nums.length; i++) {
            System.out.println("Please enter an integer: ");
            nums[i] = sc.nextInt();
        }

        System.out.println("Your list of numbers is: ");
    }
}
