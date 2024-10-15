/*/

Austin Wang
Mr. Fox
Computer Science 30
15 October 2024

Triangle Area Calculator

This program uses a constructor and Heron's formula to calculate the area of a given triangle with four methods: 
inputting the side lengths, finding the perimeter, halving the perimeter, and finally, finding the area. 

/*/

public class App {
    public static void main(String[] args) throws Exception {
        TriangleMethods tt = new TriangleMethods();
        tt.inputsides();
        tt.findp();
        tt.finds();
        tt.finda();
    }
}
