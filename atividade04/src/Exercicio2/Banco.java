import java.util.ArrayList;

public class Banco {
     private ArrayList<Conta> contas = new ArrayList<Conta>();

    public void setContas(Conta contas) {
        this.contas.add(contas);
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void imprime () {
        for (Conta c : contas) {
            System.out.println("A conta " + c.getNumero() + " tem " + c.getSaldo() + " de Saldo.");
        }
    }
}
