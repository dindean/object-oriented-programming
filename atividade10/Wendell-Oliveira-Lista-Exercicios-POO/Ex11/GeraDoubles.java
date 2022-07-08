import java.util.LinkedList;
import java.util.Random;

public class GeraDoubles {
    private Random random = new Random();
    private LinkedList listaDoubles = new LinkedList();

    public GeraDoubles (int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            listaDoubles.add(random.nextDouble()*100);
        }
    }

    public LinkedList getListaDoubles() {
        return listaDoubles;
    }
}
