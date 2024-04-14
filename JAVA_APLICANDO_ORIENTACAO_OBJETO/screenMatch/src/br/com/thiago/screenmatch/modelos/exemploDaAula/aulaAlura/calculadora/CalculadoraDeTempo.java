package br.com.thiago.screenmatch.modelos.exemploDaAula.aulaAlura.calculadora;

import br.com.thiago.screenmatch.modelos.exemploDaAula.aulaAlura.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Movie filme){
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    //utilizando sobrecarga de métodos
//    public void inclui(Serie serie){
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    //utilizando a super classe como refêrencia que já possue Movie e Serie
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
