import java.util.Scanner;
public class MilesperHourMethods {

    Scanner sc = new Scanner(System.in);
    private double miles, hours, minutes, totaltimeinhours, mph;

    public MilesperHourMethods(){
        miles = 0;
        hours = 0;
        minutes = 0;
        totaltimeinhours = 0;
        mph = 0;
    }

    public void inputnumbers() {
        System.out.print("\nHow many miles have you driven? ");
        miles = sc.nextDouble();
        System.out.print("How many hours did this trip take? ");
        hours = sc.nextDouble();
        System.out.print("How many extra minutes did this trip take? ");
        minutes = sc.nextDouble();
    }

    public void findtime() {
        totaltimeinhours = hours + minutes/60;
    }

    public void findmph() {
        mph = 100*miles/totaltimeinhours;
        mph = (int)(mph);
        mph = mph/100;
    }

    public void finish() {
        System.out.println("\nYou took " + hours + " hours and " + minutes + " minutes to drive " + miles + " miles.");
        System.out.println("This means that your average speed was " + mph + " miles per hour.\n");
    }
}
