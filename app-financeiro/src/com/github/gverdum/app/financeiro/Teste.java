package com.github.gverdum.app.financeiro;

import com.github.verdum.app.calculo.Calculadora;
import com.github.verdum.app.calculo.interno.OperacoesAritmeticas;

import java.lang.reflect.Field;

public class Teste {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(2,3,4));

        OperacoesAritmeticas op = new OperacoesAritmeticas();
        System.out.println(op.soma(4,5,6));

        try {
            Field fieldId = Calculadora.class.getDeclaredFields()[0];
            fieldId.setAccessible(true);
            fieldId.set(calc, "def");
            fieldId.setAccessible(false);
            System.out.println(calc.getId());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
