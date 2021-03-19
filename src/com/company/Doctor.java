package com.company;

public class Doctor {
    //Atributos
    int id;
    String name;
    String email;
    String speciality;

    Doctor(String name, String speciality){

        this.name = name;
        this.speciality = speciality;
        System.out.println("El nombre del Doctor asignado es: " + name);
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

}
