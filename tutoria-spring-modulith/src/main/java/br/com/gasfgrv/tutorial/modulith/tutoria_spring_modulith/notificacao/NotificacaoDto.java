package br.com.gasfgrv.tutorial.modulith.tutoria_spring_modulith.notificacao;

import java.util.Date;

import br.com.gasfgrv.tutorial.modulith.tutoria_spring_modulith.notificacao.interno.Notificacao;

public record NotificacaoDto(String nomeProduto, Date data, String formato) {

    public Notificacao fromDTO() {
        return new Notificacao(nomeProduto, data, formato);
    }

}
