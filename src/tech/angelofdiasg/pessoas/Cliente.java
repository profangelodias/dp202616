package tech.angelofdiasg.pessoas;

public class Cliente extends Pessoa{
    private String codigo;
    private String profissao;

    public void cadastrar(){
        System.out.println("Cadastro do cliente realizado com sucesso!");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
