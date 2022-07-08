import java.util.LinkedList;

public class Fila {
    private LinkedList fila = new LinkedList();

    public void efileira (Object objAux) {
        this.fila.add(objAux);
    }

    public Object desenfileira () {
        return this.fila.removeFirst();
    }

    public String vazio () {
        if (this.fila.size() == 0)
             return "Fila esta vaiza!";
        else
            return "Fila nao esta vazia e contem " + this.fila.size() + " elementos..";

    }
}
