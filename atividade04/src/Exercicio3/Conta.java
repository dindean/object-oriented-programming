public class Conta {
    private double saldo;
    private int numero;
    private String tipo = "normal";

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

    public String getTipo() {
        return tipo;
    }

    public void imprime () {
        System.out.println("Conta " + numero + ": " + "saldo = " + saldo);
    }
}

class ContaPoupanca extends Conta {
    private double juros = 1.035;
    private String tipo = "poupanca";

    @Override
    public String getTipo() {
        return tipo;
    }

    public double getJuros() {
        return juros;
    }

    public void adcionaJuros () {
        setSaldo(getSaldo() * juros);
        System.out.println("O novo saldo da conta e " + getSaldo());
    }
}

class ContaCorrete extends Conta {
    private double limite;
    private String tipo = "corrente";

    @Override
    public String getTipo() {
        return tipo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public boolean estouroLimite () {
        if (limite == getSaldo())
            return true;

        return false;
    }
}
