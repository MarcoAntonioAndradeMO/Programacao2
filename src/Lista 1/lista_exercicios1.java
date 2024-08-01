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
        return somaNotas / nums.length;
    }

    // Exercício 3:
    public static double novoSalario(double salario) {
        return (salario * 1.25);
    }

    // Exercício 4:
    public static double areaTriangulo(double altura, double baset){
        return ((altura * baset) / 2);
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
        double[] notas = new double[3];
        System.out.println("Informe as 3 notas: ");
        for (int i = 0; i < 3; i++) {
            notas[i] = scanner.nextDouble();
        }

        double media = mediaNotas(notas);
        System.out.println("Resultado da média das Notas: " + media);

        // Caso Teste Exercício 3
        double salario;
        System.out.println("Digite o Salário atual: ");
        salario = scanner.nextDouble();

        double salarioAjustado = novoSalario(salario);
        System.out.println("O novo salário é: R$ " + salarioAjustado);

        // Caso Teste Exercício 4
        double altura;
        double baset;
        System.out.println("Digite a base: ");
        baset = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        altura = scanner.nextDouble();

        double area = areaTriangulo(altura, baset);
        System.out.println("A área do Triângulo é: " + area);

        // Caso Teste Exercício 5
        double base;
        double expoente;
        System.out.println("Digite o valor da Base: ");
        base = scanner.nextDouble();
        System.out.println("Digite o valor do Expoente: ");
        expoente = scanner.nextDouble();

        double pot = potencia(base, expoente);
        System.out.println("O valor da potência é: " + pot);
    }
}