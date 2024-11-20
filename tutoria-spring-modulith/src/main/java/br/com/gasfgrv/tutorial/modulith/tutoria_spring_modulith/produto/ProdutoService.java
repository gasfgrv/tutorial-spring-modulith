package br.com.gasfgrv.tutorial.modulith.tutoria_spring_modulith.produto;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import br.com.gasfgrv.tutorial.modulith.tutoria_spring_modulith.notificacao.NotificacaoDto;

@Service
public class ProdutoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProdutoService.class);

    private final ApplicationEventPublisher publisher;

    public ProdutoService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void criarProduto(Produto produto) {
        LOGGER.info("Criando produto: {}", produto);
        publisher.publishEvent(new NotificacaoDto(produto.nome(), new Date(), "e-mail"));
    }

}
