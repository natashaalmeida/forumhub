package com.projeto.forumhub.dados;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CadastroTopicos(
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        String dataDeCriacao,

        EstadoTopico estadoTopico,
        @NotBlank
        String autor,
        @NotBlank
        String curso,
        @NotBlank
        String usuario
) {

}
