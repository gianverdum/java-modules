module app.calculo {
    exports com.github.verdum.app.calculo;
    requires transitive app.loggin;

    exports com.github.verdum.app.calculo.interno
            to app.financeiro;

    opens com.github.verdum.app.calculo to app.financeiro;
}