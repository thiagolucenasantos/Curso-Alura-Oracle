package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import br.com.alura.screenmatch.modelos.excesao.ErroDeConversaoDeAnoException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o filme para busca: ");
        var busca = leitura.nextLine();
        try {
        String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=746a9683";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        //biblioteca importada Gson para converter o formato Json da api que estamos utilizando em String
        //estamos instanciando o GsonBuilder para padronizar o reconhecimento de letras maiúsculas no formato Json
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Título já convertido");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Algo errado com o endereço após digitar o nome do filme, verifique por favor.");
        }catch (ErroDeConversaoDeAnoException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Finalizado corretamente!!");

    }
}
