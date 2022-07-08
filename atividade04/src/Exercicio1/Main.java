import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Conta novaConta = new Conta(111);

        novaConta.setSaldo(950.7);
        novaConta.debitar(134.5);
        novaConta.creditar(357.9);

        System.out.println("O saldo da conta " + novaConta.getNumero() + " e " + novaConta.getSaldo());

        ContaPoupanca novaContaPP = new ContaPoupanca();

        novaContaPP.setNumero(976);
        novaContaPP.setSaldo(1579.6);
        novaContaPP.debitar(187.9);
        novaContaPP.creditar(221.3);

        System.out.println("O saldo da conta " + novaContaPP.getNumero() + " e " + novaContaPP.getSaldo());

        ContaCorrete novaContaCC = new ContaCorrete();

        novaContaCC.setNumero(323);
        novaContaCC.setSaldo(5987.7);
        novaContaCC.debitar(359.9);
        novaContaCC.creditar(123.3);

        System.out.println("O sado da conta " + novaContaCC.getNumero() + " e " + novaContaCC.getSaldo());
    }
}
