package lista2;

import java.util.Scanner;

public class questao1 {
    public static String comparaNum(int[] nums) {
        if (nums[0] > nums[1]) {
            return "O maior número é: " + nums[0];
        } else if (nums[0] < nums[1]) {
            return "O maior número é: " + nums[1];
        } else {
            return "Os números são iguais";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Caso de Teste
        int[] num = new int[2];
        System.out.println("Informe dois números: ");

        for (int i = 0; i < 2; i++) {
            num[i] = scanner.nextInt();
        }

        String resultado = comparaNum(num);
        System.out.println(resultado);

        scanner.close();
    }
}
