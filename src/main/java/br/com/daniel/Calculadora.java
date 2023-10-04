package br.com.daniel;

public class Calculadora {
    private char operador;
    private float resultado;
    private float numero1;
    private float numero2;

    public Calculadora() {

    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public boolean operadorValido(char operador) {
        return operador == '+' || operador == '-' || operador == '/' || operador == '*' || operador == '%';

    }

    public float somar() {
        resultado = numero1 + numero2;
        return resultado;
    }

    public float subtrair() {
        resultado = numero1 - numero2;
        return resultado;
    }

    public float multiplicar() {
        resultado = numero1 * numero2;
        return resultado;
    }

    public float dividir() {
        resultado = numero1 / numero2;
        return resultado;
    }

    public float calculoPorcentagem() {
        return resultado = numero1 * numero2 / 100;
    }
}
