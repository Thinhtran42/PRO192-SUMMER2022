package dto;

import lib.Validation;

import java.util.ArrayList;
import java.util.List;

public class Services {
    private int id;
    private String name;
    private int price;
    private List<Pet> petList;


    public Services() {
        id = 0;
        name = "";
        price = 0;
        petList = new ArrayList<>();
    }

    public Services(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        petList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void inputService(){
        System.out.println("Input Service: ");
        while (true){
            try {
                id = (int) Validation.inputNumber("Input id of Service [1-100]: ", 1, 100);
                name = Validation.inputString("Input name of Service: ", "^[aA-zZ ]+$");
                price = (int) Validation.inputNumber("Input price of Service: [1-2000$]", 1, 2000);
                break;
            }catch (Exception er ){
                System.out.println("Input Service again");
            }
        }
    }

    //ham nay de add cac con pet su dung 1 dich vu
    public boolean addPetUseService(Pet pet){
        return petList.add(pet);
    }

    public void displayPetUseService(){
        if (petList.size() > 0){
            System.out.println("Pet list use Services");
            for (Pet pet : petList){
                System.out.println(pet);
            }
        } else System.out.println("Not found data");
    }

    @Override
    public String toString() {
        return "Services{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
