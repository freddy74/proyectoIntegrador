/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.proyectointegrador.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.proyectointegrador.model.Course;
import ucr.ac.cr.proyectointegrador.view.ButtonsPanel;
import ucr.ac.cr.proyectointegrador.view.CoursesDataPanel;
import ucr.ac.cr.proyectointegrador.view.CoursesGUI;

/**
 *
 * @author familiacr
 */
public class CourseController implements ActionListener {

    private Course course;
    private CoursesGUI coursesGUI;
    private CoursesDataPanel cooursesDataPanel;
    private ButtonsPanel buttonsPanel;
    private MainController mainController;

    public CourseController() {
        this.coursesGUI = new CoursesGUI();
        this.cooursesDataPanel = this.coursesGUI.getCoursesDataPanel();
        this.buttonsPanel = this.coursesGUI.getButtonsPanel();
        this.buttonsPanel.listen(this);
        this.coursesGUI.listen(this);
        this.course = new Course();
        this.coursesGUI.setVisible(true);
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
                coursesGUI.dispose();
                break;
        }
    }

}
