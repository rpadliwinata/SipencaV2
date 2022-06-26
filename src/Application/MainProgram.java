/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Koneksi.koneksiDatabase;
import View.ViewLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class MainProgram {
    public static void main(String[] args) {
        if (!koneksiDatabase.isConnect()){
            JOptionPane.showMessageDialog(null, "Error : " + "Tidak terhubung ke Database!", "Communication Error", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        } else {
            new ViewLogin().setVisible(true);
        }
    }
}
