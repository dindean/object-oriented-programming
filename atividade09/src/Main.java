public class Main {
    public static void main(String[] args) {

        //Exercicio 1

        try {
            throw new Exception("This is an ERROR");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Sim eu passei por esse tratamento..");
        }
        System.out.println();
        System.out.println();


        //Exercicio 2

        try {
            throw new MinhaExcessao("ERROR nesta secao, utilizando Minha Classe Excessao");
        } catch (MinhaExcessao e) {
            System.out.println(e.toString());
        }
        System.out.println();
        System.out.println();

        //Exercicio 3
        LancaExcessao e = new LancaExcessao();

        try {
            e.LancaExcessao();
        } catch (MinhaExcessao r) {
            System.out.println(r.toString());
        }
        System.out.println();
        System.out.println();

        //Exercicio 4
        Object refObj = null;

        try {
            refObj.toString();
        } catch (Exception z) {
            System.out.println("O objeto refObj nao pode ser invocado por ser uma referencia para nulo");
        }
        System.out.println();
        System.out.println();

        //Exercicio 5

        ExcessaoFG feg = new ExcessaoFG();

        try {
            feg.f();
        } catch (Exception u) {
            System.out.println(u.toString());
        }
    }
}
