package lista2;

import java.util.Scanner;

public class questao4 {
    public static String equacao(int[] nums) {
        if (nums[0] == nums[1]) {
            return "Multiplicação: " + (nums[0] * nums[1]);
        } else if (nums[0] > nums[1]) {
            return "Subtração: " + (nums[0] - nums[1]);
        } else {
            return "Soma: " + (nums[0] + nums[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num[] = new int[2];
        System.out.println("Informe o Número: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        String resultado = equacao(num);
        System.out.println(resultado);
    }
}
