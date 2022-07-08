public class Quadrado {
    private double lado, area = 0;

    public Quadrado (double l) {
        lado = l;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double calcularArea () {
        area = lado * lado;
        return area;
    }

}
