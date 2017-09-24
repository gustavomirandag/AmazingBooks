/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amazingbooks.dao;

import br.com.amazingbooks.model.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gustavomg
 */
public class UsuariosDao {
    public static void cadastrarUsuario(Usuario usuario){
        EntityManagerFactory factory =  Persistence.
                createEntityManagerFactory("AmazingBooksPU");
        EntityManager entityManager = factory.createEntityManager();       
        
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    public static Usuario obterUsuario(String email){
        EntityManagerFactory factory =  Persistence.
                createEntityManagerFactory("AmazingBooksPU");
        EntityManager entityManager = factory.createEntityManager();       
        List<Usuario> usuarios;
        entityManager.getTransaction().begin();
        usuarios = entityManager.createNamedQuery("Usuario.findByEmail", 
                Usuario.class)
                .setParameter("email", email)
                .getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        
        if (usuarios.isEmpty())
            return null;
        return usuarios.get(0);
    }
}
