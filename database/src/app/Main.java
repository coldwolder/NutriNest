package app;

import dominio.Usuario;
import servicosTecnicos.UsuarioDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario();
        u.setNome("Jose");
        u.setCpf("111.111.111.111");
        u.setEmail("jose@gmail.com");
        u.setPassword("123456");
        new UsuarioDAO().cadastrarUsuario(u);
    }
}