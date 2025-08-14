package com.projeto.forumhub.controlle;

import com.projeto.forumhub.dados.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("topics")
public class ForumController {

    @Autowired
    private TopicosRepository repository;

   @PostMapping
   @Transactional
    public void cadastrar(@RequestBody @Valid CadastroTopicos cadastroTopicos){
        repository.save(new Topicos(cadastroTopicos));
    }

    @GetMapping
    public Page<DadosListagemTopicos> listar(Pageable paginacao){
       return repository.findAll(paginacao).map(DadosListagemTopicos::new);

    }

    @Transactional
    @PutMapping
    public void atualizar (@RequestBody @Valid AtualizarDados atualizarDados){
       var topicox = repository.getReferenceById(atualizarDados.id());
       topicox.AtualizarInformacoes(atualizarDados);
    }


}
