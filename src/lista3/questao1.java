package lista3;

import java.util.Scanner;

public class questao1 {

    public static int somaSeq(int[] nums) {
        int somanum = 0;
        for (int num : nums) {
            somanum += num;
        }
        return somanum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[10];
        System.out.println("Informe 10 números, em sequência: ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int soma = somaSeq(nums);
        System.out.println("Somatório: " + soma);

    }

}
