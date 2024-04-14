package br.com.thiago.screenmatch.modelos.exemploDaAula.aulaAlura;

import br.com.thiago.screenmatch.modelos.exemploDaAula.aulaAlura.calculadora.Classificavel;

//aplicando o conceito de herança de Título em Movie, tudo os atributos que Título tem
//o Movie tem.
public class Movie extends Titulo implements Classificavel {
   private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaDasAvaliacoes() / 2;
    }
}
