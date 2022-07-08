public class Cliente {
    private int telefone;
    private long CPF;
    private String nome;
    private String endereco;

    public int getTelefone () {
        return telefone;
    }
    public long getCPF () {
        return  CPF;
    }
    public String getNome () {
        return nome;
    }
    public String getEndereco () {
        return endereco;
    }
    public void setTelefone (int tel) {
        telefone = tel;
    }
    public void setCPF (long c) {
        CPF = c;
    }
    public void setNome (String n) {
        nome = n;
    }
    public void setEndereco (String e) {
        endereco = e;
    }
}
