import java.util.Scanner;

public class Main {
    public static int NUM_PRIMOS = 0;

    public static void main(String[] args) throws InterruptedException {
        int numTrd, numIni, numFim;

        System.out.println("Entre com o número de threads: (1 a 5)");
        Scanner sc = new Scanner(System.in);
        numTrd = sc.nextInt();

        System.out.println("Entre com o intervalo de inteiros: (ínicio - fim)");
        numIni = sc.nextInt();
        numFim = sc.nextInt();

        //Criando o numero de inteiros que cada thread vai executar, e a partir de qual posição elas irão executar
        int range = (numFim - numIni)/numTrd;
        int inicioUm = numIni+range;
        int inicioDois = inicioUm + range;
        int inicioTres = inicioDois + range;
        int inicioQuatro = inicioTres + range;

        //Instancia as novas threads
        //As threads são novas, porém só serão vivas de acordo com o número de threads solicitadas pelo usuário
        Thread trdZero = new Thread(new ThreadPrimos(range, numIni));
        Thread trdUm = new Thread(new ThreadPrimos(range, inicioUm));
        Thread trdDois = new Thread(new ThreadPrimos(range, inicioDois));
        Thread trdTres = new Thread(new ThreadPrimos(range, inicioTres));
        Thread trdQuatro = new Thread(new ThreadPrimos(range, inicioQuatro));

        //Switch-Case para iniciar apenas o número de threads que o usuário solicitar
        switch (numTrd) {
            case 1:
                trdZero.start();
                trdZero.join();
                break;
            case 2:
                trdZero.start();
                trdZero.join();
                trdUm.start();
                trdUm.join();
                break;
            case 3:
                trdZero.start();
                trdZero.join();
                trdUm.start();
                trdUm.join();
                trdDois.start();
                trdDois.join();
                break;
            case 4:
                trdZero.start();
                trdZero.join();
                trdUm.start();
                trdUm.join();
                trdDois.start();
                trdDois.join();
                trdTres.start();
                trdTres.join();
                break;
            case 5:
                trdZero.start();
                trdZero.join();
                trdUm.start();
                trdUm.join();
                trdDois.start();
                trdDois.join();
                trdTres.start();
                trdTres.join();
                trdQuatro.start();
                trdQuatro.join();
                break;
            default:
                System.out.println("Numero de threads incompatível..");
                break;
        }
        System.out.println("Numero de primos é: " + NUM_PRIMOS);
    }


    static class ThreadPrimos implements Runnable {
        private int range = 0;
        private int inicio = 0;
        private int numPrimos = 0;

        public ThreadPrimos (int range, int inicio) {
            this.range = range;
            this.inicio = inicio;
        }

        @Override
        public void run() {
            for (int i = this.inicio; i < (this.range + this.inicio); i++) {
                if (i == 2 || i == 3 || i == 5 || i == 7)
                    this.numPrimos++;
                else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i != 1)
                    this.numPrimos++;
            }
            NUM_PRIMOS += this.numPrimos;
        }
    }
}