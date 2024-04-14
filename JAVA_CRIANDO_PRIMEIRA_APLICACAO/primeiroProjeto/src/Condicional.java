public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        boolean incluirNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Gratis";

        if (anoLancamento >= 2021) {
            System.out.println("Lançamento do Ano");
        } else {
            System.out.println("Filme fora de cartaz");
        }

        //Utilizando condicionais
        if (incluirNoPlano || tipoPlano.equals("Plus")){
            System.out.println("Pronto para assistir");
        }else {
            System.out.println("Não incluso no seu plano");
        }
    }
}
