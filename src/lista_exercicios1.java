import java.lang.Math;
import java.util.Scanner;

public class lista_exercicios1 {
// Exercício 1:
    public static int somaNumeros(int[] nums) {
        int soma = 0;
        for (int num : nums) {
            soma += num;
        }
        return soma;
    }

    // Exercício 2:
    public static double mediaNotas(double[] nums) {
        double somaNotas = 0.0;
        for (double num : nums) {
            somaNotas += num;
        }
        double media = somaNotas / nums.length;
        return media;
    }
    // Exercício 3:
    public static double novoSalario(double salario) {
        return (salario * 1.25);
    }

    // Exercício 4:
    public static double areaTriangulo(double altura, double base){
        return (altura * base) / 2;
    }

    // Exercício 5:
    public static double potencia (double base, double exp) {
        return Math.pow(base, exp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Caso Teste Exercício 1
        int[] numeros = new int[4];
        System.out.println("Informe 4 números, em sequência: ");

        for (int i = 0; i < 4; i++) {
            numeros[i] = scanner.nextInt();
        }

        int soma = somaNumeros(numeros);
        System.out.println("Resultado da soma: " + soma);

        // Caso Teste Exercício 2

    }
}