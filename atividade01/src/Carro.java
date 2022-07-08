import java.sql.SQLOutput;

public class Carro {
    public String marca, modelo, placa, cor;
    public int ano;
    private int velocidade;

    public void Acelerar (int km) {
        velocidade = km;

        System.out.println("Acelerando o " + modelo + " para " + velocidade + " Km/h..");
    }

    public void Frear () {
        velocidade = 0;

        System.out.println("Freando o " + modelo + "..");
    }

    public void ConsultarVelocidade () {
        System.out.println("Sua velocidade atual e " + velocidade + " Km/h..");
    }
}
