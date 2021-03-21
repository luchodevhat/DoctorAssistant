package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Doctor doctorOne = new Doctor("Miguel", "Ortopedic");
        doctorOne.addAvailableAppointment(new Date(), "3 pm");
        doctorOne.addAvailableAppointment(new Date(), "6 pm");
        doctorOne.addAvailableAppointment(new Date(), "8 pm");

        /*
        for (Doctor.AvailableAppointment ap: doctorOne.getAvailableAppointment()) {
            System.out.println(ap.ge);
        }
        */
        UIMenu.showMenu();
    }
}
