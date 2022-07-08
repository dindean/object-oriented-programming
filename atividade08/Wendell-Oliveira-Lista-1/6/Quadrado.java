public class Quadrado extends Retangulo{
    private double area = 0.0;

    public Quadrado (double a, double b) {
        super(a, b);
        this.area = a * b;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "area=" + area +
                '}';
    }
}
