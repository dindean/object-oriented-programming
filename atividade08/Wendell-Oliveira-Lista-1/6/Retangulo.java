public class Retangulo extends Figura{
    private double area = 0.0;

    public Retangulo (double a, double b) {
        this.area = a * b;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "area=" + area +
                '}';
    }
}
