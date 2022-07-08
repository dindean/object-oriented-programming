import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        String nameFile = "", nameFile2 = "";

        System.out.println("Entre com o nome do arquivo de texto a ser lido: ");
        Scanner inTxt = new Scanner(System.in);
        nameFile = inTxt.next();

        System.out.println("Entre com o nome do arquivo de texto a ser escrito: ");
        nameFile2 = inTxt.next();


        try {
            br = new BufferedReader(new FileReader(nameFile));
            bw = new BufferedWriter(new FileWriter(nameFile2));
            String str;
            while ((str = br.readLine()) != null)
                bw.write(str + "\n");
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
    }
}
