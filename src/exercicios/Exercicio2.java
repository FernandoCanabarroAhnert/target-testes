package exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = ler.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        ler.close();
    }

    public static boolean pertenceFibonacci(int n) {
        int a = 0, b = 1;
        
        if (n == a || n == b) {
            return true;
        }
        
        int soma = a + b;
        while (soma <= n) {
            if (soma == n) {
                return true;
            }
            a = b;
            b = soma;
            soma = a + b;
        }
        return false;
    }

}
