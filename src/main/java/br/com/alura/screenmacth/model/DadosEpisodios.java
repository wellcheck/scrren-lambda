package br.com.alura.screenmacth.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodios(@JsonAlias("Title") String titulo,
                             @JsonAlias("Episodes") Integer numero,
                             @JsonAlias("imdbRating") String avaliacao,
                             @JsonAlias("Released") String dataLancamento) {
}
