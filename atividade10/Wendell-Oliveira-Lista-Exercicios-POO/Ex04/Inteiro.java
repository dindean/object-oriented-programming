import java.util.Collections;
import java.util.Vector;
import java.util.stream.Stream;

public class Inteiro {
    private Vector<Integer> vetInt = new Vector<>();

    public void setVetInt(Vector<Integer> vetInt) {
        this.vetInt = vetInt;
    }

    public Vector<Integer> getVetInt() {
        return vetInt;
    }

    public int maiorInt() {
        return Collections.max(getVetInt());
    }

}
