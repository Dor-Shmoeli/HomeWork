package com.company;

import java.util.ArrayList;

public class Hospital{


     private static ArrayList<Client> clients = new ArrayList<>();
     private static ArrayList<Animal> pets = new ArrayList<>();

     public static ArrayList<Client> getClients() {
          return clients;
     }

     public void setClients(ArrayList<Client> clients) {
          this.clients = clients;
     }

     public ArrayList<Animal> getPets() {
          return pets;
     }

     public void setPets(ArrayList<Animal> pets) {
          this.pets = pets;
     }

     @Override
     public String toString() {
          return "Hospital{}";
     }

     public static void addClient(String firstName, String lastName, String phone, Boolean ads){

         clients.add(new Client(firstName, lastName, phone, ads));
     }
     public static void removeClient(int clientNumber){

          getClientByClientNumber()
     }
     public static void addPetToClient(int clientNumber, Animal a){
          getClientByClientNumber()

     }







}

