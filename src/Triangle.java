public class Triangle {
    double a;
    double h;
    double b;
    double c;

    public Triangle(double a, double h, double b, double c) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }

    double calculateArea (double a, double h) {
        return a * h*0.5;
    }
    double calculatePerimeter (double a, double b, double c) {
        return a+b+c;
    }
}

