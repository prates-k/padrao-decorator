package br.com.kauaprates.padraodecorator;

public class PersonalTrainer extends ServicoAdicionalDecorator {

    public PersonalTrainer(PlanoAcademia plano) {
        super(plano);
    }

    public float getPercentualAcrescimo() {
        return 5.0f;
    }

    public String getNomeServico() {
        return "Personal Trainer";
    }
}