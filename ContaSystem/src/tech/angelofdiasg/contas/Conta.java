package tech.angelofdiasg.contas;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private double limite;

    public void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    public void depositar(double quantidade) {
        double novoSaldo = this.saldo + quantidade;
        this.saldo = novoSaldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
