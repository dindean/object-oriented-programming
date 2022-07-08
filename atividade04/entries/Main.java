import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int ladoq  = 0, ladot1 = 0, ladot2 = 0, ladot3 = 0;
        String str = "";

        System.out.println("Deseja Criar um quadrado ou triangulo?");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader entr = new BufferedReader(isr);

        try {
            str = entr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        str.toLowerCase();
        str = str.trim();

        if (str.equals("triangulo")) {
            System.out.println("Entre com os tres lados do Triangulo: ");

            Scanner l1 = new Scanner(System.in);
            ladot1 = l1.nextInt();

            ladot2 = l1.nextInt();

            ladot3 = l1.nextInt();

            Triangulo novoTri = new Triangulo(ladot1, ladot2, ladot3);

            System.out.println("A area do triangulo e: " + novoTri.areaTriangulo());
            System.out.println("O perimetro do triangulo e: " + novoTri.perimetroTriangulo());
            System.out.println("O triangulo e: " + novoTri.tipoTriangulo());

        } else if (str.equals("quadrado")) {
            System.out.println("Entre com o lado do Quadrado: ");

            Scanner l = new Scanner(System.in);
            ladoq = l.nextInt();

            Quadrado novoQuad0 = new Quadrado(ladoq);

            System.out.println("A area do quadrado e: " + novoQuad0.calcularArea());
            System.out.println("O perimetro do quadrado e: " + novoQuad0.perimetroQuadrado());
        } else {
            System.out.println("Entre com uma figura geometrica valida..");
        }
    }
}
