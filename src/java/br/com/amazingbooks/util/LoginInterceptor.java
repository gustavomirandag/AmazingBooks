package br.com.amazingbooks.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class LoginInterceptor extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request, 
            HttpServletResponse response, 
            Object handler) throws Exception {
        
        HttpSession session =  request.getSession();
        String email = (String) session.getAttribute("email");
        
        if(request.getRequestURI().endsWith("login")
           || (email != null && !email.equals("")) ){
            return true; //Permite acessar qualquer URL
        }else{
            //Força o usuário a passar pela view de login
            response.sendRedirect("/amazingbooks/login");
            return false;
        }
    }
    
}
