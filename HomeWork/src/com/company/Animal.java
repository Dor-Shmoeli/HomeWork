package com.company;

public class Animal {

    private static int counter;

    private int chipNumber;
    private String petName;
    private String type;

    public String getPetName() {
        return petName;
    }

    public Animal(String petName, String type) {
        this.petName = petName;
        this.type = type;
        this.chipNumber = ++counter;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getChipNumber() {
        return chipNumber;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "chipNumber=" + chipNumber +
                ", petName='" + petName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
