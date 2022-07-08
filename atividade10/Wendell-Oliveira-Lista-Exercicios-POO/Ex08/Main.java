import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        ABB arvore = new ABB();
        NoDeArvore teste;

        arvore.inserir(2);
        arvore.inserir(3);
        arvore.inserir(4);
        arvore.inserir(6);
        arvore.inserir(7);
        arvore.inserir(1);
        arvore.inserir(9);
        arvore.inserir(11);
        arvore.inserir(8);

        teste = arvore.buscar(7);
        System.out.println("Resultado da busca: " + teste.item);

        arvore.remover(6);

        arvore.imprimir();

        System.out.println("A soma dos digitos da ABB e: " + arvore.somaItems());

    }
}
