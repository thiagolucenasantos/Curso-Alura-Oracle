package br.com.alura.screenmatch.desafioListas.desafio4;

import java.util.ArrayList;

/**
 * Crie uma classe produto com propriedades nome e preço
 * Crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos
 */

public class PrincipalProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 30);
        Produto produto2 = new Produto("Feijoa", 25);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        double somaPrecos = 0;
        for (Produto produto : listaProdutos){
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);
    }
}
