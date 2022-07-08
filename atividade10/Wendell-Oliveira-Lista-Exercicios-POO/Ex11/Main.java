import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        LinkedList novaLL = new LinkedList();

        GeraDoubles novoGerad = new GeraDoubles(10);

        novaLL = novoGerad.getListaDoubles();

        for (Object d : novaLL) {
            System.out.print(new DecimalFormat("#,##0.000").format(d) + " | ");
        }
        System.out.println();
    }
}
