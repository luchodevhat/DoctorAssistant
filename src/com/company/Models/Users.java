package com.company.Models;

public abstract class Users {
    private int id;
    private String name, email, phoneNumber, addres;

    // constructor

    Users(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // getters setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    // metodo to string

    @Override
    public String toString() {
        return "Datos de usario" + "\n" +
                "id = " + id + "\n" +
                "name = " + name + "\n" +
                "email = " + email + "\n" +
                "phoneNumber = " + phoneNumber + "\n" +
                "addres = " + addres + "\n";
    }

    public abstract void showDataUser();
}
