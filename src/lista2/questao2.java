package lista2;

import java.util.Scanner;

public class questao2 {
    public static String recebeNum(int[] nums) {
        if (nums[0] > nums[1] && nums[0] > nums[2]) {
            return "Condição Satisfeita";
        } else {
            return "Erro";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Caso Teste
        int num[] = new int[3];
        System.out.println("Informe o Número: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        String resultado = recebeNum(num);
        System.out.println(resultado);
    }
}
