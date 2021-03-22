package com.company;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Luis Alejandro Alfaro Quesada", "alfaroalejandro597@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        myDoctor.setId(345678);
        myDoctor.setPhoneNumber("12345678");
        myDoctor.setAddres("275 Este de los bomberos");
        myDoctor.setSpeciality("Cirujano");

        System.out.println(myDoctor);

        //UIMenu.showMenu();
    }
}
