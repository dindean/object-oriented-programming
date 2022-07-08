public class Triangulo {
    private int base, altura;
    private double area = 0;


    public Triangulo () {
        setAltura(5);
        setBase(3);
    }

    public Triangulo (int a, int b) {
        setAltura(a);
        setBase(b);
    }

    public void setBase (int b) {
        this.base = b;
    }

    public void setAltura (int a) {
        this.altura = a;
    }

    public int getBase () {
        return base;
    }

    public int getAltura () {
        return altura;
    }

    public void areaTriangulo () {
        area = (base * altura) / 2;
    }

    public void mostrarArea () {
        if (area == 0) {
            System.out.println("Chame o metodo ** areaTriangulo ** antes do metodo ** mostrarArea **");
        } else {
            System.out.println("A area do triangulo e: " + area);
        }
    }


}
