import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> seqNums = new Vector<>();

        Scanner inputing = new Scanner(System.in);

        int i;
        while (inputing.hasNext()) {
            i = inputing.nextInt();

            if (i == 0) break;
            else
                seqNums.add(i);
        }

        Collections.sort(seqNums);

        System.out.println("NUMS: " + seqNums);

    }
}
