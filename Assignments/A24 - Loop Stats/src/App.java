/*

Austin Wang
Mr. Fox
Computer Science AP30
12 November 2024

Loop Stats
Asks the user for the smallest and the largest integer in their list, then returns the 
sum of the given list, the amount of even numbers and the amount of odd numbers in that list. 

 */


public class App {
    public static void main(String[] args) throws Exception {
        LoopStatsMethods lsm = new LoopStatsMethods();
        lsm.getnumbers();
        lsm.count();
        lsm.returnanswers();
    }
}
