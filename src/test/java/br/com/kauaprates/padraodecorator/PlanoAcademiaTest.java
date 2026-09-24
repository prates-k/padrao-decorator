package br.com.kauaprates.padraodecorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoAcademiaTest {

    @Test
    void deveRetornarValorPlano() {
        PlanoAcademia plano = new PlanoBasico(1000.0f);

        assertEquals(1000.0f, plano.getValor());
    }

    @Test
    void deveRetornarValorPlanoComAvaliacaoFisica() {
        PlanoAcademia plano = new AvaliacaoFisica(new PlanoBasico(1000.0f));

        assertEquals(1100.0f, plano.getValor());
    }

    @Test
    void deveRetornarValorPlanoComNutricionista() {
        PlanoAcademia plano = new Nutricionista(new PlanoBasico(1000.0f));

        assertEquals(1200.0f, plano.getValor());
    }

    @Test
    void deveRetornarValorPlanoComPersonalTrainer() {
        PlanoAcademia plano = new PersonalTrainer(new PlanoBasico(1000.0f));

        assertEquals(1050.0f, plano.getValor());
    }

    @Test
    void deveRetornarValorPlanoComAvaliacaoFisicaMaisNutricionista() {
        PlanoAcademia plano = new AvaliacaoFisica(new Nutricionista(new PlanoBasico(1000.0f)));

        assertEquals(1320.0f, plano.getValor());
    }

    @Test
    void deveRetornarValorPlanoComAvaliacaoFisicaMaisPersonalTrainer() {
        PlanoAcademia plano = new AvaliacaoFisica(new PersonalTrainer(new PlanoBasico(1000.0f)));

        assertEquals(1155.0f, plano.getValor());
    }

    @Test
    void deveRetornarValorPlanoComNutricionistaMaisPersonalTrainer() {
        PlanoAcademia plano = new Nutricionista(new PersonalTrainer(new PlanoBasico(1000.0f)));

        assertEquals(1260.0f, plano.getValor());
    }

    @Test
    void deveRetornarValorPlanoComAvaliacaoFisicaMaisNutricionistaMaisPersonalTrainer() {
        PlanoAcademia plano = new AvaliacaoFisica(new Nutricionista(new PersonalTrainer(new PlanoBasico(1000.0f))));

        assertEquals(1386.0f, plano.getValor());
    }

    @Test
    void deveRetornarComposicaoPlano() {
        PlanoAcademia plano = new PlanoBasico();

        assertEquals("Plano Básico", plano.getComposicao());
    }

    @Test
    void deveRetornarComposicaoPlanoComAvaliacaoFisica() {
        PlanoAcademia plano = new AvaliacaoFisica(new PlanoBasico());

        assertEquals("Plano Básico/Avaliação Física", plano.getComposicao());
    }

    @Test
    void deveRetornarComposicaoPlanoComNutricionista() {
        PlanoAcademia plano = new Nutricionista(new PlanoBasico());

        assertEquals("Plano Básico/Nutricionista", plano.getComposicao());
    }

    @Test
    void deveRetornarComposicaoPlanoComPersonalTrainer() {
        PlanoAcademia plano = new PersonalTrainer(new PlanoBasico());

        assertEquals("Plano Básico/Personal Trainer", plano.getComposicao());
    }

    @Test
    void deveRetornarComposicaoPlanoComAvaliacaoFisicaMaisNutricionista() {
        PlanoAcademia plano = new AvaliacaoFisica(new Nutricionista(new PlanoBasico()));

        assertEquals("Plano Básico/Nutricionista/Avaliação Física", plano.getComposicao());
    }

    @Test
    void deveRetornarComposicaoPlanoComAvaliacaoFisicaMaisPersonalTrainer() {
        PlanoAcademia plano = new AvaliacaoFisica(new PersonalTrainer(new PlanoBasico()));

        assertEquals("Plano Básico/Personal Trainer/Avaliação Física", plano.getComposicao());
    }

    @Test
    void deveRetornarComposicaoPlanoComNutricionistaMaisPersonalTrainer() {
        PlanoAcademia plano = new Nutricionista(new PersonalTrainer(new PlanoBasico()));

        assertEquals("Plano Básico/Personal Trainer/Nutricionista", plano.getComposicao());
    }

    @Test
    void deveRetornarComposicaoPlanoComAvaliacaoFisicaMaisNutricionistaMaisPersonalTrainer() {
        PlanoAcademia plano = new AvaliacaoFisica(new Nutricionista(new PersonalTrainer(new PlanoBasico())));

        assertEquals("Plano Básico/Personal Trainer/Nutricionista/Avaliação Física", plano.getComposicao());
    }

}