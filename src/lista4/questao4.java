package lista4;

import java.util.Scanner;

public class questao4 {
    public static void dividir100(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] /= 100;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor entre 1 e 100 para a posição: " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        dividir100(vetor);

        System.out.println("Conteúdo após divisão por 100: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + (i + 1) + ": " + vetor[i]);
        }
    }
}
