package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name = "Description")
    public String description;
    @Column(name = "Price")
    public double price;
    @Column(name = "Color")
    public String color;

    public int getId(){
        return id;
    }
    public Items(){

    }
    public Items(String description,double price, String color){
        this.description = description;
        this.price = price;
        this.color = color;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
