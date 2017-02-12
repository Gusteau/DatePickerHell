package com.gigasoft.proyectosemana2curso3;

/**
 * Created by lican on 12/02/2017.
 */

public class DataChanges {
    private String name;
    private String bday;
    private String number;
    private String email;
    private String description;


    public DataChanges(String name, String bday, String number, String email, String description) {
        this.name = name;
        this.bday = bday;
        this.number = number;
        this.email = email;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
