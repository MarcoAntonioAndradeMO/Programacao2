package lista3;

import java.util.Scanner;

public class questao2 {
    public static void numEntreAB (int a, int b){
        System.out.println("Série Numérica: ");
        for (int i = (1 + 1); i <= (b - 1); i++) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Valor de A: ");
        int a = scanner.nextInt();

        System.out.println("Digite o Valor de B: ");
        int b = scanner.nextInt();

        if (a < b) {
            numEntreAB(a, b);
        } else {
            System.out.println("O valor de A deve ser Menor que o valor de B.");
        }
    }
}
