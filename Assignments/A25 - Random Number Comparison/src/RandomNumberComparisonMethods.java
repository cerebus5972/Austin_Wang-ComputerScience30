import java.lang.Math;
public class RandomNumberComparisonMethods {
    private int a, b;
    public void getnumbers() {
        a = (int) (Math.random()*99) + 1;
        b = (int) (Math.random()*99) + 1;
        System.out.println("The first number is " + a + " and the second number is " + b + ". \n");
    }
    public void comparenumbers() {
        if (a>b) {
            System.out.println("The smaller number is " + b + ". ");
            System.out.println("The larger number is " + a + ". ");
        }

        else {
            System.out.println("The smaller number is " + a + ". ");
            System.out.println("The larger number is " + b + ". ");
        }
        System.out.println("--------------------------");
    }
}
