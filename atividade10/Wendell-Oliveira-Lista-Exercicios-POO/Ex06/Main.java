public class Main {
    public static void main(String[] args) {
        Lista novaLista = new Lista();
        Lista listaInvertida = new Lista();

        novaLista.inserir(4);
        novaLista.inserir(3);
        novaLista.inserir(7);
        novaLista.inserir(5);
        novaLista.inserir(9);
        novaLista.inserir(1);
        novaLista.inserir(8);

        novaLista.imprimir();

        No aux;
        aux = novaLista.buscar(5);
        System.out.println("O resultado da busca e: " + aux.getDado());

        novaLista.remover(9);
        System.out.println("Esta lista teve o elemento 9 removido!");
        novaLista.imprimir();

        listaInvertida = novaLista.inverteLista();
        System.out.println("Esta e uma versao invertida da lista original! ");
        listaInvertida.imprimir();

        System.out.println("A soma dos elementos da lista e: " + novaLista.somaElementos());

    }
}
