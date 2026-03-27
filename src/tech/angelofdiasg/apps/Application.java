package tech.angelofdiasg.apps;

import tech.angelofdiasg.pessoas.Cliente;
import tech.angelofdiasg.pessoas.Funcionario;

public class Application {
    public static void main(String[] args) {
        // Criar e preencher Cliente
        Cliente cliente = new Cliente();
        cliente.setNome("João Silva");
        cliente.setDataNascimento("15/05/1985");
        cliente.setEndereco("Rua A, 123");
        cliente.setTelsContato("9999-8888");
        cliente.setCodigo("CLI001");
        cliente.setProfissao("Engenheiro");

        // Criar e preencher Funcionario
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria Oliveira");
        funcionario.setDataNascimento("20/10/1990");
        funcionario.setEndereco("Rua B, 456");
        funcionario.setTelsContato("7777-6666");
        funcionario.setMatricula(12345);
        funcionario.setCargo("Analista");
        funcionario.setDataAdmissao("01/01/2020");
        funcionario.setSalario(5000.00);

        // Imprimir no console
        System.out.println("Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Data Nascimento: " + cliente.getDataNascimento());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefones: " + cliente.getTelsContato());
        System.out.println("Código: " + cliente.getCodigo());
        System.out.println("Profissão: " + cliente.getProfissao());

        System.out.println("\nFuncionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Data Nascimento: " + funcionario.getDataNascimento());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.println("Telefones: " + funcionario.getTelsContato());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Data Admissão: " + funcionario.getDataAdmissao());
        System.out.println("Salário: " + funcionario.getSalario());
    }
}
