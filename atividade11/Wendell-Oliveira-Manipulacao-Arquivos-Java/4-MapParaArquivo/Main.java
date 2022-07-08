import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = null;
        String strAux = "";
        Map<String, String> mapTxt = new HashMap<>();

        System.out.println("Entre com o número de linhas a serem inseridas: ");
        Scanner num = new Scanner(System.in);
        int count = num.nextInt();

        System.out.println("Entre com as palavras e números abaixo: ");
        for (int i = 0; i < count; i++) {
            Scanner inTxt = new Scanner(System.in);
            strAux = inTxt.nextLine();
            String[] aux = strAux.split(" ");
            String n = aux[0].trim(), m = aux[1].trim();
            if (!n.equals("") && !m.equals(""))
                mapTxt.put(n, m);
        }


        try {
            bw = new BufferedWriter(new FileWriter("output2.txt"));
            for (Map.Entry<String, String> entry : mapTxt.entrySet()) {
                bw.write(entry.getKey() + " " + entry.getValue() + "\n");
            }
        }
        catch (IOException e) {
            System.out.println("Desculpa, arquivo não encontrado...");
        }
        finally {
            if (bw != null)
                bw.close();
        }
    }
}
