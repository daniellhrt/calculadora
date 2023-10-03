package br.com.daniel;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA SIMPLES v1.1");
        System.out.println("Operações disponíveis (+, -, /, *)");
        System.out.println("Digite um número por vez (máximo 2 números)");

        while (true) {
            System.out.println("\nDigite o primeiro número:");
            float numero1 = sc.nextFloat();

            System.out.println("Digite o segundo número:");
            float numero2 = sc.nextFloat();

            System.out.println("Digite a operação matemática: (+, -, /, *)");
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
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operador inválido.");
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
