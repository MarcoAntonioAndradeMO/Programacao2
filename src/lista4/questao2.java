package lista4;

import java.util.Scanner;

public class questao2 {
    public static boolean isFirtsGreater(int numeros[]) {
        return (numeros[0] > numeros[1] && numeros[0] > numeros[2] && numeros[0] != numeros[1] && numeros[0] != numeros[2]);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        System.out.println("Digite o primeiro número: ");
        numeros[0] = scanner.nextInt();

        System.out.println("Digite o segundo número");
        numeros[1] = scanner.nextInt();

        System.out.println("Digite o terceiro número");
        numeros[2] = scanner.nextInt();

        if (isFirtsGreater(numeros)) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
    }
}
