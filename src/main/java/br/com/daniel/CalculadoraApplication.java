package br.com.daniel;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraApplication {

    static ArrayList<String> historicoCalculos = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        HistoricoCalculos historicoDeCalculos = new HistoricoCalculos();
        float resultado = 0;
        boolean exibirMenu = true;

        System.out.println("CALCULADORA SIMPLES v2.0");

        while (exibirMenu) {
            System.out.println("1 - Calculadora");
            System.out.println("2 - Histórico");
            System.out.println("3 - Sair");
            char opcaoMenu = scanner.next().charAt(0);

            switch (opcaoMenu) {
                case '1': {
                    while (true) {
                        try {
                            System.out.println("Operações disponíveis (+, -, /, *, %)");
                            System.out.println("Digite um número por vez (máximo 2 números)");
                            System.out.println("\nDigite o primeiro número:");
                            float primeiroNumero = scanner.nextFloat();

                            System.out.println("Digite o segundo número:");
                            float segundoNumero = scanner.nextFloat();

                            calculadora.setNumero1(primeiroNumero);
                            calculadora.setNumero2(segundoNumero);

                            char operador;
                            while (true) {
                                System.out.println("Digite a operação matemática: (+, -, /, *, %)");
                                operador = scanner.next().charAt(0);
                                if (calculadora.operadorValido(operador)) {
                                    break;
                                } else {
                                    System.out.println("Operador inválido: " + operador);
                                    System.out.println("Digite um operador válido...");
                                }
                            }

                            switch (operador) {
                                case '+':
                                    resultado = calculadora.somar();
                                    break;
                                case '-':
                                    resultado = calculadora.subtrair();
                                    break;
                                case '*':
                                    resultado = calculadora.multiplicar();
                                    break;
                                case '/':
                                    if (segundoNumero != 0) {
                                        resultado = calculadora.dividir();
                                        break;
                                    } else {
                                        System.out.println("Erro, divisão por zero.");
                                        continue;
                                    }
                                case '%':
                                    resultado = calculadora.calculoPorcentagem();
                                    System.out.println("Subtração do resultado: " + (primeiroNumero - resultado));
                                    break;
                            }

                            historicoDeCalculos.adicionarCalculoAoHistorico(primeiroNumero, segundoNumero, operador, resultado);

                        } catch (InputMismatchException inputMismatchException) {
                            System.out.println("Erro: Entrada inválida. Por favor, insira um número válido.");
                            scanner.nextLine();
                            continue;
                        }

                        System.out.println("Resultado: " + resultado);
                        System.out.println("Deseja fazer outra operação? (S/N)");
                        scanner.nextLine();
                        char continuar = scanner.next().toLowerCase().charAt(0);

                        if (continuar != 's') {
                            System.out.println("Voltando ao menu principal.");
                            break;
                        }
                    }
                }
                break;
                case '2': {
                    historicoDeCalculos.exibirHistoricoDeCalculos();
                    continue;
                }
                case '3': {
                    System.out.println("Encerrando...");
                    exibirMenu = false;
                    break;
                }
            }
        }

        scanner.close();
    }
}
