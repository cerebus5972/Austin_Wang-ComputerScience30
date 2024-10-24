import java.util.Scanner;

public class LeapYearMethods {

    private int year;
    Scanner sc = new Scanner(System.in);

    public void getInput() {
        System.out.print("What year is it? ");
        year = sc.nextInt();
    }

    public void conditionals() {
        if (year%400 == 0 ) {
            System.out.println("It is a leap year. ");
        }
        else if (year%100 == 0) {
            System.out.println("It is not a leap year. ");
        }
        else if (year%4 == 0) {
            System.out.println("It is a leap year. ");
        }
        else System.out.println("It is not a leap year. ");
    }
}
