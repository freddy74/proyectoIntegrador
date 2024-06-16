/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.proyectointegrador.model;

/**
 *
 * @author familiacr
 */
public class Course {

    private String acronym;
    private String name;
    private String description;
    private int numberCredits;
    private String modality;
    private int teachingHours;
    private int independentWorkHours;
    private String block;

    public Course() {
    }

    public Course(String acronym, String name, String description, int numberCredits, String modality, int teachingHours, int independentWorkHours, String block) {
        this.acronym = acronym;
        this.name = name;
        this.description = description;
        this.numberCredits = numberCredits;
        this.modality = modality;
        this.teachingHours = teachingHours;
        this.independentWorkHours = independentWorkHours;
        this.block = block;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public int getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(int teachingHours) {
        this.teachingHours = teachingHours;
    }

    public int getIndependentWorkHours() {
        return independentWorkHours;
    }

    public void setIndependentWorkHours(int independentWorkHours) {
        this.independentWorkHours = independentWorkHours;
    }



    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "Course{" + "acronym=" + acronym + ", name=" + name + ", description=" + description + ", numberCredits=" + numberCredits + ", modality=" + modality + ", teachingHours=" + teachingHours + ", independentWorkHours=" + independentWorkHours + ", block=" + block + '}';
    }



}
