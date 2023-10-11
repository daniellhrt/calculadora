package br.com.daniel.utils;

import br.com.daniel.calculadora.*;

public class CalculadoraUtils {

    public static CalculadoraCommand criarComando(float numero1, float numero2, char operador) {
        return switch (operador) {
            case '+' -> new AdicaoCommand(numero1, numero2);
            case '-' -> new SubtracaoCommand(numero1, numero2);
            case '*' -> new MultiplicacaoCommand(numero1, numero2);
            case '/' -> new DivisaoCommand(numero1, numero2);
            case '%' -> new PorcentagemCommand(numero1, numero2);
            default -> null;
        };
    }


}
