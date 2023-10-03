package br.com.daniel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float resultado = 0;
        float numero1 = 0;
        float numero2 = 0;
        char operador = 0;

        System.out.println("CALCULADORA SIMPLES v1.1");
        System.out.println("Operações disponíveis (+, -, /, *)");
        System.out.println("Digite um número por vez (máximo 2 números)");

        while (true) {

            try {
                System.out.println("\nDigite o primeiro número:");
                numero1 = sc.nextFloat();

                System.out.println("Digite o segundo número:");
                numero2 = sc.nextFloat();

                System.out.println("Digite a operação matemática: (+, -, /, *)");
                operador = sc.next().charAt(0);
                if (operador == '+' || operador == '-' || operador == '/' || operador == '*') {

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
                                continue;
                            }
                            break;
                        default:
                            System.out.println("Operador inválido.");
                            continue;
                    }

                } else {
                    System.out.println("Operador inválido: " + operador);
                    System.out.println("Digite um operador válido...");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número válido.");
                sc.nextLine();
                continue;
            }

            System.out.println("Resultado: " + resultado);
            System.out.println("Deseja fazer outra operação? (S/N)");
            char continuar = sc.next().toLowerCase().charAt(0);

            if (continuar != 's') {
                System.out.println("Finalizando...");
                break;
            }
        }

        sc.close();
    }
}
