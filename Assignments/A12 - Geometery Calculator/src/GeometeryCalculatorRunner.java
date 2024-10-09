import java.lang.Math;

public class GeometeryCalculatorRunner {
    public double rectangleperimeter, cubearea, circlearea;

    public void findrectangleperimeter(double length, double width) {
        rectangleperimeter = 2*(length + width);
        rectangleperimeter = (int)(rectangleperimeter*100);
        rectangleperimeter = rectangleperimeter/100;
    }

    public void findcubearea(double sidelength) {
        cubearea = 6*sidelength*sidelength;
        cubearea = (int)(cubearea*100);
        cubearea = cubearea/100;
    }

    public void findcirclearea(double radius) {
        circlearea = radius*radius*Math.PI;
        circlearea = (int)(circlearea*100);
        circlearea = circlearea/100;
    }

    public void returnanswers() {
        System.out.println("Your rectangle's perimeter is " + rectangleperimeter + ".");
        System.out.println("Your cube's surface area is " + cubearea + ".");
        System.out.println("Your circle's area is " + circlearea + ".");
    }
}
