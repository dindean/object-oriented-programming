import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vetInt = new Vector<>();
        Inteiro novoInteiro = new Inteiro();

        vetInt.add(3);
        vetInt.add(7);
        vetInt.add(8);
        vetInt.add(2);
        vetInt.add(82);
        vetInt.add(123);
        vetInt.add(9);
        vetInt.add(11);
        vetInt.add(64);
        vetInt.add(75);

        novoInteiro.setVetInt(vetInt);

        System.out.println("O vetor de inteiros: " + vetInt);
        System.out.println("O Maior e: " + novoInteiro.maiorInt());
    }
}
