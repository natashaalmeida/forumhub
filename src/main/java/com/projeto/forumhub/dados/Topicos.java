package com.projeto.forumhub.dados;

import jakarta.persistence.*;
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


    }
}
