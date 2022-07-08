public class Distribuidora {
    private String nome;
    private String pesContato;
    private int CGC;
    private int inscMunicipal;
    private int inscEstadual;
    private int telefone;


    public String getNome () {
        return nome;
    }
    public String getPesContato () {
        return pesContato;
    }
    public int getCGC () {
        return CGC;
    }
    public int getInscMunicipal () {
        return inscMunicipal;
    }
    public int getInscEstadual () {
        return inscEstadual;
    }
    public int getTelefone () {
        return telefone;
    }
    public void setNome (String n) {
        nome = n;
    }
    public void setPesContato (String n) {
        pesContato = n;
    }
    public void  setCGC (int c) {
        CGC = c;
    }
    public void setInscMunicipal (int c) {
        inscMunicipal = c;
    }
    public void setInscEstadual (int c) {
        inscEstadual = c;
    }
    public void setTelefone (int c) {
        telefone = c;
    }
}
