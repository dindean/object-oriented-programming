//SuperClass gerenciadora de lista
public class Lista {
    private Elemento primeiroElemento;
    private Elemento ultimoElemento;
    int tamanho;

    public Lista () {
        this.primeiroElemento = null;
        this.ultimoElemento = null;
        this.tamanho = 0;
    }
    public void inserir (int chave) {
        Elemento novoElemento = new Elemento();
        novoElemento.setKey(chave);

        if (this.tamanho == 0) {
            novoElemento.setNext(ultimoElemento);

            this.primeiroElemento = novoElemento;
            this.ultimoElemento = novoElemento;
            this.tamanho++;
        }
        else {
            this.ultimoElemento.setNext(novoElemento);
            this.ultimoElemento = novoElemento;
            this.tamanho++;
        }
    }

    public void imprimir () {
        System.out.println("Esta e uma Lista Simples Dinamicamente Encadeada, com " + this.tamanho + " elementos..");
        if (tamanho == 0) {
            System.out.println("Lista Vazia!");
        } else {
            Elemento aux = this.primeiroElemento;

            for (int i = 0; i < this.tamanho; i++){
                System.out.println(aux.getKey());
                aux = aux.getNext();
            }
            System.out.println();
        }
    }


}

//SubClass Pilha, insere topo remove topo
class Pilha extends Lista {
    Elemento topo;
    int tamanho;

    public Pilha () {
        this.topo = null;
        this.tamanho = 0;
    }

    public void inserir (int chave) {
        Elemento novoElemento = new Elemento();

        novoElemento.setKey(chave);

        if (this.tamanho == 0) {
            novoElemento.setNext(this.topo);
            this.topo = novoElemento;
        }
        else {
            novoElemento.setNext(this.topo);
            this.topo = novoElemento;
        }
        this.tamanho++;
    }

    public void remover () {
        Elemento aux;

        aux = this.topo;
        this.topo = this.topo.getNext();
        aux = null;

        this.tamanho--;
    }

    public void imprimir () {
        System.out.println("Esta e uma Pilha Simples Dinamicamente Encadeada, com " + this.tamanho + " elementos..");
        Elemento aux = this.topo;

        if (this.tamanho == 0) {
            System.out.println("A Pilha esta vazia!");
        }
        else {
            for (int i = 0; i < this.tamanho; i++) {
                System.out.println(aux.getKey());
                aux = aux.getNext();
            }
            System.out.println();
        }
    }
}

//SubClass Fila, insere final remove inicio
class Fila extends Lista {
    Elemento inicio;
    Elemento fim;
    int tamanho;

    public Fila () {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserir (int chave) {
        Elemento novoElemento = new Elemento();

        novoElemento.setKey(chave);

        if (this.tamanho == 0) {
            novoElemento.setNext(inicio);
            this.inicio = novoElemento;
            this.fim = novoElemento;
        }
        else {
            this.fim.setNext(novoElemento);
            this.fim = novoElemento;
        }
        this.tamanho++;
    }

    public void remover () {
        Elemento aux;

        aux = this.inicio;
        this.inicio = this.inicio.getNext();
        aux = null;

        this.tamanho--;
    }

    public void imprimir () {
        System.out.println("Esta e uma Fila Simples Dinamicamente Encadeada, com " + this.tamanho + " elementos..");
        Elemento aux;

        if (this.tamanho == 0) {
            System.out.println("A Fila esta Vazia!");
        }
        else {
            aux = this.inicio;

            for (int i = 0; i < this.tamanho; i++) {
                System.out.println(aux.getKey());
                aux = aux.getNext();
            }
            System.out.println();
        }
    }
}