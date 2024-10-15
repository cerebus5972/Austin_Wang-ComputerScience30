/*

Austin Wang
Mr. Fox
Computer Science 30
15 October 2024

Miles per Hour
Asks the user to input the miles, hours, and minutes they used to make their trip, then returns their average speed in miles per hour.

 */

public class App {
    public static void main(String[] args) throws Exception {
        MilesperHourMethods calc = new MilesperHourMethods();
        calc.inputnumbers();
        calc.findtime();
        calc.findmph();
        calc.finish();
    }
}