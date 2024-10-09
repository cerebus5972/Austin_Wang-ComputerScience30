public class App {
    public static void main(String[] args) throws Exception {
        System.out.print(5/0);
        GeometeryCalculatorRunner calculator = new GeometeryCalculatorRunner();
        calculator.findrectangleperimeter(4.3, 6.5);
        calculator.findcubearea(1.2);
        calculator.findcirclearea(4.7);
        calculator.returnanswers();
    }
}
