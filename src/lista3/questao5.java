package lista3;

import java.util.Scanner;

public class questao5 {
    public static boolean primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        if (primo(num)) {
            System.out.println(num + " é Primo");
        } else {
            System.out.println(num + " não é Primo");
        }
    }

}
