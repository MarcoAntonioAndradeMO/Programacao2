package lista2;

import java.util.Scanner;

public class questao3 {
    public static String ParOuImpar(int num){
        if (num % 2 == 0){
            return num + " É Par";
        } else {
            return num + " É Ímpar";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Caso Teste

        System.out.println("Informe o Número: ");
        int num = scanner.nextInt();

        String resultado = ParOuImpar(num);
        System.out.println(resultado);
    }
}
