package com.github.verdum.app.calculo;

import com.github.gverdum.logging.Logger;
import com.github.verdum.app.Calculadora;
import com.github.verdum.app.calculo.interno.OperacoesAritmeticas;

public class CalculadoraImpl implements Calculadora {

    private String id = "abc";

    private OperacoesAritmeticas operacoesAritmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) {
        Logger.info("Somando");
        return operacoesAritmeticas.soma(nums);
    }

    public String getId() {
        return id;
    }
}
