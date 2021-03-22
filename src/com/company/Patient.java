package com.company;
import java.util.Scanner;

public class Patient extends Users{
    private String birthday, blood;
    private Double weight,height;

    // constructor
    Patient(String name, String email) {
        super(name, email);
    }

    // getters y setters

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + "Kg.";
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getHeight() {
        return this.height + "METROS";
    }

    // metodo toString


    @Override
    public String toString() {
        return super.toString() + " Datos del paciente" + "\n" +
                "birthday =" + birthday + '\n' +
                "blood =" + blood + '\n' +
                "weight =" + weight + "\n" +
                "height =" + height;
    }
}
