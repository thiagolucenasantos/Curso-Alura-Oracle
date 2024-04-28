package br.com.thiago.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//CLASSE PARA CONVERTER OS DADOS GENÉRICA

public class ConverterDados implements IConverteDados {
    //instanciando o objeto do jackson que faz aconversão
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
