package tech.angelofdiasg.media1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objeto Scarnner para ler os dados de entrada
        Scanner leitor = new Scanner(System.in);
        //Lendo as notas A e B
        double notaA = leitor.nextDouble();
        double notaB = leitor.nextDouble();
        //Pesos das notas A, B
        double pesoA = 3.5;
        double pesoB = 7.5;
        //Calculando a média ponderada
        double somaPesos = pesoA + pesoB;
        double mediaPonderada = ((notaA * pesoA) + (notaB * pesoB)) / somaPesos;
        //Exibindo o resultado com uma casa decimal
        System.out.printf("MEDIA = %.5f\n", mediaPonderada);
    }
}
