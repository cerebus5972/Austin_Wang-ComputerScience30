import java.lang.Math;
import java.util.Scanner;

public class TriangleMethods {

    private double a, b, c, perimeter, area, s;
    Scanner sc = new Scanner(System.in);

    public TriangleMethods() {
        a = 0;
        b = 0;
        c = 0;
        perimeter = 0;
        s = 0;
        area = 0;
    }
    
    public void inputsides() {
        System.out.print("\nPlease input the first side length: ");
        a = sc.nextDouble();
        System.out.print("\nPlease input the second side length: ");
        b = sc.nextDouble();
        System.out.print("\nPlease input the third side length: ");
        c = sc.nextDouble();
    }
    public void findp() {
        perimeter = (a+b+c);
    }

    public void finds() {
        s = perimeter/2;
    }

    public void finda() {
        area = Math.sqrt((s-a)*(s-b)*(s-c)*s);
        System.out.println("\nYour triangle's area is " + area + ".\n");
    }
}
