package br.com.alura.screenmacth;

import br.com.alura.screenmacth.model.DadosTemporada;
import br.com.alura.screenmacth.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmacthApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmacthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
/*		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
		json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=6585022c");
		DadosEpisodios dadosEpisodios = conversor.obterDados(json, DadosEpisodios.class);
		System.out.println(dadosEpisodios);
*/

		Principal principal = new Principal();
		principal.exibirMenu();


	}
}
