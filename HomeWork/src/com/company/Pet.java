package com.company;

public class Pet {

    //private static int counter;

    private int chipNumber;
    private String petName;
    private String type;

    public Pet(int chipNumber, String petName, String type) {
        this.chipNumber = chipNumber;
        this.petName = petName;
        this.type = type;
    }


    public void setChipNumber(int chipNumber) {
        this.chipNumber = chipNumber;
    }

    public String getPetName() {
        return petName;
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
        return "Pet{" +
                "chipNumber=" + chipNumber +
                ", petName='" + petName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
