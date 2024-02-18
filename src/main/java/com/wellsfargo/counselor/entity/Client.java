package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Client {
//    Fields
    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "advisorId")
    private Advisor advisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL)
    private List<Client> clients;

//    Constructor
    protected Client(){

    }

    public Client(String firstName, String lastName, String address, String phone, String email ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    //getter and setter
    public  Long getClientId(){ return clientId;}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Advisor getAdvisor(){return this.advisor;}

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}



