package br.com.gasfgrv.tutorial.modulith.tutoria_spring_modulith;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import br.com.gasfgrv.tutorial.modulith.tutoria_spring_modulith.produto.Produto;
import br.com.gasfgrv.tutorial.modulith.tutoria_spring_modulith.produto.ProdutoService;

@EnableAsync
@SpringBootApplication
public class TutoriaSpringModulithApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutoriaSpringModulithApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(ProdutoService produtoService) {
		return args -> produtoService.criarProduto(new Produto("Nome", "Descricao", 1000.0));
	}

}
