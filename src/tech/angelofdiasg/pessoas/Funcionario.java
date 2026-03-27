package tech.angelofdiasg.pessoas;

public class Funcionario extends Pessoa{
    private int matricula;
    private String cargo;
    private String dataAdmissao;
    private double salario;

    public void reajustarSalario(double percentual){
        this.salario += this.salario * percentual / 100;
    }

    public void promover(String novoCargo){
        this.cargo = novoCargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
