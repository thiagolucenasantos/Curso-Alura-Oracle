package br.com.thiago.screenmatch;

import br.com.thiago.screenmatch.model.DadosSerie;
import br.com.thiago.screenmatch.service.ConsumoAPI;
import br.com.thiago.screenmatch.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	}
}
