package br.com.kauaprates.padraodecorator;

public class Nutricionista extends ServicoAdicionalDecorator {

    public Nutricionista(PlanoAcademia plano) {
        super(plano);
    }

    public float getPercentualAcrescimo() {
        return 20.0f;
    }

    public String getNomeServico() {
        return "Nutricionista";
    }
}
