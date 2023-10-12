package br.com.daniel.calculadora.command;

import br.com.daniel.calculadora.command.CalculadoraCommand;

public class PorcentagemCommand implements CalculadoraCommand {
    private float numero1;
    private float numero2;

    public PorcentagemCommand(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public float executar() {
        return (numero1 * numero2) / 100;
    }
}
