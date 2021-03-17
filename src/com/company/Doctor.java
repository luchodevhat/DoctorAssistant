package com.company;

public class Doctor {
    //Atributos
    int id;
    String name;
    String speciality;

    Doctor(String name){
        System.out.println("El nombre del Doctor asignado es: " + name);
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

}
