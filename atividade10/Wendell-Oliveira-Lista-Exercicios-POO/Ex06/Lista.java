public class Lista {
    private No primeiroItem;
    private No ultimoItem;
    private int tamanho;

    public void setPrimeiroItem(No primeiroItem) {
        this.primeiroItem = primeiroItem;
    }

    public void setUltimoItem(No ultimoItem) {
        this.ultimoItem = ultimoItem;
    }

    public No getPrimeiroItem() {
        return primeiroItem;
    }

    public No getUltimoItem() {
        return ultimoItem;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Lista() {
        this.primeiroItem = null;
        this.ultimoItem = null;
        this.tamanho = 0;
    }

    public void inserir(int chave) {
        No novoItem = new No();
        novoItem.setDado(chave);

        if (this.tamanho == 0) {
            novoItem.setProx(ultimoItem);

            this.primeiroItem = novoItem;
            this.ultimoItem = novoItem;
            this.tamanho++;
        } else {
            this.ultimoItem.setProx(novoItem);
            this.ultimoItem = novoItem;
            this.tamanho++;
        }
    }

    public No buscar(int chave) {
        No aux;

        aux = this.primeiroItem;

        while (aux != null) {
            if (aux.getDado() == chave)
                return aux;
            aux = aux.getProx();
        }
        return null;
    }

    public void remover(int chave) {
        No aux;

        aux = this.primeiroItem;

        while (aux != null) {
            if (aux.getProx().getDado() == chave) {
                aux.setProx(aux.getProx().getProx());
                this.tamanho--;
                return;
            }
            aux = aux.getProx();
        }
    }

    public Lista inverteLista() {
        Lista auxLista = new Lista();

        auxLista.inserir(this.getUltimoItem().getDado());

        if (this.getTamanho() > 1) {
            No aux = this.getPrimeiroItem();
            while (aux != null) {
                if (this.getTamanho() == auxLista.getTamanho()) break;

                if (aux.getProx().getDado() == auxLista.getUltimoItem().getDado()) {
                    auxLista.inserir(aux.getDado());
                    aux = this.getPrimeiroItem();
                } else
                    aux = aux.getProx();
            }
        } else if (this.getTamanho() == 1)
            return auxLista;

        return auxLista;
    }

    public int somaElementos() {
        No aux = this.getPrimeiroItem();
        int soma = 0;

        while (aux != null) {
            soma += aux.getDado();
            aux = aux.getProx();
        }
        return soma;
    }

    public void imprimir() {
        System.out.println("Esta e uma Lista Simples Dinamicamente Encadeada, com " + this.tamanho + " elementos..");
        if (tamanho == 0) {
            System.out.println("Lista Vazia!");
        } else {
            No aux = this.primeiroItem;

            while (aux != null) {
                System.out.print(aux.getDado() + " ");
                aux = aux.getProx();
            }
            System.out.println();
        }
    }


}
