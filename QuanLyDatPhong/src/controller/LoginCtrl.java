/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Interface.CustomerForm;
import Interface.LoginForm;
import Interface.OwnerForm;
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
        }
        else if(pass.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Chua nhap password");
            check=false;
        }
        return check;
    }
    
    public boolean isPassword(){
        boolean isCorrect = true;
        if(name.equals("root")){
            if(!pass.equals("root123")){
                JOptionPane.showMessageDialog(rootPane, "Sai mat khau");
                isCorrect=false;
            }
            else{
                isCorrect=true;
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Tai khoan khong ton tai");
            isCorrect=false;
        }
        return isCorrect;
    }
    
    public void loginSystem(){
        if(confirmInfo()){
            if(isPassword()){
               OwnerForm o = new  OwnerForm ();
               o.setVisible(true);
                
//                CustomerForm c = new CustomerForm();
//                c.setVisible(true);
            }
        }
    }
}
