public class Quadrado {
    private int lado, area = 0, perimetro = 0;

    public Quadrado (int l) {
        lado = l;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public int calcularArea () {
        area = lado * lado;
        return area;
    }

    public int perimetroQuadrado () {
        perimetro = 4*lado;
        return perimetro;
    }

}
