public class ShapeCalculatorTest {
    public static void main(String[] args) {

        ShapeCalculator calculator = new ShapeCalculator();

        Square squa1 = new Square(9.0);
        System.out.println("Square perimeter is "+calculator.squarePerimeter(squa1));
        System.out.println("Square area is "+calculator.squareArea(squa1));

        Rectangle rect1 = new Rectangle(3.0, 7.0);
        System.out.println("Rectangle perimeter is "+calculator.rectPerimeter(rect1));
        System.out.println("Rectangle area is "+calculator.rectArea(rect1));

        Circle circ1 = new Circle(4.0);
        System.out.println("Circle perimeter is "+calculator.circlePerimeter(circ1));
        System.out.println("Circle area is "+calculator.cirecleArea(circ1));

        Triangle tri1 = new Triangle(11.0, 16.0, 14,13.0);
        System.out.println("Tiangle perimetr is "+calculator.trianglePerimeter(tri1));
        System.out.println("Triangle area is "+calculator.triangleArea(tri1));
    }
}
