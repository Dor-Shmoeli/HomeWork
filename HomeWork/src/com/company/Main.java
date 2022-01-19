package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Client client = new Client("dor", "shmoeli", "0546845324", false);

        Hospital hospital = new Hospital();
        hospital.addClient(client);
        hospital.addClient("ikwnf", "kmndc", "04556778", false);

        Pet pet1 = new Pet(37465, "Rexi", "Dog");
        Pet pet2 = new Pet(37565, "Buddy", "Dog");
        Pet pet3 = new Pet(35666, "Humi", "Dog");
        Pet pet4 = new Pet(37789, "Doni", "Dog");
        Pet pet5 = new Pet(34563, "Haim", "Dog");
        Pet pet6 = new Pet(36879, "Rdsa", "Dog");

        hospital.addPetToClient(1, pet2);
        //hospital.removePetFromClient(1,37565);
        ER2 er = new ER2();

        er.addPet(pet1);
        er.addPet(pet2);
        er.addPet(pet3);
        er.addPet(pet4);
        er.addPet(pet5);
//
//        er.removePetByName("Rexi");
//
//        er.addPet(pet6);
//
//        er.removePetByName("Rexi");
//
//        er.showAllBeds();

        System.out.println(hospital.getClients());
        hospital.removePetFromClient(1,37565);
        System.out.println(hospital.getClients());


    }
}
