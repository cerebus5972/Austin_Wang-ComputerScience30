/* 
Austin Wang
Mr. Fox
AP Computer Science 30
4 november 2024

Cool Numbers
Asks the user to input a number, then returns the amount of "cool" numbers that are between 6 and that number. 
A "cool number" is defined as a number that is divisible by 3, 4, 5, and 6. 
 */

public class App {
    public static void main(String[] args) throws Exception {
        CoolNumbersMethods cnm = new CoolNumbersMethods();
        cnm.getnumber();
        cnm.checknumbers();
        cnm.returnnumbers();
    }
}
