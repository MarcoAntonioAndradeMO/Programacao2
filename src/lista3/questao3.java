package lista3;

import java.util.Scanner;

public class questao3 {
    public static int contPositivos (int num) {
        int contagem = 0;
        while (num != 0){
            if (num > 0) {
                contagem++;
            }
            System.out.println("Insira um número: ");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
        }
        return contagem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        int quantidadePositivos = contPositivos(num);
        System.out.println("Quantidade de Positivos: " + quantidadePositivos);
    }
}
