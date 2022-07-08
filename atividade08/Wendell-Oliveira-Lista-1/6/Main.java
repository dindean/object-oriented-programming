
public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(3);
        Paralelogramo p = new Paralelogramo(4.5, 3.2);
        Retangulo r = new Retangulo(6.7, 2.2);
        Quadrado q = new Quadrado(4.3, 7.7);
        Losango l = new Losango(6.1, 3.9);
        Triangulo t = new Triangulo(3.5, 5.9);
        TrianguloRetangulo tr = new TrianguloRetangulo(9.1, 1.9);

        System.out.println(c.toString());
        System.out.println();

        System.out.println(p.toString());
        System.out.println();

        System.out.println(r.toString());
        System.out.println();

        System.out.println(q.toString());
        System.out.println();

        System.out.println(l.toString());
        System.out.println();

        System.out.println(t.toString());
        System.out.println();

        System.out.println(tr.toString());
        System.out.println();

    }
}
