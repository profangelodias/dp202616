package tech.angelofdiasg.apps;

import tech.angelofdiasg.contas.Conta;

public class App {
    public static void main(String[] args) {
        Conta conta1 = new Conta(); // Nascimento da conta
        conta1.setNumero(1);
        conta1.setNome("João");
        conta1.setLimite(1000.00);
        conta1.depositar(1000.00);
        System.out.println("Número da conta: " + conta1.getNumero());
        System.out.println("Nome do titular: " + conta1.getNome());
        System.out.println("Saldo: " + conta1.getSaldo());
        System.out.println("Limite: " + conta1.getLimite());

    }
}
