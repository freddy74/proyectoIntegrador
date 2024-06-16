/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.proyectointegrador.model;

/**
 *
 * @author familiacr
 */
public class Career {

    private int code;
    private String name;
    private String description;
    private String profPerfil;
    private String workingMarket;

    public Career() {
    }

    public Career(int code, String name, String description, String profPerfil, String workingMarket) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.profPerfil = profPerfil;
        this.workingMarket = workingMarket;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public String getProfPerfil() {
        return profPerfil;
    }

    public void setProfPerfil(String profPerfil) {
        this.profPerfil = profPerfil;
    }

    public String getWorkingMarket() {
        return workingMarket;
    }

    public void setWorkingMarket(String workingMarket) {
        this.workingMarket = workingMarket;
    }

    @Override
    public String toString() {
        return "Careers{" + "code=" + code + ", name=" + name + ", description=" + description + ", profPerfil=" + profPerfil + ", workingMarket=" + workingMarket + '}';
    }

}
