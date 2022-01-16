package com.company;

public class Client {

    private static int counter;

    private  int clientNumber;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private Animal pets;
    private boolean ads;

    public Client(String firstName, String lastName, String phoneNum, boolean ads) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        //this.pets = pets;
        this.ads = ads;
        clientNumber = ++counter;


    }


    public boolean isAds() {
        return ads;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public Animal getPets() {
        return pets;
    }

    public void setPets(Animal pets) {
        this.pets = pets;
    }

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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }




    @Override
    public String toString() {
        return "Client{" +
                "clientNumber=" + clientNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", pets=" + pets +
                ", ads=" + ads +
                '}';
    }
}
