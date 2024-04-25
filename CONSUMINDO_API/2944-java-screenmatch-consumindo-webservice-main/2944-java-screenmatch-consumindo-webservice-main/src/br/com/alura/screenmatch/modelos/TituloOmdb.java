package br.com.alura.screenmatch.modelos;

//Record um recurso que permite representar uma classe imutável, contendo apenas
//atributos, construtor e métodos de leitura, de uma maneira muito simples e enxuta.

//recurso se encaixa quando precisamos criar um objeto apenas para representar dados,
//sem nenhum tipo de comportamento.
public record TituloOmdb(String title, String year, String runtime) {

}
