package br.com.daniel.calculadora;

import java.util.ArrayList;

public class HistoricoCalculos {
    private final ArrayList<String> historicoCalculos = new ArrayList<>();

    public void adicionarCalculoAoHistorico(float numero1, float numero2, char operador, float resultado) {
        String calculo = String.format("%.2f %c %.2f = %.2f", numero1, operador, numero2, resultado);
        historicoCalculos.add(calculo);
    }

    public void exibirHistoricoDeCalculos() {
        System.out.println("\nHistórico de Cálculos:");
        for (String calculo : historicoCalculos) {
            System.out.println(calculo);
        }

    }

}
