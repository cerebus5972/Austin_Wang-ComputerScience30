import java.util.Scanner;
import java.lang.Math;

public class QuadraticFormulaMethods {

    private double a, b, c, plusroot, minusroot;
    Scanner sc = new Scanner(System.in);

    public QuadraticFormulaMethods() {
        a = 0;
        b = 0;
        c = 0;
        plusroot = 0;
        minusroot = 0;
    }

    public void inputnumbers() {
        System.out.print("\nPlease input the coefficient of x^2: ");
        a = sc.nextDouble();
        System.out.print("Please input the coefficient of x: ");
        b = sc.nextDouble();
        System.out.print("Please input the constant of your equation: ");
        c = sc.nextDouble();
    }

    public void calculate() {
        plusroot = Math.floor(100*(-b + Math.sqrt(Math.pow(b,2)-4*a*c))/2/a)/100;
        minusroot = Math.floor(100*(-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/2/a)/100;
    }

    public void finish() {
        System.out.println("\nThe roots of your equation, (" + a + ")x^2 + (" + b + ")x + (" + c + ") are " + plusroot + " and " + minusroot + ". \n");
    }
}
