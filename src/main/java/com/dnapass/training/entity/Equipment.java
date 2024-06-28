package com.dnapass.training.entity;

import javax.persistence.*;

@Entity
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer equipmentId;
    private String name;
    private Integer count;
    private Double rentPerDay;
    private String estate, ecity, village , epincode, contactperson, emobilenumber, available;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer id) {
        this.equipmentId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(Double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate;
    }

    public String getEcity() {
        return ecity;
    }

    public void setEcity(String ecity) {
        this.ecity = ecity;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getEpincode() {
        return epincode;
    }

    public void setEpincode(String epincode) {
        this.epincode = epincode;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    public String getEmobilenumber() {
        return emobilenumber;
    }

    public void setEmobilenumber(String emobilenumber) {
        this.emobilenumber = emobilenumber;
    }

    public Equipment() {}

    public Equipment(String name, Integer count, Double rentperday, String estate, String ecity, String village, String epincode, String contactperson, String emobilenumber, User user1) {
        this.name = name;
        this.count = count;
        this.rentPerDay = rentperday;
        this.estate = estate;
        this.ecity = ecity;
        this.village = village;
        this.epincode = epincode;
        this.contactperson = contactperson;
        this.emobilenumber = emobilenumber;
        this.user = user1;
    }

    public Equipment(Integer equipmentId, String name, Integer count, Double rentPerDay, String estate, String ecity, String village, String epincode, String contactperson, String emobilenumber, String available, User user) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.count = count;
        this.rentPerDay = rentPerDay;
        this.estate = estate;
        this.ecity = ecity;
        this.village = village;
        this.epincode = epincode;
        this.contactperson = contactperson;
        this.emobilenumber = emobilenumber;
        this.available = available;
        this.user = user;
    }

    public Equipment(Integer equipmentId, String name, Integer count, Double rentperday, String estate, String ecity, String village, String epincode, String contactperson, String emobilenumber, User user1) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.count = count;
        this.rentPerDay = rentperday;
        this.estate = estate;
        this.ecity = ecity;
        this.village = village;
        this.epincode = epincode;
        this.contactperson = contactperson;
        this.emobilenumber = emobilenumber;
        this.user = user1;
    }

}
