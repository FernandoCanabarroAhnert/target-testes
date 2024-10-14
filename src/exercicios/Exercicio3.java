package exercicios;

import java.util.Arrays;

public class Exercicio3 {

    public static void main(String[] args) {
        
        double[] faturamentoDiario = {1500.75, 2300.40, 1750.00, 2100.90, 1800.20, 1900.60, 2500.30, 2000.50};

        Arrays.sort(faturamentoDiario);

        System.out.println("Menor Valor = R$" + faturamentoDiario[0]);
        System.out.println("Maior Valor = R$" + faturamentoDiario[faturamentoDiario.length - 1]);

        double somaTotal = 0;
        for (Double valor : faturamentoDiario){
            somaTotal += valor;
        }

        double media = somaTotal / faturamentoDiario.length;

        int quantidadeDeDiasAcimaDaMedia = 0;
        for (Double valor : faturamentoDiario){
            if (valor > media) {
                quantidadeDeDiasAcimaDaMedia += 1;
            }
        }

        System.out.println("Quantidade de dias com faturamento acima da média = " + quantidadeDeDiasAcimaDaMedia);
    }
}
