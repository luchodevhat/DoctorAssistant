package com.company.Ui;

import com.company.Models.Doctor;
import com.company.Models.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"January", "February", "March", "April", "May"};
    public static Doctor doctorlogged;
    public static Patient patientlogged;


    // inicio del ui menu
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Quit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;

                case 2:
                    response = 0;
                    authUser(2);
                    break;

                case 0:
                    System.out.println("Thank you for you visit");
                    break;

                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    // validacion del tipo de usuario y contenido
    private static void authUser(int userType) {

        // Usertype == doctor, usertype == 2 patient

        //Doctor
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Ale Alafaro", "alfaro.com"));
        doctors.add(new Doctor("Miguel Martinez", "martinez.com"));
        doctors.add(new Doctor("Sebastian Rosales", "rosales.com"));

        //patient
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Ana Lobo", "lobo.com"));
        patients.add(new Patient("Luis Gonzales", "gonzales.com"));
        patients.add(new Patient("Lucio Alfredo", "alfredo.com"));

        boolean emailcheck = false;

        while (!emailcheck) {
            System.out.println("Insert your email please ");
            Scanner sc = new Scanner(System.in);
           String email = (sc.nextLine());

           if (userType == 1) {
               for (Doctor d: doctors) {
                   if (d.getEmail().equals(email)) {
                       emailcheck = true;
                       // get the doctor data
                       doctorlogged = d;
                       //show doctor menu
                   }
               }
           }
           else if (userType == 2) {
               for (Patient p: patients) {
                   if (p.getEmail().equals(email)) {
                       emailcheck = true;
                       // get the patient data
                       patientlogged = p;
                       // show patient menu
                   }
               }
           }
        }
    }

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i +"." + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
