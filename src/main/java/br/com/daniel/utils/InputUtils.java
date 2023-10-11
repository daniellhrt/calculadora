package br.com.daniel.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {

    public static float obterNumero(Scanner scanner, String mensagem) {
        float numero;

        while (true) {
            try {
                System.out.println(mensagem);
                numero = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número válido.");
                scanner.nextLine();
            }
        }
        return numero;
    }

    public static char obterOperador(Scanner scanner) {
        char operador;
        String operadoresValidos = "+-/*%";

        while (true) {
            System.out.println("Digite a operação matemática: (+, -, /, *, %)");
            operador = scanner.next().charAt(0);
            if (operadoresValidos.contains(String.valueOf(operador))) {
                return operador;
            } else {
                System.out.println("Operador inválido, digite um operador válido: (+, -, /, *, %)");

            }
        }
    }

}
