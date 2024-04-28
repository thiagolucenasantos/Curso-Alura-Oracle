package br.com.thiago.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Utilizamos a anotação JsonAlias para reconhecer como está os devidos nomes na API
//e fazer a conexão exata dos dados com os nomes nas nossa variáveis

//Utilizando a dependencia Jackson utilizamos a anotação necessária, e com isso fizemos
//nosso record para trazer o que queremos referente a série direto da API

@JsonIgnoreProperties(ignoreUnknown = true) //anotação que ignorará todas os outros itens que não estão mapeados no meu record
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avalicao) {
}
