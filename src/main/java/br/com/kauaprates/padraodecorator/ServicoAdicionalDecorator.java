package br.com.kauaprates.padraodecorator;

public abstract class ServicoAdicionalDecorator implements PlanoAcademia {

    private PlanoAcademia plano;
    public String composicao;

    public ServicoAdicionalDecorator(PlanoAcademia plano) {
        this.plano = plano;
    }

    public PlanoAcademia getPlano() {
        return plano;
    }

    public void setPlano(PlanoAcademia plano) {
        this.plano = plano;
    }

    public abstract float getPercentualAcrescimo();

    public float getValor() {
        return this.plano.getValor() * (1 + (this.getPercentualAcrescimo() / 100));
    }

    public abstract String getNomeServico();

    public String getComposicao() {
        return this.plano.getComposicao() + "/" + this.getNomeServico();
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }
}
