public class Triangulo {
    private int lado1, lado2, lado3, perimetro = 0, area = 0;
    private String tipo = "";

    public Triangulo () {
        setLado1(0);
        setLado2(0);
        setLado3(0);
    }

    public Triangulo (int a, int b, int c) {
        setLado1(a);
        setLado2(b);
        setLado3(c);
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }


    public int areaTriangulo () {
        area = lado1 + lado2 + lado3 / 2;
        return area;
    }

    public int perimetroTriangulo () {
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    public String tipoTriangulo () {
        if (lado1 == lado2 && lado1 == lado3) {
            tipo = "equilatero";
        } else if (lado1 == lado2 || lado1 == lado3) {
            tipo = "isoceles";
        } else {
            tipo = "escaleno";
        }
        return tipo;
    }


}
