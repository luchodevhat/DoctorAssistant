package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos

    int id;
    String name;
    String email;
    String speciality;

    // Constructor

    Doctor(String name, String speciality){

        this.name = name;
        this.speciality = speciality;
        System.out.println("El nombre del Doctor asignado es: " + name);
    }

    // Metodos

    public void showName(){
        System.out.println(name);
    }

    ArrayList<AvailableAppointment>list = new ArrayList<>(); // array creado para manejar las citas del doctor

    public void addAvailableAppointment(Date date, String time) {
        list.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointment() {
        return list;
    }


    //Esta es la clase anidada

    public class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        // Constructor de la clase anidada

        AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }


    }

}
