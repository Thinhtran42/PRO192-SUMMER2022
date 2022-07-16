package dto;

import lib.Validation;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private int id;
    private String name;
    private String birthday;
    private String gender;
    private List<Services> usedServices;
    private List<Integer> useList;

    public Pet() {
        id = 0;
        name = "";
        birthday = "";
        gender = "";
        usedServices = new ArrayList<>();
        useList = new ArrayList<>();
    }

    public Pet(int id, String name, String birthday, String gender) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        usedServices = new ArrayList<>();
        useList = new ArrayList<>();
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void inputPet() {
        System.out.println("Input Pet: ");
        while (true) {
            try {
                id = (int) Validation.inputNumber("Input id of Pet [1-100]: ", 1, 100);
                name = Validation.inputString("Input name of Pet: ", "^[aA-zZ ]+$");
                birthday = Validation.inputString("Input birthday of Pet: ", "^(?:0[1-9]|[12][0-9]|3[01])[-/.](?:0[1-9]|1[012])[-/.](?:19\\d{2}|20[01][0-9]|2020)$");
                gender = Validation.inputString("Gender of Pet [M/F]: ", "^[mM|fF]$");
                break;
            } catch (Exception er) {
                System.out.println("Input Pet again");
            }
        }
    }

    // ham nay de gan nhieu dich vu cho con pet
    public boolean addServiceToUse(Services service, int use) {
        if (usedServices.add(service) && useList.add(use) && service.addPetUseService(this)) return true;
        return false;
    }

    //xuat danh sach dich vu da duoc pet su dung
    public void displayServiceUsed() {
        if (usedServices.size() > 0) {
            System.out.println("Service Pet has used: ");
            for (int i = 0; i < usedServices.size(); i++) {
                System.out.println(usedServices.get(i));
                System.out.println("Use: " + useList.get(i));
            }
        } else System.out.println("Pet chua su dung dich vu");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
