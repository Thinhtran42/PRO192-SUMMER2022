package dto;

import lib.Validation;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String id;
    private String name;
    private String address;
    private List<Pet> pets;


    public Owner() {
        id = "";
        name = "";
        address = "";
        pets = new ArrayList<>();
    }

    public Owner(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        pets = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputOwner() {
        System.out.println("Input Owner: ");
        while (true) {
            try {
                id = Validation.inputString("Input id of Owner: ", "^[SsEe(0-9)]+$");
                name = Validation.inputString("Input name of Owner: ", "^[aA-zZ ]+$");
                address = Validation.inputString("Input address of Owner: ", "^[0-9]+ [a-zA-Z ]+$");
                break;
            } catch (Exception er) {
                System.out.println("Input Owner again");
            }
        }
    }


    // viet ham de gan danh sach pets vo owner
    public boolean addPet(Pet pet) {
        return pets.add(pet);
    }

    // xuat danh sach pets ma owner so huu
    public void viewPetsWithServices() {
        if (pets.size() > 0) {
            System.out.println("List pets: ");
            for (Pet p : pets) {
                System.out.println(p);
            }
        } else System.out.println("data not found");
    }

    public void viewPetList(){
        if (pets.size() > 0){
            System.out.println("List pets of owner: ");
            for (Pet p : pets){
                System.out.println(p);
                p.displayServiceUsed();
            }
        } else System.out.println("data not found");
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Pet findPetById(int id) {
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getId() == id) {
                return pets.get(i);
            }
        }
        return null;
    }

}
