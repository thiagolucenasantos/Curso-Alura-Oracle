package br.com.thiago.screenmatch;

import br.com.thiago.screenmatch.model.DadosEpisodios;
import br.com.thiago.screenmatch.model.DadosSerie;
import br.com.thiago.screenmatch.model.DadosTemporada;
import br.com.thiago.screenmatch.service.ConsumoAPI;
import br.com.thiago.screenmatch.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * A interface CommandLineRunner é um recurso poderoso dentro do universo do Spring Framework, amplamente utilizado no
 * desenvolvimento de aplicações Java. Ela permite que executemos alguma ação logo após a inicialização de nossa aplicação.
 * Pode ser muito útil, por exemplo, se quisermos carregar alguns dados em nosso banco de dados logo na inicialização de nossa aplicação.
 */

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoAPI();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=chicago+fire&apikey=746a9683");
		System.out.println(json);
		ConverterDados conversor = new ConverterDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

		//Alterando o endereço da api para logo a baixo serem buscados os novos atributos da série
		json = consumoApi.obterDados("https://www.omdbapi.com/?t=chicago+fire&season=2&episode=2&apikey=746a9683");
		DadosEpisodios dadosEpisodios = conversor.obterDados(json, DadosEpisodios.class);
		System.out.println(dadosEpisodios);

		//Lista de Temporadas para serem impressas no console
		List<DadosTemporada> temporadas = new ArrayList<>();

		for (int i = 1; i<= dados.totalTemporadas(); i++){
			json = consumoApi.obterDados("https://www.omdbapi.com/?t=chicago+fire&season=" + i + "&apikey=746a9683");
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);
		}
		temporadas.forEach(System.out::println);
	}
}
