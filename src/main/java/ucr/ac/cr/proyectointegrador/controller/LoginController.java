/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.proyectointegrador.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.proyectointegrador.view.DataLoginPanel;
import ucr.ac.cr.proyectointegrador.view.LoginGUI;

/**
 *
 * @author familiacr
 */
public class LoginController implements ActionListener {

    private LoginGUI loginGUI;
    private DataLoginPanel dataLoginPanel;
    private MainController mainController;
    private UserController userController;

    public LoginController() {
        this.loginGUI = new LoginGUI();
        this.dataLoginPanel = this.loginGUI.getDataLoginPanel();
        this.loginGUI.listen(this);
        this.loginGUI.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Login":
                System.out.println("Login");
                this.mainController = new MainController();
                loginGUI.dispose();
                break;

            case "Exit":

                loginGUI.dispose();
                break;
        }
    }
}
