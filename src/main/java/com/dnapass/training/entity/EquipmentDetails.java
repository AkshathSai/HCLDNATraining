package com.dnapass.training.entity;

public class EquipmentDetails {

    private Integer id;
    private String name;
    private Integer quantityCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantityCount() {
        return quantityCount;
    }

    public void setQuantityCount(Integer quantityCount) {
        this.quantityCount = quantityCount;
    }

    public EquipmentDetails() {}

    // Constructor used in the query
    public EquipmentDetails(Integer id, String name, Integer quantityCount) {
        this.id = id;
        this.name = name;
        this.quantityCount = quantityCount;
    }

}
