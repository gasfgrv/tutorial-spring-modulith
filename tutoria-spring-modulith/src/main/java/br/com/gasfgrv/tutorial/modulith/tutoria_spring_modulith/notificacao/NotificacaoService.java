package br.com.gasfgrv.tutorial.modulith.tutoria_spring_modulith.notificacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificacaoService.class);

    @ApplicationModuleListener
    public void criarNotificacao(NotificacaoDto notificacaoDto) {
        LOGGER.info("Criando notificação: {}", notificacaoDto.fromDTO());
    }

}
