package lista4;

import java.util.Scanner;

public class questao1 {
    public static int verNum(int a, int b) {
        if (a == b) {
            return -1;
        } else if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o Primeiro Número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o Segundo Número");
        int num2 = scanner.nextInt();

        int resultado = verNum(num1, num2);
        if (resultado == -1) {
            System.out.println("Os Números são Iguais");
        } else {
            System.out.println("O maior Número é: " + resultado);
        }
    }
}
