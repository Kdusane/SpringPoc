package com.dependancyInjection;

import org.springframework.stereotype.Component;

@Component
public class Technologies {

    private int techId;
    private String techName;

    public Technologies(int techId, String techName) {
        this.techId = techId;
        this.techName = techName;
    }

    public Technologies() {
    }

    public int getTechId() {
        return techId;
    }

    public void setTechId(int techId) {
        this.techId = techId;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public void Totechnologies(){
        System.out.println("Sucessfull done with technologies");
    }
}
