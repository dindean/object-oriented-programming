import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Conta novaConta = new Conta(0011);
        Banco nossoBanco = new Banco();

        novaConta.setSaldo(950.7);
        novaConta.debitar(134.5);
        novaConta.creditar(357.9);

        nossoBanco.setContas(novaConta);

        ContaPoupanca novaContaPP = new ContaPoupanca();

        novaContaPP.setNumero(0034);
        novaContaPP.setSaldo(1579.6);
        novaContaPP.debitar(187.9);
        novaContaPP.creditar(221.3);

        nossoBanco.setContas(novaContaPP);


        ContaCorrete novaContaCC = new ContaCorrete();

        novaContaCC.setNumero(0067);
        novaContaCC.setSaldo(5987.7);
        novaContaCC.debitar(359.9);
        novaContaCC.creditar(123.3);

        nossoBanco.setContas(novaContaCC);

        nossoBanco.imprime();
    }
}
