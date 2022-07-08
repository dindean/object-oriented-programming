public class Paralelogramo extends Figura{
    private double area = 0.0;

    public Paralelogramo (double a, double b) {
        this.area = a * b;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return "Paralelogramo{" +
                "area=" + area +
                '}';
    }
}
