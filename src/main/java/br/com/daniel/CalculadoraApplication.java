package br.com.daniel;

import br.com.daniel.calculadora.CalculadoraCommand;
import br.com.daniel.calculadora.HistoricoCalculos;

import java.util.Scanner;

import static br.com.daniel.utils.CalculadoraUtils.criarComando;
import static br.com.daniel.utils.InputUtils.obterNumero;
import static br.com.daniel.utils.InputUtils.obterOperador;

public class CalculadoraApplication {

    public static HistoricoCalculos historicoCalculos = new HistoricoCalculos();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exibirMenu = true;

        System.out.println("CALCULADORA SIMPLES v2.0");

        while (exibirMenu) {
            System.out.println("1 - Calculadora");
            System.out.println("2 - Histórico");
            System.out.println("3 - Sair");
            char opcaoMenu = scanner.next().charAt(0);

            switch (opcaoMenu) {
                case '1': {
                    System.out.println("Operações disponíveis (+, -, /, *, %)");
                    System.out.println("Digite um número por vez (máximo 2 números)");

                    float primeiroNumero = obterNumero(scanner, "Digite o primeiro número:");
                    char operador = obterOperador(scanner);
                    float segundoNumero = obterNumero(scanner, "Digite o segundo número:");


                    CalculadoraCommand comando = criarComando(primeiroNumero, segundoNumero, operador);

                    if (comando != null) {
                        float resultado = comando.executar();
                        historicoCalculos.adicionarCalculoAoHistorico
                                (primeiroNumero, segundoNumero, operador, resultado);

                        System.out.println("Resultado: " + resultado);
                    }
                    break;
                }
                case '2': {
                    historicoCalculos.exibirHistoricoDeCalculos();
                    break;
                }
                case '3': {
                    System.out.println("Encerrando...");
                    exibirMenu = false;
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
                }
            }
        }
        scanner.close();
    }
}
