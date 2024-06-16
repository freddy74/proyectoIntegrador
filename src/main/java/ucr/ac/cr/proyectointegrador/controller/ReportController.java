/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.proyectointegrador.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import ucr.ac.cr.proyectointegrador.view.ReportGUI;
import ucr.ac.cr.proyectointegrador.view.TablePanelGUI;

/**
 *
 * @author familiacr
 */
public class ReportController implements ActionListener, MouseListener {

    private ReportGUI reportGUI;
    private TablePanelGUI tablePanelGUI;
    private MainController mainController;
    
    public ReportController() {
        this.reportGUI = new ReportGUI();
        this.reportGUI.listen(this);
        this.reportGUI.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "CareersList":
                this.tablePanelGUI = new TablePanelGUI();
                //this.tablePanelGUI.setTable(Career.HEADER_CAREER, this.career.getMatrix)
                
                
                this.tablePanelGUI.listenClicked(this);
                this.tablePanelGUI.setVisible(true);
                break;
                
            case "CoursesList":
                this.tablePanelGUI = new TablePanelGUI();
                
                
                
                this.tablePanelGUI.listenClicked(this);
                this.tablePanelGUI.setVisible(true);
                break;
                
            case "Back":
                this.mainController = new MainController();
                reportGUI.dispose();
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
     
    }

    @Override
    public void mousePressed(MouseEvent e) {
    
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    
    }

    @Override
    public void mouseExited(MouseEvent e) {
     
    }

}
