package exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exercicio4 {

    public static void main(String[] args) {

        Map<String,Double> faturamentoPorEstado = Map.of(
            "SP",67836.43,
            "RJ",36678.66,
            "MG", 29229.88,
            "ES", 27165.48,
            "Outros", 19849.53
        );

        double faturamentoTotal = 0.0;
        for (Double valor : faturamentoPorEstado.values()){
            faturamentoTotal += valor;
        }
        System.out.println("Faturamento Total = R$" + faturamentoTotal);

        Map<String,String> porcentagemPorEstado = new HashMap<>();

        for (Entry<String, Double> estado : faturamentoPorEstado.entrySet()){
            double faturamentoParcial = estado.getValue() / faturamentoTotal;
            porcentagemPorEstado.put(estado.getKey(), String.format("%.2f",faturamentoParcial * 100));
        }

        System.out.println("Porcentagem de cada Estado sobre o Faturamento total = ");
        porcentagemPorEstado.forEach((estado,valor) -> System.out.println(estado + " | " + valor + "%"));
    }
}
