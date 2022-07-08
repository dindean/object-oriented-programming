import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        String nameFile = "";
        Map<String, String> mapTxt = new HashMap<>();

        System.out.println("Entre com o nome do arquivo de texto a ser lido: ");
        Scanner inTxt = new Scanner(System.in);
        nameFile = inTxt.next();


        try {
            br = new BufferedReader(new FileReader(nameFile));
            String str;
            while ((str = br.readLine()) != null) {
                String[] aux = str.split(" ");
                String n = aux[0].trim(), i = aux[1].trim();
                if (!n.equals("") && !i.equals(""))
                    mapTxt.put(aux[0], aux[1]);
            }
        }
        catch (IOException e) {
            System.out.println("Desculpa, arquivo não encontrado...");
        }
        finally {
            if (br != null)
                br.close();
            if (bw != null)
                bw.close();
        }

        for (Map.Entry<String, String> entry :
                mapTxt.entrySet()) {
            System.out.println(entry.getKey() + " "
                    + entry.getValue());
        }
    }
}
