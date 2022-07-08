public class LancaExcessao {

    public void LancaExcessao() throws MinhaExcessao {
        try {
            throw new MinhaExcessao("Opa, este ERRO esta vindo da classe LancaExcessao");
        } catch (MinhaExcessao e) {
            System.out.println(e.toString());
        }
    }

}
