module app.calculo {
    exports com.github.verdum.app.calculo;
    requires transitive app.loggin;

    opens com.github.verdum.app.calculo to app.financeiro;

    requires app.api;
    provides com.github.verdum.app.Calculadora
        with com.github.verdum.app.calculo.CalculadoraImpl;
}