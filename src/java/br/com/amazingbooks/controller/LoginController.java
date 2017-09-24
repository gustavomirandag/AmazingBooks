package br.com.amazingbooks.controller;
import br.com.amazingbooks.dao.UsuariosDao;
import br.com.amazingbooks.model.Usuario;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    
    @RequestMapping(value="/login", method=RequestMethod.GET)
    String mostrarFormularioLogin(HttpSession session){
        return "login";
    }
    
    @RequestMapping(value = "/login", method=RequestMethod.POST)
    String receberDadosLogin(@RequestParam String email, 
            @RequestParam String senha, 
            HttpSession session){
        
        Usuario usuario = UsuariosDao.obterUsuario(email);
        
        if (usuario != null && usuario.getSenha().equals(senha)){
            session.setAttribute("email", email);
            return "redirect:/home";
        }

        session.setAttribute("status", "Usuário ou senha inválida!");
        return "login";

    }
    
}

