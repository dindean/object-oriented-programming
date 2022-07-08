
public class Main {
    public static void main(String[] args) {
        /*---------------------------------------------*/

        //Instancia um novo objeto da classe Lista
        Lista lse = new Lista();

        //Inserindo alguns valores na lista
        lse.inserir(8);
        lse.inserir(7);
        lse.inserir(5);
        lse.inserir(3);

        //Imprime a Lista
        lse.imprimir();

        /*---------------------------------------------*/

        //Instanciando um novo objeto da classe Pilha
        Pilha pise = new Pilha();

        //Inserindo novos valores na Pilha
        pise.inserir(13);
        pise.inserir(15);
        pise.inserir(17);
        pise.inserir(19);

        //Imprime
        pise.imprimir();

        //Remove topo da pilha
        pise.remover();

        //Imprime
        pise.imprimir();

        /*---------------------------------------------*/

        //Instancia um novo objeto da classe Fila
        Fila fise = new Fila();

        //Inserindo valores na Fila
        fise.inserir(123);
        fise.inserir(321);
        fise.inserir(678);
        fise.inserir(876);

        //Imprime
        fise.imprimir();

        //Remove inicio da fila
        fise.remover();

        //Imprime
        fise.imprimir();

    }
}
