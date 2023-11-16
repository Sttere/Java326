public class Triangle extends Figure{
    private int catet1;
    private int catet2;
    private int hypotenuse;

    public int getCatet1() {
        return catet1;
    }

    public void setCatet1(int catet1) {
        this.catet1 = catet1;
    }

    public int getCatet2() {
        return catet2;
    }

    public void setCatet2(int catet2) {
        this.catet2 = catet2;
    }

    public int getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(int hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public Triangle(int catet1, int catet2, int hypotenuse) {
        this.catet1 = catet1;
        this.catet2 = catet2;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public void print() {

    }

    @Override
    public double perimeter() {
        return catet1 + catet2 + hypotenuse;
    }

    @Override
    public double area() {
        double p = perimeter()/2;
        return Math.sqrt(p*(p-catet1)*(p-catet2)*(p-hypotenuse));
    }

    @Override
    public String toString() {
        return "Стороны треугольника = " + catet1 + ", " + catet2 + ", " + getHypotenuse() + ", Периметр = " + perimeter() + ", Площадь = " + area();
    }


}