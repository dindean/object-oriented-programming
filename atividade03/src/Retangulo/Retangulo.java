public class Retangulo {
    private int base, altura;
    private double area = 0, perimetro = 0, relacao = 0;


    public Retangulo () {
        setAltura(7);
        setBase(7);
    }

    public Retangulo (int a, int b) {
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

    public void areaRetangulo () {
        area = base * altura;
    }

    public void perimetroRet () {
        perimetro = 2*base + 2*altura;
    }

    public void relacaoBaseAltura () {
        relacao = base/altura;
    }

    public boolean ehQuadrado () {
        if (base == altura)
            return true;
        else
            return false;
    }

    public void imprimeDimensoesRetangulo () {
        System.out.println("A base do retangulo e: " + base);
        System.out.println("A altura do retangulo e: " + altura);
        System.out.println("A area do retangulo e: " + area);
        System.out.println("O perimetro do retangulo e: " + perimetro);
        System.out.println("A relacao do retangulo e " + relacao + " vezes a base e igual a altura..");
    }


}
