package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonFreePont  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private Long id_ponts;
    private String fio, date, tel_number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_ponts() {
        return id_ponts;
    }

    public void setId_ponts(Long id_ponts) {
        this.id_ponts = id_ponts;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTel_number() {
        return tel_number;
    }

    public void setTel_number(String tel_number) {
        this.tel_number = tel_number;
    }

    public PersonFreePont() {
    }

    public PersonFreePont(Long id_ponts, String fio, String date, String tel_number) {
        this.id_ponts = id_ponts;
        this.fio = fio;
        this.date = date;
        this.tel_number = tel_number;
    }
}
