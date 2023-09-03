package br.com.alura.screenmacth.principal;

import br.com.alura.screenmacth.model.DadosSerie;
import br.com.alura.screenmacth.model.DadosTemporada;
import br.com.alura.screenmacth.service.ConsumoApi;
import br.com.alura.screenmacth.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";
    ConsumoApi consumoApi = new ConsumoApi();

    ConverteDados converteDados = new ConverteDados();

    private Scanner leitura = new Scanner(System.in);
    public void exibirMenu(){
        System.out.println("Digite o nome da série:");
        var nomeSerie = leitura.nextLine();
        var json = consumoApi.obterDados(ENDERECO+nomeSerie.replace(" ", "+")+API_KEY);
        DadosSerie dadosSerie = converteDados.obterDados(json, DadosSerie.class);
        System.out.println(dadosSerie);

        List<DadosTemporada> temporadas = new ArrayList<>();

        for(int i = 1 ; i<= dadosSerie.totalTemporadas(); i++){
            json = consumoApi.obterDados(ENDERECO+nomeSerie.replace(" ", "+")+ "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = converteDados.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);
    }
}
