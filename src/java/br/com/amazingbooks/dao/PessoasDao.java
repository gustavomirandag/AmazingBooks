package br.com.amazingbooks.dao;

import br.com.amazingbooks.model.Pessoa;
import java.util.ArrayList;

public class PessoasDao {
    private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    
    public static void cadastrarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    
    public static Pessoa obterPessoa(String email){
        for(Pessoa p : pessoas){
            if (p.getEmail().equals(email))
                return p;
        }
        return null;
    }
}
