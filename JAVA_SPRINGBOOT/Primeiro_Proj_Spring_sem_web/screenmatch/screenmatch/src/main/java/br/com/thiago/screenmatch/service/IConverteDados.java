package br.com.thiago.screenmatch.service;

public interface IConverteDados {
    //método que recebe algo genérico e retorna algo genérico
    <T> T obterDados(String json, Class<T> classe);
}
