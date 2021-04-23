package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonAucList  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fio;
    private String adress;
    private Long Id_ponts;
    private String date;
    private String passport;
    private String telephone;

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

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

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Long getId_ponts() {
        return Id_ponts;
    }

    public void setId_ponts(Long id_ponts) {
        Id_ponts = id_ponts;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public PersonAucList() {
    }

    public PersonAucList(String fio, String adress, Long id_ponts, String date, String passport, String telephone) {
        this.fio = fio;
        this.adress = adress;
        Id_ponts = id_ponts;
        this.date = date;
        this.passport = passport;
        this.telephone = telephone;
    }
}
