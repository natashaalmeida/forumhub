package com.projeto.forumhub.dados;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "topico")
@Entity(name = "topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Topicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    private String mensagem;
    private String dataDeCriacao;
    private String autor;
    private String curso;
    private String usuario;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_topico", nullable = false)
    private EstadoTopico estadoTopico;


    public Topicos(CadastroTopicos cadastroTopicos) {
        this.id=cadastroTopicos.id();
        this.titulo= cadastroTopicos.titulo();
        this.mensagem= cadastroTopicos.mensagem();
        this.dataDeCriacao= cadastroTopicos.dataDeCriacao();
        this.estadoTopico=cadastroTopicos.estadoTopico();
        this.autor=cadastroTopicos.autor();
        this.curso= cadastroTopicos.curso();
        this.usuario= cadastroTopicos.usuario();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getMensagem(){
        return  this.mensagem;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }

    public String getUsuario() {
        return usuario;
    }

    public EstadoTopico getEstadoTopico() {
        return estadoTopico;
    }

    public void AtualizarInformacoes(@Valid AtualizarDados atualizarDados) {
        if (atualizarDados.titulo() != null){
            this.titulo=atualizarDados.titulo();
        }

        if (atualizarDados.mensagem() != null){
            this.mensagem=atualizarDados.mensagem();
        }

        if (atualizarDados.estadoTopico() != null){
            this.estadoTopico= EstadoTopico.valueOf(atualizarDados.estadoTopico());
        }
        if (atualizarDados.autor() != null){
            this.autor= atualizarDados.autor();
        }

        if (atualizarDados.curso() != null){
            this.curso = atualizarDados.curso();
        }
    }
}
