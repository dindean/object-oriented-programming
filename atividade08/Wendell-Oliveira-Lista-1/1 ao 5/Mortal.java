public class Mortal {
    private boolean vivo = true;

    public boolean isVivo() {
        return vivo;
    }

    public void mata() {
        this.vivo = false;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

}
