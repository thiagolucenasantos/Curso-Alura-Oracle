public class Main {
    public static void main(String[] args) {
       //1. programa que realiza a média de duas notas decimais
        int notaA = 5;
        int notaB = 4;
        int media = (notaA + notaB) / 2;
        System.out.println("Média: " + media);

       /* 2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting
        do tipo double para int e imprima o resultado*/
        double tipo1 = 4.6;
        int tipo2 = 3;
        int resultado = (int) (tipo1 + tipo2);
        System.out.println("Cast: " + resultado);

        /*3. Declare uma variável do tipo char e uma variável do tipo String. Atribua
        valores a essas variáveis e concatene-as em uma mensagem
         */
        char letra = 'A';
        String palavra = "bolsa";
        String mensagem = letra + " " +  palavra;
        System.out.println(mensagem);

        /*
        4. Declare uma variável do tipo double precoProduto e uma variável do tipo int(quantidade)
        Calcule o valor total multiplicando o preço do produto pela quantidade e apresente
        o resultado em uma mensagem.
         */
        double precoProduto = 4.50;
        int quantidade = 2;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Valor total é R$: " + valorTotal);

        /*
        5. Declare uma variável do tipo double valorEmDolares.
        Atribua um valor em dólares a essa variável.
        Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
         */
        double valorEmDolares = 2;
        double taxaDeConversao = 4.94;

        double resultadoEmReal = valorEmDolares * taxaDeConversao;
        System.out.println("Quantia em reais: R$ " + resultadoEmReal);

        /*
        Declare uma variável do tipo double precoOriginal.
        Atribua um valor em reais a esta variável.
        Declare uma variável do tipo double percentualDesconto, atribua percentual ex. 10%
        Calcule o valor do desconto em reais, aplique ao preço original e imprima com desconto.
         */

        double precoOriginal = 200.00;
        double percentualDesconto = 10;
        double valorDescontoPercentual =  (percentualDesconto/ 100) * precoOriginal;
        double novoPreco = precoOriginal - valorDescontoPercentual;

        System.out.println("Preço do produto original: " + precoOriginal);
        System.out.println("Percentual do produto com desconto: " + valorDescontoPercentual);
        System.out.println("Valor total do produto com desconto: " + novoPreco);
    }
}