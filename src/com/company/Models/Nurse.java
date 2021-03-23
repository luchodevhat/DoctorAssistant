package com.company.Models;

public class Nurse extends Users {

    private String speciality;

    // constructor

    Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Verde" + "\n" +
                            "Departamentos: Nutriologia, Cancerologia, Pedriatria" + "\n" +
                            "Empleado: Nurse");
    }

    // getter setters

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
