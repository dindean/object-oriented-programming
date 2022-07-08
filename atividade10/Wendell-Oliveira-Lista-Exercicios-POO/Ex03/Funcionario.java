public class Funcionario {
    private String sobreNome;
    private String nome;
    private double salarioHora;
    private int anosNaEmpresa;

    public String getSobreNome() {
        return sobreNome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public int getAnosNaEmpresa() {
        return anosNaEmpresa;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public void setAnosNaEmpresa(int anosNaEmpresa) {
        this.anosNaEmpresa = anosNaEmpresa;
    }

    public void imprimeTempoDcasa (Funcionario[] vetFun, int xAnos) {
        for (int i = 0; i < vetFun.length; i++) {
            if (vetFun[i].getAnosNaEmpresa() >= xAnos) {
                System.out.println("Nome: " + vetFun[i].getNome());
                System.out.println("Sobrenome: " + vetFun[i].getSobreNome());
                System.out.println("Salario Hora: " + vetFun[i].getSalarioHora());
            }
        }
    }
}
