package com.revature.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address{

    @Id
    private String id;

    @Valid
    @NotNull
    private Integer customerId;

    @Valid
    @NotNull
    private String fullName;

    @Valid
    @NotNull
    private String line1;

    @Valid
    private String line2;

    @Valid
    @NotNull
    private String city;

    @Valid
    @NotNull
    private String state;

    @Valid
    @NotNull
    private int zipCode;

    @Valid
    @NotNull
    private boolean billing;

    private final Shipping shipping = new Shipping();

    public Address() {super();}

    public Address(Integer customerId, String fullName, String line1, String line2, String city, String state, int zipCode, boolean billing) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.billing = billing;
    }

    public Address(Integer customerId, String fullName, String line1, String city, String state, int zipCode, boolean billing) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.line1 = line1;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.billing = billing;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}
    public String getLine1() {return line1;}
    public void setLine1(String line1) {this.line1 = line1;}
    public String getLine2() {return line2;}
    public void setLine2(String line2) {this.line2 = line2;}
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}
    public String getState() {return state;}
    public void setState(String state) {this.state = state;}
    public int getZipCode() {return zipCode;}
    public void setZipCode(int zipCode) {this.zipCode = zipCode;}
    public int getCustomerId() {return customerId;}
    public void setCustomerId(int customerId) {this.customerId = customerId;}
    public boolean isBilling() {return billing;}
    public void setBilling(boolean billing) {this.billing = billing;}
    public Shipping getShipping() {return shipping;}
}