public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Ano do lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.4;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println("Media: " + media);

        //Exemplo de concatenação de textos e variáveis, utilizando text box
        String sinopse;
        sinopse = """
                Filme top Gun
                Filme dos Anos 80
                Ano de lançamento:""" + ano;
        System.out.println(sinopse);

        //Fazendo um cast, alterendo um double para int
        int classificacao;
        classificacao = (int) (media /2);
        System.out.println("Utilizando cast " + classificacao);


    }
}