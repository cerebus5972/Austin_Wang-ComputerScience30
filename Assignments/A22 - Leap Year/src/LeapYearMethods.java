import java.util.Scanner;

public class LeapYearMethods {

    private int year;
    Scanner sc = new Scanner(System.in);

    public void getInput() {
        System.out.print("\nWhat year is it? ");
        year = sc.nextInt();
    }

    public boolean conditionals() {
        if (year%400 == 0 ) {
            return true;
        }
        else if (year%100 == 0) {
            return false;
        }
        else if (year%4 == 0) {
            return true;
        }
        else return false;
    }

    public void finish(boolean yesorno) {
        if (yesorno) System.out.println(year + " is a leap year. \n");
        else System.out.println(year + " is not a leap year.\n");
    }
}
