import java.util.Scanner;

public class HelloWorld {
    public static void main (String args[]) {
        String hw = "Hello World!!!";
        int acelera;

        System.out.println(hw);

        Carro novoCarro = new Carro();

        novoCarro.marca = "Ferrari";
        novoCarro.modelo = "F-480 Spider";
        novoCarro.cor = "Vermelho";
        novoCarro.placa = "AAA-1111";
        novoCarro.ano = 2077;

        System.out.println("Marca: " + novoCarro.marca);
        System.out.println("Modelo: " + novoCarro.modelo);
        System.out.println("Cor: " + novoCarro.cor);
        System.out.println("Placa: " + novoCarro.placa);
        System.out.println("Ano: " + novoCarro.ano);

        System.out.println("Coloque a velocidade que você gostaria de acelerar o carro: ");

        Scanner num = new Scanner(System.in);
        acelera = num.nextInt();


        novoCarro.Acelerar(acelera);

        novoCarro.Frear();

        novoCarro.ConsultarVelocidade();

        System.out.println("-------------------------------------");

        Carro velhoCarro = new Carro();

        velhoCarro.marca = "GM";
        velhoCarro.modelo = "Monza lte";
        velhoCarro.cor = "Preto";
        velhoCarro.placa = "PIU-1007";
        velhoCarro.ano = 1077;

        System.out.println("Marca: " + velhoCarro.marca);
        System.out.println("Modelo: " + velhoCarro.modelo);
        System.out.println("Cor: " + velhoCarro.cor);
        System.out.println("Placa: " + velhoCarro.placa);
        System.out.println("Ano: " + velhoCarro.ano);

        System.out.println("Coloque a velocidade que você gostaria de acelerar o carro: ");

        Scanner ero = new Scanner(System.in);
        acelera = ero.nextInt();


        velhoCarro.Acelerar(acelera);

        velhoCarro.Frear();

        velhoCarro.ConsultarVelocidade();

    }
}
