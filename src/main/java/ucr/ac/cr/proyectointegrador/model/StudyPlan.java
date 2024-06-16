/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.proyectointegrador.model;

/**
 *
 * @author familiacr
 */
public class StudyPlan {

    private int id;
    private String description;
    private int numberCredits;
    private String approveDate;
    private String effectiveDate;

    public StudyPlan() {
    }

    public StudyPlan(int id, String description, int numberCredits, String approveDate, String effectiveDate) {
        this.id = id;
        this.description = description;
        this.numberCredits = numberCredits;
        this.approveDate = approveDate;
        this.effectiveDate = effectiveDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberCredits() {
        return numberCredits;
    }

    public void setNumberCredits(int numberCredits) {
        this.numberCredits = numberCredits;
    }

    public String getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @Override
    public String toString() {
        return "StudyPlan{" + "id=" + id + ", description=" + description + ", numberCredits=" + numberCredits + ", approveDate=" + approveDate + ", effectiveDate=" + effectiveDate + '}';
    }


}
