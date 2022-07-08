import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        ContadorDePalavras ctdPlv = new ContadorDePalavras();
        Vector<numPalavras> numPlv = new Vector<>();

        ctdPlv.adiciona("ola voce ola eu ola vos ola nos");
        numPlv = ctdPlv.getListaPalavras();

        for (int i = 0; i < numPlv.size(); i++){
            System.out.print(numPlv.get(i).getPalavra());
            System.out.print(numPlv.get(i).getQtd());
            System.out.println();
        }
    }
}
