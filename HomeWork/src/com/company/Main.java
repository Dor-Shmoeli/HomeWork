package com.company;

import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {


        Hospital.addClient("dor","shmoeli", "0506321489", true);
        Hospital.addClient("naor","shmoeli", "0523698741", false);
        Hospital.addClient("tavor","shmoeli", "0546321598", true);


        Hospital.addClient("tavi","shmoeli", "0546123498", true);
        //System.out.println(Hospital.getClients());
        Hospital.removeClient(2);
        //Hospital.removeClient(3);
        System.out.println(Hospital.getClients());
        Hospital.addPetToClient(1, new Animal("buddy", "dog"));
        System.out.println(Hospital.getClients());
    }
}
