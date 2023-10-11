package br.com.daniel.calculadora;

public class MultiplicacaoCommand implements CalculadoraCommand {
    private float numero1;
    private float numero2;

    public MultiplicacaoCommand(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public float executar() {
        return numero1 * numero2;
    }
}
