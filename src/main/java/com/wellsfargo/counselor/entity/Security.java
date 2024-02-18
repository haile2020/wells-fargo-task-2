package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Security {
//    Field
    @Id
    @GeneratedValue()
    private long securityId;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private double purchasePrice;

    @Column
    private Date purchaseDate;

    @Column
    private int quantity;
 @ManyToOne(fetch = FetchType.LAZY)
 @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;
// Constructor
    protected Security(){

    }

    public Security(String name, String category, double purchasePrice, Date purchaseDate, int quantity){
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity =quantity;
    }
// getter and setter
    public Long getSecurityId(){return  securityId;}
    public String getName(){ return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory(){return category;}

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
