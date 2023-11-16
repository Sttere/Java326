public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void print() {

    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double area() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Радиус круга = " + radius + ", Периметр = " + perimeter() + ", Площадь = " + area();

    }

}