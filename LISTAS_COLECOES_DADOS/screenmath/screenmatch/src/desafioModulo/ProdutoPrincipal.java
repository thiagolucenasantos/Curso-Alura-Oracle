package desafioModulo;

import java.util.ArrayList;

public class ProdutoPrincipal {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Arroz", 10.50, 2);
        Produto produto2 = new Produto("Feijão", 3.50, 6);

        //adicionando os produtos ao Arraylist
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);

        System.out.println("Tamanho do array: " + listaDeProdutos.size());
        System.out.println("Busca pela posição do array" + listaDeProdutos.get(1).getNome());

        //outro jeito de apresentar o tostring
        System.out.println(listaDeProdutos.toString());

        //utilizando o toString implementando na classe Produto
        for (Produto produto : listaDeProdutos){
            System.out.println(produto);
        }
    }
}
