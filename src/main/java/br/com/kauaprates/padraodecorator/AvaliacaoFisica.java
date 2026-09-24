package br.com.kauaprates.padraodecorator;

public class AvaliacaoFisica extends ServicoAdicionalDecorator {

    public AvaliacaoFisica(PlanoAcademia plano) {
        super(plano);
    }

    public float getPercentualAcrescimo() {
        return 10.0f;
    }

    public String getNomeServico() {
        return "Avaliação Física";
    }
}
