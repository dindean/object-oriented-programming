public class Circulo extends Figura{
    private int raio = 0;
    private double area = 0.0;

    public Circulo (int raio) {
        this.raio = raio;
        this.area = 3.1415 * (raio * raio);
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", area=" + area +
                '}';
    }
}
