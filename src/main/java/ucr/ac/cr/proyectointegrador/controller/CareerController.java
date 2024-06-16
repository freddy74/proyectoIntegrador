/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.proyectointegrador.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.proyectointegrador.model.Career;
import ucr.ac.cr.proyectointegrador.view.ButtonsPanel;
import ucr.ac.cr.proyectointegrador.view.CareersGUI;
import ucr.ac.cr.proyectointegrador.view.DataCareersPanel;

/**
 *
 * @author familiacr
 */
public class CareerController implements ActionListener {

    private CareersGUI careersGUI;
    private ButtonsPanel buttonsPanel;
    private DataCareersPanel dataCareersPanel;
    private Career career;
    private MainController mainController;

    public CareerController() {
        this.careersGUI = new CareersGUI();
        this.dataCareersPanel = this.careersGUI.getDataCareersDataPanel();
        this.buttonsPanel = this.careersGUI.getButtonsPanel();
        this.buttonsPanel.listen(this);
        this.careersGUI.listen(this);
        this.career = new Career();
        this.careersGUI.setVisible(true);
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
                careersGUI.dispose();
                break;
        }
    }

}
