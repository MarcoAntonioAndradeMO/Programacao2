package lista4;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor para a posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Digite a chave de busca X: ");
        int chave = scanner.nextInt();

        int indiceEncontrado = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                indiceEncontrado = i;
                break;
            }
        }

        if (indiceEncontrado != -1) {
            System.out.println("Chave encontrada na posição: " + (indiceEncontrado + 1));
        } else {
            System.out.println("Chave não encontrada");
        }
    }
}
