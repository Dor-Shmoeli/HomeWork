package com.company;

import java.util.ArrayList;

public class Client {

    private ArrayList<Pet> pets;
    private static int counter;

    private int clientNumber;
    private String firstName;
    private String lastName;
    private String phone;

    private boolean ads;

    public Client(String firstName, String lastName, String phone, boolean ads) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.ads = ads;
        pets = new ArrayList<>();
        clientNumber = ++counter;


    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public boolean isAds() {
        return ads;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }
    public int getPetChipNumber(Client client){

        client.getPets()

    }


    public void addPets(Pet pet){
        pets.add(pet);
    }



    public void removePet(int chipNumber){

        pets.remove(chipNumber);

    }

    public void setAds(Boolean ads){
        this.ads = ads;
    }
    public void sendMessage(String adContent) {

    }




    @Override
    public String toString() {
        return "Client{" +
                "clientNumber=" + clientNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", pets=" + pets +
                ", ads=" + ads +
                '}';
    }


}
