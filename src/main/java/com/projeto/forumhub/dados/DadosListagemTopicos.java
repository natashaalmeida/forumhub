package com.projeto.forumhub.dados;

public record DadosListagemTopicos(Long id,String titulo, String mensagem, String dataDeCriacao, EstadoTopico estadoTopico, String autor, String curso) {

    public DadosListagemTopicos (Topicos topicos) {
        this(topicos.getId(),topicos.getTitulo(), topicos.getMensagem(), topicos.getDataDeCriacao(),topicos.getEstadoTopico(),topicos.getAutor(), topicos.getCurso());
    }
}
