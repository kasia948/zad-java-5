public class ShapeCalculator {

    public static void main(String[] args) {
        Square square1 = new Square();
        double squArea = square1.calculateArea(2.0);
        System.out.println("Square area is: "+squArea);
        double squPer = square1.calculatePerimeter(3.0);
        System.out.println("Square perimeter is "+squPer);

        Rectangle rect1= new Rectangle();
        double rectArea= rect1.calculateArea(10.0,5.0);
        System.out.println("Rectangle area is "+rectArea);
        double recPer= rect1.calculatePerimeter(10.0,5.0);
        System.out.println("Rectangle perimeter is " + recPer);

        Circle circle1 = new Circle();
        double cirArea= circle1.calculateArea(8.0);
        System.out.println("Circle area is "+cirArea);
        double cirPer= circle1.calculatePerimeter(8.0);
        System.out.println("Circle perimeter is "+cirPer);

        Triangle trangle1= new Triangle();
        double triArea= trangle1.calculateArea(7.0, 3.0);
        System.out.println("Triangle area is "+triArea);
        double triPer=trangle1.calculatePerimeter(7.0,6.0, 5.0);
        System.out.println("Triangle perimetr is "+triPer);
    }
}
