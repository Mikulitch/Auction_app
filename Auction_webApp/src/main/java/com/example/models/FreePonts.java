package com.example.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class FreePonts {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long id_location;
    private double area;
    private String communications, registration_authority, adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_location() {
        return id_location;
    }

    public void setId_location(Long id_location) {
        this.id_location = id_location;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCommunications() {
        return communications;
    }

    public void setCommunications(String communications) {
        this.communications = communications;
    }

    public String getRegistration_authority() {
        return registration_authority;
    }

    public void setRegistration_authority(String registration_authority) {
        this.registration_authority = registration_authority;
    }

    public FreePonts() {
    }

    public FreePonts(String adress, double area, String communications) {

        this.adress = adress;
        this.area = area;
        this.communications = communications;

    }
}
