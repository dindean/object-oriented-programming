public class Reta implements Relacao {
    //pontoA defino o ponto inicial da reta, pontoB define o ponto final da reta, estaReta define o comprimento da reta
    private int pontoA, pontoB, estaReta;

    //Escrevendo os métodos da interface
    @Override
    public boolean maiorQue(Object b) {
        int i = (int) b;

        if (this.estaReta > i)
            return true;

        return false;
    }

    @Override
    public boolean menorQue(Object b) {
        int i = (int) b;

        if (this.estaReta < i)
            return true;

        return false;
    }

    @Override
    public boolean igualA(Object b) {
        int i = (int) b;

        if (this.estaReta == i)
            return true;

        return false;
    }

    //setando os atributos desta classe
    public void setPontoA(int pontoA) {
        this.pontoA = pontoA;
    }

    public void setPontoB(int pontoB) {
        this.pontoB = pontoB;
    }

    public int getPontoA() {
        return pontoA;
    }

    public int getPontoB() {
        return pontoB;
    }

    public void setEstaReta() {
        this.estaReta = pontoB - pontoA;
    }

    public int getEstaReta() {
        return estaReta;
    }
}
