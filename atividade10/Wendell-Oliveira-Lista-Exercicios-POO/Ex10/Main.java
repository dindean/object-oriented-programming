import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Fila novaFila = new Fila();

        novaFila.efileira(3);
        novaFila.efileira(4);
        novaFila.efileira(8);
        novaFila.efileira(1);

        System.out.println("Este elemento foi desenfileirado: " + novaFila.desenfileira());

        System.out.println("A pilha esta vazia? ");
        System.out.println(novaFila.vazio());
    }
}
