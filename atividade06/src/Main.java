import java.util.Locale;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String teste = new String();
        int tam;

        Scanner str = new Scanner(System.in);

        teste = str.nextLine();

        String[] strAux = teste.split(" ");
        tam = strAux.length;

        String[] strAux2 = new String[tam];

        for (int i = 0; i < strAux.length; i++) {
            strAux[i] += strAux[i].charAt(0);
            strAux[i] += "ay";
            strAux2[i] = strAux[i].substring(1, strAux[i].length());
            strAux2[i].replace("\n", " ");
        }

        for (int i = 0; i < strAux2.length; i++) {
            System.out.printf(strAux2[i]);
            System.out.printf(" ");
        }
        System.out.println();

    }
}
