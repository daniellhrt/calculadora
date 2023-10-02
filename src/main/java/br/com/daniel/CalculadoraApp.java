package br.com.daniel;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA SIMPLES v1.0");
        System.out.println("Operações disponiveis (+,-,/,*)");

        while (true) {

            System.out.println("\nDigite primeiro numero:");
            float numero1 = sc.nextFloat();

            System.out.println("Digite segundo numero:");
            float numero2 = sc.nextFloat();

            System.out.println("Digite a operação matematica: (+,-,/,*)");
            char operador = sc.next().charAt(0);

            float resultado = 0;

            switch (operador) {
                case '+':
                    resultado = numero1 + numero2;
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    break;
                case '/':
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Erro, divisão por zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operador invalido.");
                    continue;
            }
            System.out.println("Resultado:" + resultado);
            System.out.println("Deseja fazer outra operação ? S/N");
            char continuar = sc.next().toLowerCase().charAt(0);
            if (continuar == 's') {
                continue;
            } else {
                System.out.println("Finalizando...");
                break;
            }
        }
    }
}
