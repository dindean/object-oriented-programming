public class Conta {
    private double saldo;
    private int numero;

    public Conta (int a) {
        saldo = 0.0;
        numero = a;
    }

    public Conta () {
        saldo = 0.0;
        numero = 0;
    }

    public void debitar (double quantia) {
        if (quantia > 0 )
            saldo += quantia;
        else
            System.err.println("Conta.deposita(...): " + "nao se pode depositar uma quantia negativa.");
    }

    public void creditar (double quantia) {
        if (quantia > 0 && saldo >= quantia)
            saldo -= quantia;
        else
            System.err.println("Conta.saca(...): " + "nao se pode sacar uma qunatia negativa.");
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void imprime () {
        System.out.println("Conta " + numero + ": " + "saldo = " + saldo);
    }
}

class ContaPoupanca extends Conta {
    private double juros = 1.035;

    public void adcionaJuros () {
        setSaldo(getSaldo() * juros);
    }
}

class ContaCorrete extends Conta {
    private double limite;

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
}
