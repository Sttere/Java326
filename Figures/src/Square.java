public class Square extends Figure {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void print() {

    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public double area() {
        return Math.pow(side,2);
    }

    @Override
    public String toString() {
        return "Сторона квадрата = " + side + ", Периметр = " + perimeter() + " Площадь = " + area();
    }


}