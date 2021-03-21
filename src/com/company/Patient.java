package com.company;
import java.util.Scanner;

public class Patient {
    private String name, email, address, phoneNumber, birthday, blood;
    private Double weight,height;

    // constructor
    Patient(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Metodos setter y getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
            System.out.println("Se ha guardado el numero correctamente");
        }
        else if (phoneNumber.length() != 8) {
            System.out.println("El numero tiene que ser de 8 digitos");
        }
    }

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
}
