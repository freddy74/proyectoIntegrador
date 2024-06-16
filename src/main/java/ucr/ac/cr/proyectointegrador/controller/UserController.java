/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.proyectointegrador.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.proyectointegrador.model.User;
import ucr.ac.cr.proyectointegrador.view.ButtonsPanel;
import ucr.ac.cr.proyectointegrador.view.DataUserPanel;
import ucr.ac.cr.proyectointegrador.view.UserGUI;

/**
 *
 * @author familiacr
 */
public class UserController implements ActionListener {

    private UserGUI userGUI;
    private ButtonsPanel buttonsPanel;
    private DataUserPanel dataUserPanel;
    private MainController mainController;
    private User user;

    public UserController() {
        this.userGUI = new UserGUI();
        this.buttonsPanel = this.userGUI.getButtonsPanel();
        this.dataUserPanel = this.userGUI.getDataUserPanel();
        this.buttonsPanel.listen(this);
        this.userGUI.listen(this);
        this.user = new User();
        this.userGUI.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Create":
                System.out.println("Create");
                break;
            case "Read":
                System.out.println("Read");
                break;
            case "Update":
                System.out.println("Update");
                break;
            case "Delete":
                System.out.println("Delete");
                break;
            case "Back":
                this.mainController = new MainController();
                userGUI.dispose();
                System.out.println("Back");
                break;
        }
    }

}
