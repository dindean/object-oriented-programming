
public class Main {
    public static void main(String[] args) {
        //Instanciando objeto string manipulador, que implementa a interface CharSequence
        stringMan novoManipulador = new stringMan();

        //Utilizando métodos da classe stringMan
        novoManipulador.setStr("esta e a string que vamos usar para demonstrar interfaces");

        System.out.println("a str e:  " + novoManipulador.getStr());

        System.out.println("caracter na posicao 5 e:  " + novoManipulador.charAt(4));

        System.out.println("tamanho da string e: " + novoManipulador.length());

        System.out.println("toString: " + novoManipulador.toString());

        System.out.println();

        novoManipulador = (stringMan) novoManipulador.subSequence(11, 21);

        System.out.println("a nova string e: " + novoManipulador.toString());

        System.out.println("caracter na posicao 5 e: " + novoManipulador.charAt(4));

        System.out.println("tamanho da string: " + novoManipulador.length());


    }
}
