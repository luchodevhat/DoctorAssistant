package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Users{

    //Atributo de doctor

    private String speciality;

// constructor

    Doctor(String name, String email) {
        super(name, email);
        System.out.println("El nombre del Doctor asignado es: " + name);
        this.speciality = speciality;
    }

    // getters y setters

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    // metodos

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "Datos del doctor" + "\n" +
                "speciality = " + speciality + "\n" +
                "availableAppointments = " + availableAppointments.toString();
    }
    // clase anidada

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        // constructor de la clase anidada

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        // getters y setter de la clase anidada

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        // metodo toString

        @Override
        public String toString() {
            return "AvailableAppointment" + "\n" +
                    "date = " + date + "\n" +
                    "time = " + time + "\n";
        }
    }

}