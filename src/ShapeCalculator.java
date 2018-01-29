public class ShapeCalculator {

    double rectPerimeter(Rectangle rectangle) {
        return 2 * rectangle.a + 2 * rectangle.b;
    }
    double rectArea(Rectangle rectangle) {
        return rectangle.a * rectangle.b;
    }

    double circlePerimeter (Circle circle){
        return 2*Math.PI*circle.r;
    }
    double cirecleArea (Circle circle){
        return Math.PI*Math.pow(circle.r,2);
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.a+triangle.b+triangle.c;
    }
    double triangleArea (Triangle triangle){
        return triangle.a*triangle.h*0.5;
    }

    double squareArea (Square square){
        return square.a*square.a;
    }
    double squarePerimeter (Square square){
        return square.a*4;
    }
}