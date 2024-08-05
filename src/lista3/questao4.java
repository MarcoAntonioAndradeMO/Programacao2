package lista3;

import java.util.Scanner;

public class questao4 {

    public static void impares (int a, int b) {
        for (int i = a ; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println("É Ímpar: " + i);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o Valor de B: ");
        int b = scanner.nextInt();

        if (a < b) {
            impares(a, b);
        } else {
            System.out.println("O valor de A deve ser Menor que o valor de B.");
        }
    }
}

