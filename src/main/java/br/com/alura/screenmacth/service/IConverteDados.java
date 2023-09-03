package br.com.alura.screenmacth.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);
}
