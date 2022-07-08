import java.awt.image.AbstractMultiResolutionImage;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        String cardapio[], end, nome;
        int op, ob, tel;
        long cpf;

        Pizzas diskPizza = new Pizzas();
        diskPizza.setCardapio();
        cardapio = diskPizza.getCardapio();

        System.out.println("-------CARDAPIO-------");
        System.out.println("SABORES: ");
        System.out.println("1" + cardapio[0]);
        System.out.println("2" + cardapio[1]);
        System.out.println("3" + cardapio[2]);
        System.out.println("4" + cardapio[3]);

        System.out.println("BEBIDAS: ");
        System.out.println("5" + cardapio[4]);
        System.out.println("6" + cardapio[5]);
        System.out.println("7" + cardapio[6]);
        System.out.println("8" + cardapio[7]);

        System.out.println("Entre com o numero da opcao do sabor que voce gostaria de comprar, ou digite 0 para sair..");
        Scanner num = new Scanner(System.in);
        Scanner txt = new Scanner(System.in);

        op = num.nextInt();

        Cliente novoCliente = new Cliente();


        System.out.println("Qual bebida voce gostaria?");

        ob = num.nextInt();

        System.out.println("Qual o seu telefone?");
        tel = num.nextInt();

        System.out.println("Qual o seu nome?");
        nome = txt.nextLine();

        System.out.println("Qual seu endereco?");
        end = txt.nextLine();

        System.out.println("Qual seu CPF");
        cpf = num.nextLong();

        novoCliente.setCPF(cpf);
        novoCliente.setTelefone(tel);
        novoCliente.setEndereco(end);
        novoCliente.setNome(nome);

        System.out.println("Pedido realizado com sucesso!");
        System.out.println(cardapio[op-1]);
        System.out.println(cardapio[ob-1]);
        System.out.println(" Entrega no endereco:: " + novoCliente.getEndereco() + " PARA:: " + novoCliente.getNome());

        System.out.println("--------------Adcionando Distribuidora---------------");

        Distribuidora novaDistri = new Distribuidora();

        novaDistri.setNome("CocaLTDA");
        novaDistri.setPesContato("Edinaldo");
        novaDistri.setTelefone(33333333);
        novaDistri.setCGC(1234567890);
        novaDistri.setInscEstadual(55555555);
        novaDistri.setInscMunicipal(77777777);

        System.out.println("Nome da distribuidora: " + novaDistri.getNome());
        System.out.println("Pessoa de contato: " + novaDistri.getPesContato());
        System.out.println("Telefone: " + novaDistri.getTelefone());
        System.out.println("CGC: " + novaDistri.getCGC());
        System.out.println("Inscricao Estadual: " + novaDistri.getInscEstadual());
        System.out.println("Inscricao Municipal: " + novaDistri.getInscMunicipal());


    }
}
