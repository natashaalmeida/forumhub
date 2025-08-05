package com.projeto.forumhub.dados;


import jakarta.validation.constraints.NotBlank;

public record CadastroTopicos(
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        String dataDeCriacao,
        @NotBlank
        EstadoTopico estadoTopico,
        @NotBlank
        String autor,
        @NotBlank
        String curso) {

}
