package lista4;

import java.util.Scanner;

public class questao3 {
    public static boolean parImpar(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Inteiro: ");
        int num = scanner.nextInt();

        if (parImpar(num)) {
            System.out.println("O número " + num + " é par.");
        } else {
            System.out.println("O número " + num + " é ímpar.");
        }
    }
}
