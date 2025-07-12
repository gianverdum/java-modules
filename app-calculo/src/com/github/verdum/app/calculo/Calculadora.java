package com.github.verdum.app.calculo;

import com.github.gverdum.logging.Logger;
import com.github.verdum.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

    private OperacoesAritmeticas operacoesAritmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) {
        Logger.info("Somando");
        return operacoesAritmeticas.soma(nums);
    }
}
