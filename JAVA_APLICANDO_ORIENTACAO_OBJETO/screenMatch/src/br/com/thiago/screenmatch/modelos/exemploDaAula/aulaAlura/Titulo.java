package br.com.thiago.screenmatch.modelos.exemploDaAula.aulaAlura;

public class Titulo {

        private String nome;
        private int yearLancamento;
        private boolean incluidoNoPlano;
        private double somaAvaliacoes;
        private int totalDeAvaliacao;
        private int duracaoEmMinutos;

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacao(){
            return totalDeAvaliacao;
        }

        public String getNome() {
            return nome;
        }

        public int getYearLancamento() {
            return yearLancamento;
        }

        public boolean isIncluidoNoPlano() {
            return incluidoNoPlano;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setYearLancamento(int yearLancamento) {
            this.yearLancamento = yearLancamento;
        }

        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }

        public void exibiFichaTecnica(){
            System.out.println("Nome do filme: " + nome);
            System.out.println("Ano de Lançamento: " + yearLancamento);
        }
        public void avalia(double nota){
            somaAvaliacoes += nota;
            totalDeAvaliacao++;
        }
        public double mediaDasAvaliacoes(){
            return somaAvaliacoes / totalDeAvaliacao;
        }

    }
