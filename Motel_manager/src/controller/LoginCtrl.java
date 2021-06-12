/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Chat_server.MainForm;
import Server_Interface.LoginForm;
import Server_Interface.OwnerForm;
import javax.swing.JOptionPane;

/**
 *
 * @author Tran Nhan Nghia
 */
public class LoginCtrl extends LoginForm{
    private String name;
    private String pass;
    
    //Lay username va pass tu form login
    public void getNamePass(String username, String password){
        name=username;
        pass=password;
    }
    //Kiem tra thong tin nhap day du hay ko
    private boolean confirmInfo(){
        boolean check=true;
        if(name.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Chua nhap username");
            check=false;
            this.setVisible(true);
        }
        else if(pass.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Chua nhap password");
            check=false;
            this.setVisible(true);
        }
        return check;
    }
    
    public boolean isPassword(){
        boolean isCorrect = true;
        if(name.equals("root")){
            if(!pass.equals("root123")){
                JOptionPane.showMessageDialog(rootPane, "Sai mat khau");
                isCorrect=false;
                this.setVisible(true);
            }
            else{
                isCorrect=true;
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Tai khoan khong ton tai");
            isCorrect=false;
            this.setVisible(true);
        }
        return isCorrect;
    }
    
    public void loginSystem(){
        if(confirmInfo()){
            if(isPassword()){
               OwnerForm o = new  OwnerForm ();
               o.setVisible(true);
               MainForm main = new MainForm();
               main.setVisible(true);

            }
        }
    }
}
