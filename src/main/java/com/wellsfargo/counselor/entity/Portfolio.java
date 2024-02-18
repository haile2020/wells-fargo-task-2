package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;
@Entity
public class Portfolio {
//    Field
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column
    private Date creationDate;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "advisorId")
    private Advisor advisor;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clientId")
    private Client client;

    @OneToMany(mappedBy = "portfolio",cascade = CascadeType.ALL)
    private List<Security> securities;
//Constructor
    protected Portfolio(){

    }

    public Portfolio( Date creationDate){
        this.creationDate = creationDate;
    }

//    getter and setter
    public Long getPortfolioId(){return portfolioId;}

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
