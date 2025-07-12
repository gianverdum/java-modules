package com.github.gverdum.app.financeiro;

import com.github.verdum.app.Calculadora;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class Teste {

    public static void main(String[] args) {

        Calculadora calc = ServiceLoader
                .load(Calculadora.class)
                .findFirst()
                .orElseThrow();
        System.out.println(calc.soma(2,3,4));

        try {
            Field fieldId = calc.getClass().getDeclaredFields()[0];
            fieldId.setAccessible(true);
            fieldId.set(calc, "def");
            fieldId.setAccessible(false);
            System.out.println(calc.getId());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
