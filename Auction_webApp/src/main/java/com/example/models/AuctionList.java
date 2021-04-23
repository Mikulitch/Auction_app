package com.example.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AuctionList  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String date;
    private String auction_name;
    private String auction_text;
    private String map_link;



    public String getMap_link() {
        return map_link;
    }

    public void setMap_link(String map_link) {
        this.map_link = map_link;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuction_name() {
        return auction_name;
    }

    public void setAuction_name(String auction_name) {
        this.auction_name = auction_name;
    }

    public String getAuction_text() {
        return auction_text;
    }

    public void setAuction_text(String auction_text) {
        this.auction_text = auction_text;
    }
}
