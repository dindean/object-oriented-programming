public class ABB {
    NoDeArvore raiz = new NoDeArvore();

    public ABB () {
        this.raiz.item = 0;
        this.raiz.direita = null;
        this.raiz.esquerda = null;
    }

    public void inserir (int chave) {
        inserirChave(chave, this.raiz);
    }

    private void inserirChave (int chave, NoDeArvore noAux) {
        if (noAux == null) {
            noAux.item = chave;
            noAux.esquerda = null;
            noAux.direita = null;
        }
        else {
            if (chave >= noAux.item)
                inserirChave(chave, noAux.direita);
            else
                inserirChave(chave, noAux.esquerda);
        }
    }

    public NoDeArvore buscar (int chave) {
        NoDeArvore noAux;

        noAux = busque(chave, this.raiz);

        return noAux;
    }

    private NoDeArvore busque (int chave, NoDeArvore noAux) {
        if (noAux == null)
            return null;
        else if (noAux.item == chave)
            return noAux;
        else if (chave >= noAux.item)
            busque(chave, noAux.direita);
        else
            busque(chave, noAux.esquerda);

        return null;
    }

    public void remover (int chave) {
        remova(chave, this.raiz);
    }

    private void remova (int chave, NoDeArvore noAux) {
        NoDeArvore outroNo;
        if (noAux == null)
            return;
        else if (noAux.direita.item == chave) {
            if (noAux.direita.direita == null && noAux.direita.esquerda == null) {
                noAux.direita = null;
            }
            else if (noAux.direita.direita != null && noAux.direita.esquerda == null) {
                outroNo = menorNo(noAux.direita.direita);
                noAux.direita.item = outroNo.item;
                excluiNoFolha(outroNo, noAux.direita.direita);
            }
            else if (noAux.direita.esquerda != null && noAux.direita.direita == null) {
                outroNo = maiorNo(noAux.direita.esquerda);
                noAux.direita.item = outroNo.item;
                excluiNoFolha(outroNo, noAux.direita.esquerda);
            }
            else {
                outroNo = menorNo(noAux.direita.direita);
                noAux.direita.item = outroNo.item;
                excluiNoFolha(outroNo, noAux.direita.direita);
            }
        }
        else if (noAux.esquerda.item == chave) {
            if (noAux.esquerda.direita == null && noAux.esquerda.esquerda == null) {
                noAux.esquerda = null;
            }
            else if (noAux.esquerda.direita != null && noAux.esquerda.esquerda == null) {
                outroNo = menorNo(noAux.esquerda.direita);
                noAux.esquerda.item = outroNo.item;
                excluiNoFolha(outroNo, noAux.esquerda.direita);
            }
            else if (noAux.esquerda.esquerda != null && noAux.esquerda.direita == null) {
                outroNo = maiorNo(noAux.esquerda.esquerda);
                noAux.esquerda.item = outroNo.item;
                excluiNoFolha(outroNo, noAux.esquerda.esquerda);
            }
            else {
                outroNo = menorNo(noAux.esquerda.direita);
                noAux.esquerda.item = outroNo.item;
                excluiNoFolha(outroNo, noAux.esquerda.direita);
            }
        }
        else if (chave >= noAux.item)
            remova(chave, noAux.direita);
        else
            remova(chave, noAux.esquerda);
    }

    private void excluiNoFolha (NoDeArvore noExcluir, NoDeArvore noAux) {

        if (noAux.direita.item == noExcluir.item)
            noAux.direita = null;
        else if (noAux.esquerda.item == noExcluir.item)
            noAux.esquerda = null;
        else if (noExcluir.item >= noAux.item)
            excluiNoFolha(noExcluir, noAux.direita);
        else if (noExcluir.item < noAux.item)
            excluiNoFolha(noExcluir, noAux.esquerda);

    }

    private NoDeArvore menorNo (NoDeArvore subArv) {
        if (subArv.esquerda == null)
            return subArv;
        else
            menorNo(subArv.esquerda);

        return null;
    }

    private NoDeArvore maiorNo (NoDeArvore subArv) {
        if (subArv.direita == null)
            return subArv;
        else
            maiorNo(subArv.direita);

        return null;
    }

    public int somaItems () {
       int i = somarItems(this.raiz);
       return i;
    }

    private int somarItems (NoDeArvore noAux) {
        int soma = 0;

        if (noAux == null)
            return 0;
        else {
            somarItems(noAux.direita);
            somarItems(noAux.esquerda);
            soma += noAux.item;
        }
        return soma;
    }

    public void imprimir () {
        imprimirArvore(this.raiz);
    }

    private void imprimirArvore (NoDeArvore noAux) {
        if (noAux == null)
            return;
        else {
            imprimirArvore(noAux.direita);
            imprimirArvore(noAux.esquerda);
            System.out.print(noAux.item + " ");
        }
        System.out.println();
    }
}
