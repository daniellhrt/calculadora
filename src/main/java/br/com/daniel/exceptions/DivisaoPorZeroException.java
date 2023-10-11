package br.com.daniel.exceptions;

public class DivisaoPorZeroException extends RuntimeException {
    public DivisaoPorZeroException() {
        super("Erro. Divisão por zero.");
    }

}
