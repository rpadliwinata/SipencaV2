/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.LoginDAO;
import View.ViewDashboard;
import View.ViewLogin;

/**
 *
 * @author ASUS
 */
public class ControllerLogin {
    ViewLogin frame;
    LoginDAO ld;

    public ControllerLogin(ViewLogin frame) {
        this.frame = frame;
        ld = new LoginDAO();
    }
    
    public void UserLogin() {
        String username = frame.getInputUsername();
        String password = frame.getInputPassword();
        
        int uindex = ld.usernames.indexOf(username);
        int role = ld.login(username, password);
        int id_user = ld.id_users.get(uindex);
        
        if(role == 2) {
            new ViewDashboard(id_user).setVisible(true);
        }
    }
}
