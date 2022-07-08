public class MinhaExcessao extends Exception{
    private String meuErro = "";

    public MinhaExcessao (String e) {
        setMeuErro(e);
    }

    public String getMeuErro() {
        return meuErro;
    }

    public void setMeuErro(String meuErro) {
        this.meuErro = meuErro;
    }

    @Override
    public String toString() {
        return "MinhaExcessao{" +
                "meuErro='" + meuErro + '\'' +
                '}';
    }
}
