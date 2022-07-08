public class TrianguloRetangulo extends Triangulo{
    private double area = 0.0;

    public TrianguloRetangulo (double a, double b) {
        super(a, b);
        this.area = (a * b) / 2;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "TrianguloRetangulo{" +
                "area=" + area +
                '}';
    }
}
