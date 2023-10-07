/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import model.Usuario;
import model.dao.UsuarioDao;

/**
 *
 * @author alunos
 */
public class ControleUsuario {
    // Atributos
    
    // Métodos
    public boolean logar(String login, String senha) throws ClassNotFoundException{
        Usuario usuario = new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(senha);
        
        UsuarioDao usuarioDAO = new UsuarioDao();
        if (usuarioDAO.consultar(usuario)==null){
            return false;
        }else{
            return true;
        }        
    }           
}
