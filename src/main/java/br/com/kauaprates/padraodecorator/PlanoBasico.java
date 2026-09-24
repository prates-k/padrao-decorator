package br.com.kauaprates.padraodecorator;

public class PlanoBasico implements PlanoAcademia {

    public float valor;

    public PlanoBasico() {
    }

    public PlanoBasico(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public String getComposicao() {
        return "Plano Básico";
    }

}
