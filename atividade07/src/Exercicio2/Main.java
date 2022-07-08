
public class Main {
    public static void main(String[] args) {
        //Instanciando dois objetos Reta para comparacao
        Reta reta1 = new Reta();
        Reta reta2 = new Reta();

        //Atribuindo os pontos da reta 1
        reta1.setPontoA(3);
        reta1.setPontoB(5);
        reta1.setEstaReta();

        //Atribuindo os pontos da reta 2
        reta2.setPontoA(4);
        reta2.setPontoB(6);
        reta2.setEstaReta();

        //Comparando as retas
        if (reta1.maiorQue(reta2.getEstaReta()))
            System.out.println("A reta 1 e maior q a reta 2");
        else
            System.out.println("A reta 1 nao e maior que a reta 2");

        if (reta2.igualA(reta1.getEstaReta()))
            System.out.println("A reta 2 e igual que a reta 1");
        else
            System.out.println("A reta 2 nao e igual a reta 1");

        if (reta1.menorQue(reta2.getEstaReta()))
            System.out.println("A reta 1 e menor que a reta 2");
        else
            System.out.println("A reta 1 nao e menor que a reta 2");

    }
}
