package br.com.daniel.calculadora;

import br.com.daniel.calculadora.CalculadoraCommand;
import br.com.daniel.exceptions.DivisaoPorZeroException;

public class DivisaoCommand implements CalculadoraCommand {

    private float numero1;
    private float numero2;

    public DivisaoCommand(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public float executar() {
        float resultado = 0;
        try {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                throw new DivisaoPorZeroException();
            }
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMessage());

        }
        return resultado;
    }
}
