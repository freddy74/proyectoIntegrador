/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.proyectointegrador.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.proyectointegrador.model.StudyPlan;
import ucr.ac.cr.proyectointegrador.view.ButtonsPanel;
import ucr.ac.cr.proyectointegrador.view.DataStudyPlanPanel;
import ucr.ac.cr.proyectointegrador.view.StudyPlanGUI;

/**
 *
 * @author familiacr
 */
public class StudyPlanController implements ActionListener {

    private StudyPlanGUI studyPlanGUI;
    private DataStudyPlanPanel dataStudyPlanPanel;
    private ButtonsPanel buttonPanel;
    private MainController mainController;
    private StudyPlan studyPlan;

    public StudyPlanController() {
        this.studyPlanGUI = new StudyPlanGUI();
        this.studyPlanGUI.listen(this);
        this.dataStudyPlanPanel = this.studyPlanGUI.getStudyPlanPanel();
        this.buttonPanel = this.studyPlanGUI.getButtonsPanel();
        this.buttonPanel.listen(this);
        this.studyPlan = new StudyPlan();
        this.studyPlanGUI.setVisible(true);
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
                studyPlanGUI.dispose();
                System.out.println("Back");
                break;
        }
    }

}
