package tech.angelofdiasg.lanche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int codigo = leitor.nextInt();
        int quantidade = leitor.nextInt();
        double total;
        double produto1 = 4.00;
        double produto2 = 4.50;
        double produto3 = 5.00;
        double produto4 = 2.00;
        double produto5 = 1.50;
        switch (codigo) {
            case 1:
                total = quantidade * produto1; break;
            case 2:
                total = quantidade * produto2;                break;
            case 3:
                total = quantidade * produto3;                break;
            case 4:
                total = quantidade * produto4;                break;
            case 5:
                total = quantidade * produto5;                break;
            default:
                total = 0.00; // Código inválido
        }
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
