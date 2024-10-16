/* 
Austin Wang
Mr. Fox
Computer Science 30
16 October 2024

A18 - Quadratic Formula
Asks the user to input the coefficients of x^2, x and the constant of a quadratic equation.
Uses the quadratic formula((-b +- sqrt(b^2 - 4ac))/2a) to determine the two roots of the equation, 
if they are real numbers, rounds them to the nearest hundredth, and returns them to the user. 
 */

public class App {
    public static void main(String[] args) throws Exception {
        QuadraticFormulaMethods vi = new QuadraticFormulaMethods();
        vi.inputnumbers();
        vi.calculate();
        vi.finish();
    }
}
