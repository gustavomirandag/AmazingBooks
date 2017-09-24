package br.com.amazingbooks.controller;

import br.com.amazingbooks.dao.UsuariosDao;
import br.com.amazingbooks.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    @RequestMapping(value="/cadastrar", method=RequestMethod.GET)
    String mostrarFormularioCadastro(){
        return "cadastroUsuario";
    }
    
    @RequestMapping(value="/cadastrar", method=RequestMethod.POST)
    String receberDadosCadastro(@RequestParam String nome,
            @RequestParam String email,
            @RequestParam String senha){
        
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        UsuariosDao.cadastrarUsuario(usuario);
        
        return "cadastroUsuario";
    }
}
