public class Rectangle {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double calculateArea (double a, double b) {
        return a * b;
    }
    double calculatePerimeter (double a, double b) {
        return 2*a+2*b;
    }
}
