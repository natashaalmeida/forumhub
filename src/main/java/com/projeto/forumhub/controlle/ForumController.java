package com.projeto.forumhub.controlle;

import com.projeto.forumhub.dados.CadastroTopicos;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("topics")
public class ForumController {

   @PostMapping
   @Valid
    public void cadastrar(@RequestBody CadastroTopicos cadastroTopicos){
        System.out.println(cadastroTopicos);
    }


}
