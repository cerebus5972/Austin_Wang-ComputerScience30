/*

Austin Wang
Mr. Fox
Computer Science AP30
13 November 2024

Random Number Comparison
Takes two random integers between 1 and 100, then says which one is the larger one and which one is smaller.

*/
public class App {
    public static void main(String[] args) throws Exception {
        RandomNumberComparisonMethods rncm = new RandomNumberComparisonMethods();
        for (int n = 0; n<10; n++) {
            rncm.getnumbers();
            rncm.comparenumbers();
        }
    }
}
