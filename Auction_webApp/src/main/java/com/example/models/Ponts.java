package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Ponts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private Long id_location, id_auction;
    private String adress, cad_number,
            communications;
    private int pont_number;
    private double area, initial_cost, deposit, costs;

    public Long getId_auction() {
        return id_auction;
    }

    public void setId_auction(Long id_auction) {
        this.id_auction = id_auction;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCommunications() {
        return communications;
    }

    public void setCommunications(String communications) {
        this.communications = communications;
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

    public String getCad_number() {
        return cad_number;
    }

    public void setCad_number(String cad_number) {
        this.cad_number = cad_number;
    }

    public int getPont_number() {
        return pont_number;
    }

    public void setPont_number(int pont_number) {
        this.pont_number = pont_number;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getInitial_cost() {
        return initial_cost;
    }

    public void setInitial_cost(double initial_cost) {
        this.initial_cost = initial_cost;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getCosts() {
        return costs;
    }

    public void setCosts(double costs) {
        this.costs = costs;
    }

    public Ponts() {
    }

    public Ponts(String adress, double area, String communications, Long id_auction ) {
        this.id_auction = id_auction;
        this.adress = adress;
        this.communications = communications;
        this.area = area;
    }
}