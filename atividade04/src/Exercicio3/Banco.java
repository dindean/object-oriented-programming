import java.util.ArrayList;

public class Banco {
     private ArrayList<Conta> contas = new ArrayList<>();

    public void setContas(Conta contas) {
        this.contas.add(contas);
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void atualiza () {
        for (int i = 0; i < contas.size(); i++) {
            if (((ContaPoupanca)contas.get(i)).getTipo().equals("poupanca")) {
                ((ContaPoupanca)contas.get(i)).adcionaJuros();
            } else if (((ContaCorrete)contas.get(i)).getTipo().equals("corrente")) {
                if (((ContaCorrete)contas.get(i)).estouroLimite()) {
                    System.out.println("Carta enviada ao dono da conta " + ((ContaCorrete)contas.get(i)).getNumero());
                }
            }
        }
    }

    public void imprime () {
        for (Conta c : contas) {
            System.out.println("A conta " + c.getNumero() + " tem " + c.getSaldo() + " de Saldo.");
        }
    }
}
