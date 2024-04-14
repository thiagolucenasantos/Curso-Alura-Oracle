package br.com.thiago.screenmatch.modelos.exemploDaAula.aulaAlura;

import br.com.thiago.screenmatch.modelos.exemploDaAula.aulaAlura.calculadora.CalculadoraDeTempo;
import br.com.thiago.screenmatch.modelos.exemploDaAula.aulaAlura.calculadora.FiltroRecomendacao;
import br.com.thiago.screenmatch.modelos.exemploDaAula.desafio.Episodio;

public class Principal {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();
        meuFilme.setNome("Batman");
        meuFilme.setYearLancamento(2024);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(2);

        Movie filmeAvatar = new Movie();
        filmeAvatar.setNome("Avatar");
        filmeAvatar.setYearLancamento(2022);
        filmeAvatar.setIncluidoNoPlano(true);
        filmeAvatar.setDuracaoEmMinutos(300);



        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.mediaDasAvaliacoes());

        System.out.println("###### UTILIZANDO CONCEITO DE HERANÇA #####");
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setYearLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(5);
        lost.setMinutosPorEpisodio(50);
        lost.exibiFichaTecnica();
        System.out.println("Duração total para maratonar Lost: " + lost.getDuracaoEmMinutos());


        System.out.println("################Calculadora de minutos dos filmes###################");
        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(filmeAvatar);
        calculadoraDeTempo.inclui(lost);
        System.out.println("Tempo total para assistir é de " + calculadoraDeTempo.getTempoTotal() + " minutos.");

        System.out.println("Utilizando classificação atráves da interface juntamente com a classe");
        //Utilizando a classe FiltroRecomendacao que utiliza a implementação da interface Classificavel
        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalDeVisualizacoes(300);
        filtroRecomendacao.filtra(episodio);
    }
}
