package tech.angelofdiasg.media2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objeto Scarnner para ler os dados de entrada
        Scanner leitor = new Scanner(System.in);
        //Lendo as notas A, B e C
        double notaA = leitor.nextDouble();
        double notaB = leitor.nextDouble();
        double notaC = leitor.nextDouble();
        //Pesos das notas A, B e C
        int pesoA = 2;
        int pesoB = 3;
        int pesoC = 5;
        //Calculando a média ponderada
        double somaPesos = pesoA + pesoB + pesoC;
        double mediaPonderada = ((notaA * pesoA) + (notaB * pesoB) + (notaC * pesoC)) / somaPesos;
        //Exibindo o resultado com uma casa decimal
        System.out.printf("MEDIA = %.1f\n", mediaPonderada);
    }
}
