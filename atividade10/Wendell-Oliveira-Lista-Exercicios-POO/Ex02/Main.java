import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Double> seqNums = new Vector<>();

        Scanner inputing = new Scanner(System.in);

        Double i;
        while (inputing.hasNext()) {
            i = inputing.nextDouble();

            if (i == 0) break;
            else
                seqNums.add(i);
        }


        double media = retornaMedia(seqNums);

        System.out.println("NUMS: " + seqNums);
        System.out.println("MEDIA: " + media);

    }

    public static double retornaMedia (Vector<Double> nums) {
        double m = 0;
        for (double cont : nums) {
            m += cont;
        }
        m /= nums.size();

        return m;
    }
}
