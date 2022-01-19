package com.company;

import java.util.ArrayList;

public class Hospital {

     private ArrayList<Client> clients;
     private ER er;
    // private Pet pet;

     public Hospital(){
          clients = new ArrayList<>();
          er = new ER();
     }

     public void sendAds(String adContent){
          for (Client client: clients) {
               if (client.isAds()) {
                    client.sendMessage(adContent);
               }
          }
     }

     public void sendMessageToOwners(String petType, String content){

     }

     public void addClient(String firstName, String lastName, String phone, boolean ads){

          clients.add(new Client(firstName, lastName, phone,ads));

     }

     public void addClient(Client client) {
          this.clients.add(client);
     }

     public ArrayList<Client> getClients() {
          return clients;
     }

     public void removeClientByClientNumber(int clientNumber){
          for (Client client : clients) {
               if (client.getClientNumber() == clientNumber){
                    clients.remove(client);
                    System.out.println(client.getClientNumber() + " was removed (" + client.getFullName() + ")");
                    return;
               }
          }
          System.out.println("Client was not found");
     }

     public void addPetToClient(int clientNumber, Pet pet){
          for (Client client : clients) {
               if (client.getClientNumber() == clientNumber){
                    client.addPets(pet);
                    System.out.println(pet.getPetName() + " was added to " + client.getFullName());
                    return;
               }
          }
          System.out.println("Client was not found");
     }

     public void removePetFromClient(int clientNumber, int chipNumber){
          for (Client client : clients) {
               if (client.getClientNumber() == clientNumber){
                    client.getPets()
                    // client.removePet(chipNumber);
                 //  System.out.println(client.getPets() + " was removed from " + client.getFullName());
                    return;
               }

          }
     }





}
