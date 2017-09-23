package br.com.amazingbooks.controller;

import br.com.amazingbooks.dao.PessoasDao;
import br.com.amazingbooks.model.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {
    @RequestMapping(value="/cadastrar", method=RequestMethod.GET)
    String mostrarFormularioCadastro(){
        return "cadastroPessoa";
    }
    
    @RequestMapping(value="/cadastrar", method=RequestMethod.POST)
    String receberDadosCadastro(@RequestParam String nome,
            @RequestParam String email,
            @RequestParam String senha){
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setEmail(email);
        pessoa.setSenha(senha);
        PessoasDao.cadastrarPessoa(pessoa);
        
        return "cadastroPessoa";
    }
}
