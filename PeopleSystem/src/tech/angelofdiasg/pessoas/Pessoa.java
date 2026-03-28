package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.auxi.*;

import java.time.LocalDate;
import java.util.List;

public class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;
    protected Endereco endereco;
    protected List<Telefone> telsContato;

    public void cadastrar(){}
    public int obterIdade(){
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(List<Telefone> telsContato) {
        this.telsContato = telsContato;
    }
}
