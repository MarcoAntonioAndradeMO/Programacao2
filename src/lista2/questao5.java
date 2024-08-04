package lista2;

import java.util.Scanner;

public class questao5 {
    public static String calculadora (int operacao, int[] nums) {
        if (operacao == 1) {
            return ("Soma: " + (nums[0] + nums[1]));
        } else if (operacao == 2) {
            return ("Subtração: " + (nums[0] - nums[1]));
        } else if (operacao == 3) {
            return ("Multiplicacao: " + (nums[0] * nums[1]));
        } else if (operacao == 4){
            if (nums[1] == 0){
                return "Divisão por Zero";
            } else {
                return ("Divisão: " + (nums[0] / nums[1]));
            }
        } else {
            return "Operação Inválida";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a Operação (1: Soma, 2: Subtração, 3: Multiplicação, 4: Divisão): ");
        int operacao = scanner.nextInt();

        int[] num = new int[2];
        System.out.println("Informe os dois Números: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        String resultado = calculadora(operacao, num);
        System.out.println(resultado);
    }
}
