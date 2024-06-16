/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ucr.ac.cr.proyectointegrador.view;

import ucr.ac.cr.proyectointegrador.model.Course;

/**
 *
 * @author ingmo
 */
public class CoursesDataPanel extends javax.swing.JPanel {

    /**
     * Creates new form CoursesDataPanel
     */
    public CoursesDataPanel() {
        initComponents();
    }

    public String getAcronym() {
        return this.txtAcronym.getText();
    }

    public Course getCourse() {
        return new Course(this.txtAcronym.getText(),
                this.Label.getText(),
                this.txaDescription.getText(),
                Integer.parseInt(this.Label.getText()),
                this.cbModality.getSelectedItem().toString(),
                Integer.parseInt(this.txtTeachingHours.getText()),
                Integer.parseInt(this.txtIndependentWorkHours.getText()),
                this.cbBlock.getSelectedItem().toString());
    }

    public void setCourse(Course course) {
        this.txtAcronym.setText(course.getAcronym());
        this.Label.setText(course.getName());
        this.txaDescription.setText(course.getDescription());
        this.Label.setText(Integer.toString(course.getNumberCredits()));
        this.cbModality.setSelectedItem(course.getModality());
        this.txtTeachingHours.setText(Integer.toString(course.getTeachingHours()));
        this.txtIndependentWorkHours.setText(Integer.toString(course.getIndependentWorkHours()));
        this.cbBlock.setSelectedItem(course.getBlock());
    }

    public void clean() {
        this.txtAcronym.setText("");
        this.Label.setText("");
        this.txaDescription.setText("");
        this.Label.setText("");
        this.cbModality.setSelectedItem(null);
        this.txtTeachingHours.setText("");
        this.txtIndependentWorkHours.setText("");
        this.cbBlock.setSelectedItem(null);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAcronym = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescription = new javax.swing.JTextArea();
        txtName = new javax.swing.JTextField();
        txtNumberCredits = new javax.swing.JTextField();
        cbModality = new javax.swing.JComboBox<>();
        txtTeachingHours = new javax.swing.JTextField();
        txtIndependentWorkHours = new javax.swing.JTextField();
        cbBlock = new javax.swing.JComboBox<>();
        Label = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAcronym.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        add(txtAcronym, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 540, 50));

        txaDescription.setColumns(20);
        txaDescription.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txaDescription.setRows(5);
        jScrollPane1.setViewportView(txaDescription);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 540, 60));

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 540, 50));

        txtNumberCredits.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        add(txtNumberCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 540, 50));

        cbModality.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cbModality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Item", "Theoretical", "Practical", "Theoretical/Practical" }));
        add(cbModality, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 540, 50));

        txtTeachingHours.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        add(txtTeachingHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 540, 50));

        txtIndependentWorkHours.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        add(txtIndependentWorkHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 540, 50));

        cbBlock.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cbBlock.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Item", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI" }));
        add(cbBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 650, 540, 50));

        Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/textcourse.png"))); // NOI18N
        add(Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1367, 747));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JComboBox<String> cbBlock;
    private javax.swing.JComboBox<String> cbModality;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaDescription;
    private javax.swing.JTextField txtAcronym;
    private javax.swing.JTextField txtIndependentWorkHours;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumberCredits;
    private javax.swing.JTextField txtTeachingHours;
    // End of variables declaration//GEN-END:variables
}
