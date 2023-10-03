package br.com.daniel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {

        // iniciando variaveis fora do loop para evitar erro de compilação
        Scanner sc = new Scanner(System.in);
        float resultado = 0;
        float numero1 = 0;
        float numero2 = 0;
        char operador = 0;

        System.out.println("CALCULADORA SIMPLES v1.1");
        System.out.println("Operações disponíveis (+, -, /, *)");
        System.out.println("Digite um número por vez (máximo 2 números)");

        while (true) {

            // Fazendo tratamento de exceção do dados de entrada
            try {
                System.out.println("\nDigite o primeiro número:");
                numero1 = sc.nextFloat();

                System.out.println("Digite o segundo número:");
                numero2 = sc.nextFloat();

                System.out.println("Digite a operação matemática: (+, -, /, *)");
                operador = sc.next().charAt(0);

                // Verificando se o operador digitado é valido
                if (operador == '+' || operador == '-' || operador == '/' || operador == '*') {

                    switch (operador) {
                        case '+':
                            resultado = somar(numero1, numero2);
                            break;
                        case '-':
                            resultado = subtrair(numero1, numero2);
                            break;
                        case '*':
                            resultado = multiplicar(numero1, numero2);
                            break;
                        case '/':
                            if (numero2 == 0) {
                                System.out.println("Erro, divisão por zero.");
                                continue;
                            }
                            resultado = dividir(numero1, numero2);
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
                //faze1ndo o catch com a mensagem de erro e limpando o buffer de entrada com nextLine
            } catch (InputMismatchException inputMismatchException) {
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

    public static float somar(float numero1, float numero2) {
        return numero1 + numero2;
    }

    public static float subtrair(float numero1, float numero2) {
        return numero1 - numero2;
    }

    public static float multiplicar(float numero1, float numero2) {
        return numero1 * numero2;
    }

    public static float dividir(float numero1, float numero2) {
        return numero1 / numero2;
    }
}
