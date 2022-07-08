public class Triangulo extends Figura{
    private double area = 0.0;

    public Triangulo (double a, double b) {
        this.area = (a * b) / 2;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "area=" + area +
                '}';
    }
}
