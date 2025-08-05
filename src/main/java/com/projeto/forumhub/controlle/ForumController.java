package com.projeto.forumhub.controlle;

import com.projeto.forumhub.dados.CadastroTopicos;
import com.projeto.forumhub.dados.Topicos;
import com.projeto.forumhub.dados.TopicosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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


}
