package com.company;

public class ER2 {
    
        private ERBed[] beds = new ERBed[5];

        public ER2() {
            setBeds();
        }
        
        private void setBeds() {
            for (int i = 0; i < beds.length; i++) {
                ERBed bed = new ERBed();
                bed.setNumber(i + 1);
                beds[i] = bed;
            }
        }

        public ERBed getERbeds(int bedNumber ){
            return beds[bedNumber];
        }

        public void addPet(Pet pet) {
            for (ERBed bed : beds) {
                if(!bed.getTaken()){
                    bed.addPet(pet);
                    System.out.println(pet.getPetName() + " is on bed number: " + bed.getNumber());
                    return;
                }
            }
            System.err.println("There is no room for " + pet.getPetName());
        }

        public void removePetByName(String petName){
            for (ERBed bed : beds) {
                if (bed.getPet().getPetName() == petName ){
                    bed.removePet();
                    System.out.println(petName + " removed from bed number " + bed.getNumber());
                    return;
                }
            }
            System.err.println(petName + " wasn't found in ER");
        }

        public void showAllBeds() {
            for (ERBed bed : beds) {
                System.out.println(bed);
            }
        }
}
