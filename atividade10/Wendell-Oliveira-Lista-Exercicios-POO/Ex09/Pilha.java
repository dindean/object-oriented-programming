import java.util.LinkedList;

public class Pilha {
    private LinkedList pilha = new LinkedList();
    private Object topo;

    public Object pop () {
        Object aux = this.topo;
        this.pilha.removeLast();
        this.topo = pilha.getLast();
        return aux;
    }

    public void push (Object objAux) {
        this.pilha.add(objAux);
        this.topo = this.pilha.getLast();
    }

    public Object top () {
        return this.topo;
    }
}
