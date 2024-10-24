/*
Austin Wang
Mr. Fox
AP Computer Science 30
24 October 2024

Add Subtract
 */
import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int a = sc.nextInt();
        System.out.print("Please input your second number: ");
        int b = sc.nextInt();
        System.out.println("Your output is: " +  Math.abs(a-b) );
    }
}
