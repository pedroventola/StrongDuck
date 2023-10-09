/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Admin;
import model.dao.AdminDAO;

/**
 *
 * @author Pedro Ventola
 */
public class ControleAdmin {
    // Atributos
    
    // Métodos
    public boolean logar(String login, String senha) throws ClassNotFoundException{
        Admin admin = new Admin();
        admin.setLogin(login);
        admin.setSenha(senha);
        
        AdminDAO adminDAO = new AdminDAO();
        if (adminDAO.consultar(admin)==null){
            return false;
        }else{
            return true;
        }        
    }           
}

