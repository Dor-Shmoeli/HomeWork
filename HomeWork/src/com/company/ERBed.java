package com.company;

public class ERBed {

    private int number;
    private Boolean isTaken = false;
    private Pet pet = null;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Boolean getTaken() {
        return isTaken;
    }

    public Pet getPet() {
        return pet;
    }

    public void addPet(Pet pet) {
        this.pet = pet;
        this.isTaken = true;
    }

    public void removePet(){
        this.pet = null;
        this.isTaken = false;
    }

    @Override
    public String toString() {
        return "ERBed{" +
                "number=" + number +
                ", isTaken=" + isTaken +
                ", pet=" + pet +
                '}';
    }
}
