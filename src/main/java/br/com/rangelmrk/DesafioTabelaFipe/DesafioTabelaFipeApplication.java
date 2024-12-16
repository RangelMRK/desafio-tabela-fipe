package br.com.rangelmrk.DesafioTabelaFipe;

import br.com.rangelmrk.DesafioTabelaFipe.methods.Buscador;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DesafioTabelaFipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioTabelaFipeApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		Buscador buscador  = new Buscador();
		buscador.buscaCarro();
	}

}
