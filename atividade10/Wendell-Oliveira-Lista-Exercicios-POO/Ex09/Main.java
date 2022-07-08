import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Pilha novaPilha = new Pilha();

        novaPilha.push(2);
        novaPilha.push(4);
        novaPilha.push(6);
        novaPilha.push(7);
        novaPilha.push(3);

        System.out.println("Elemento removido do topo: " + novaPilha.pop());

        System.out.println("Elemento no topo: " + novaPilha.top());
    }
}
