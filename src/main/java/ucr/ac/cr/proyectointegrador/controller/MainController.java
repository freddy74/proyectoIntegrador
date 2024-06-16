/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.proyectointegrador.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.proyectointegrador.view.CreditsGUI;
import ucr.ac.cr.proyectointegrador.view.MainGUI;

/**
 *
 * @author familiacr
 */
public class MainController implements ActionListener {

    private MainGUI mainGUI;
    private CreditsGUI creditsGUI;
    private CourseController courseController;
    private CareerController careerController;
    private StudyPlanController studyPlanController;
    private ReportController reportController;
    private UserController userController;

    public MainController() {
        this.mainGUI = new MainGUI();
        this.mainGUI.listen(this);
        this.mainGUI.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Exit":
                System.exit(0);
                break;
            case "Credits":
                this.creditsGUI = new CreditsGUI();
                creditsGUI.setVisible(true);
                System.out.println("Credits");
                break;
            case "Courses":
                this.courseController = new CourseController();
                mainGUI.dispose();
                System.out.println("Courses");
                break;
            case "Careers":
                this.careerController = new CareerController();
                mainGUI.dispose();
                System.out.println("Careers");
                break;
            case "StudyPlans":
                this.studyPlanController = new StudyPlanController();
                mainGUI.dispose();
                System.out.println("StudyPlans");
                break;
            case "Reports":
                this.reportController = new ReportController();
                mainGUI.dispose();
                System.out.println("Reports");
                break;
                case "Users":
                this.userController= new UserController();
                mainGUI.dispose();
                System.out.println("Users");
                break;
        }
    }

}
