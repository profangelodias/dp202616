package tech.angelofdiasg.apps;

import tech.angelofdiasg.auxi.Endereco;
import tech.angelofdiasg.auxi.Telefone;
import tech.angelofdiasg.pessoas.Cliente;
import tech.angelofdiasg.pessoas.Funcionario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Endereco endCliente = new Endereco("Rua A", "123", "Cidade X", "Estado Y", "12345-678");

        // Criar e preencher Cliente
        Cliente cliente = new Cliente();
        cliente.setNome("João Silva");
        cliente.setDataNascimento(LocalDate.of(1985, 5, 15));
        cliente.setEndereco(endCliente);

        // Criar 2 telefones para Cliente
        List<Telefone> telsCliente = new ArrayList<>();
        telsCliente.add(new Telefone("11", "9999-8888"));
        telsCliente.add(new Telefone("11", "3333-4444"));
        cliente.setTelsContato(telsCliente);

        cliente.setCodigo("CLI001");
        cliente.setProfissao("Engenheiro");

        cliente.cadastrar();

        // Criar e preencher Funcionario
        Endereco endFuncionario = new Endereco("Rua B", "456", "Cidade Z", "Estado W", "87654-321");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria Oliveira");
        funcionario.setDataNascimento(LocalDate.of(1990, 10, 20));
        funcionario.setEndereco(endFuncionario);

        // Criar 2 telefones para Funcionário
        List<Telefone> telsFuncionario = new ArrayList<>();
        telsFuncionario.add(new Telefone("11", "7777-6666"));
        telsFuncionario.add(new Telefone("11", "2222-3333"));
        funcionario.setTelsContato(telsFuncionario);

        funcionario.setMatricula(12345);
        funcionario.setCargo("Analista");
        funcionario.setDataAdmissao(LocalDate.of(2020, 1, 1));
        funcionario.setSalario(5000.00);
        funcionario.cadastrar();


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
