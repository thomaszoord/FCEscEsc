package me.thomaszoord.fcescesc.core.messages;

import me.thomaszoord.fcescesc.core.messages.prefix.Prefix;

public enum Messages {

    MATCH_NOT_FOUND("§cPartida não encontrada! Erro [1] - Entre em contato com o desenvolvedor: @thomaszoord"),
    MATCH_JOINED("§aVocê entrou na partida: ");
    Messages(java.lang.String message) {
        this.message = message;
    }

    public String message;
}
