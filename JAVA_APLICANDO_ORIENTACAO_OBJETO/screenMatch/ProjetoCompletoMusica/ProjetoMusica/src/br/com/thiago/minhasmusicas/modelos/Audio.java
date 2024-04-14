package br.com.thiago.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduz(){
        this.totalDeReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
