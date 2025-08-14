package com.projeto.forumhub.dados;

import jakarta.validation.constraints.NotNull;

public record AtualizarDados(
        @NotNull
        Long id,
        String titulo,
        String mensagem,
        String dataDeCriacao,
        String estadoTopico,
        String autor,
        String curso) {
}
