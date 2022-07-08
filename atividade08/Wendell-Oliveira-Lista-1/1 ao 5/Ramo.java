public class Ramo extends Mortal{
    private boolean esquerda = true;
    private boolean direita = true;


    @Override
    public void mata() {
        super.mata();

        if (!isVivo()) {
            esquerda = false;
            direita = false;
        }
        setVivo(false);
    }

    @Override
    public String toString() {
        String resultado = "";

        if (isVivo()) resultado = "O Ramo e todos os seus galhos passam bem";
        else resultado = "O Ramo e seus galhos quebraram";

        return resultado;
    }

    public boolean isEsquerda() {
        return esquerda;
    }

    public boolean isDireita() {
        return direita;
    }
}
