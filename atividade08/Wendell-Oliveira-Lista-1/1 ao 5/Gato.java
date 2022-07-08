public class Gato extends Mortal {
    private int vidas = 7;

    @Override
    public void mata() {
        super.mata();

        if (!isVivo()) {
            if (vidas == 0) {
                System.out.println("O Gato esta morto.. :'(");
            } else {
                vidas--;
                System.out.println("O gato ainda tem " + vidas + " vidas");
                setVivo(true);
            }
        }

    }

    @Override
    public String toString() {
        String resultado = "";

        if (isVivo()) resultado = "O Gato esta vivo e tem " + vidas + " Vidas.";
        else resultado = "O Gato esta morto.";

        return resultado;
    }
}
