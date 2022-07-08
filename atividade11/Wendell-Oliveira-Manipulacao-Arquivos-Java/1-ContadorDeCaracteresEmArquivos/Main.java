import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        int[] alfabeto = new int[96];
        String nameFile = "";

        System.out.println("Entre com o nome do arquivo de texto: ");
        Scanner inTxt = new Scanner(System.in);
        nameFile = inTxt.next();


        try {
            br = new BufferedReader(new FileReader(nameFile));
            int c;
            while ((c = br.read() ) != -1){
                if (c == 13 || c == 10)
                    alfabeto[95]++;
                else
                    alfabeto[c - 32]++;
            }
        }
        catch (IOException e) {
            System.out.println("Desculpa, arquivo não encontrado...");
        }
        finally {
            if (br != null)
                br.close();
        }

        for (int i = 0; i < alfabeto.length; i++) {
            char aux = (char) (i + 32);
            if (alfabeto[i] != 0){
                System.out.printf("'" + aux + "'" + ": ");
                System.out.println("Tem " + alfabeto[i] + " unidades");
            }
        }
    }
}
