package com.dnapass.training.entity;

public class ItemDetails {

    private Integer itemId;
    private String itemName;
    private String itemDescription;
    private Integer itemQuantity;
    private String userName;
    private String userMobileNumber;
    private Integer userId;
    private String itemType;
    private double itemPrice;
    private String city;
    private User user;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobileNumber() {
        return userMobileNumber;
    }

    public void setUserMobileNumber(String userMobileNumber) {
        this.userMobileNumber = userMobileNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ItemDetails() {}

    //public ItemDetails(int i, String cabbage, int i1, String username, String mobileNumber, Integer id)

    public ItemDetails(Integer itemId, String itemName, Integer itemQuantity, String userName, String mobileNumber, Integer id) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.user = new User(id, userName, mobileNumber);
    }

    public ItemDetails(Integer itemId, String itemName, String itemType, double itemPrice, String city) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemPrice = itemPrice;
        this.city = city;
    }

    // Constructor used in the query
    public ItemDetails(Integer itemId, String itemName, String itemDescription, Integer itemQuantity, String userName, String userMobileNumber, Integer userId) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemQuantity = itemQuantity;
        this.userName = userName;
        this.userMobileNumber = userMobileNumber;
        this.userId = userId;
    }

}
