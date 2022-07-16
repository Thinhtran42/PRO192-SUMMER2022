package gui;

import dto.*;

import java.util.Scanner;

public class HealthCare {
    public static void main(String[] args) {
        Owner owner = new Owner();
        OwnerList OwnerList = new OwnerList();
        ServicesList servicesList = new ServicesList();

        int choice;
        do {
            System.out.println("1. Them 1 Owner");
            System.out.println("2. Them Pet cho Owner quan ly");
            System.out.println("3. Them 1 Service vao danh sach cua benh vien");
            System.out.println("4. Xuat cac dich vu dang co");
            System.out.println("5. Them dich vu ma pet su dung");
            System.out.println("6. Xuat danh sach cac pet cua owner va cac dich vu pet su dung");

            System.out.println("Nhập lựa chọn khác..");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    owner = new Owner();
                    owner.inputOwner();
                    if (OwnerList.addOwnerToList(owner)) System.out.println("added");
                    else System.out.println("No add");
                    break;
                case 2:
                    Pet pet = new Pet();
                    pet.inputPet();
                    if (owner.addPet(pet)) System.out.println("added");
                    else System.out.println("no add");
                    break;
                case 3:
                    Services service = new Services();
                    service.inputService();
                    if (servicesList.addServicesToList(service)) System.out.println("added");
                    else System.out.println("no add");
                    break;
                case 4:
                    servicesList.displayAllServiceInList();
                    break;
                case 5:
                    owner.viewPetList();
                    servicesList.displayAllServiceInList();
                    System.out.println("User nhap id service ma pet su dung");
                    int serId = sc.nextInt();
                    Services ser = servicesList.searchService(serId);
                    System.out.println("User nhap id Pet su dung service");
                    int petId = sc.nextInt();
                    Pet p = owner.findPetById(petId);

                    if (ser != null && p != null){
                        int use;
                        System.out.println("User nhap so lan su dung dich vu: ");
                        use = sc.nextInt();
                        p.addServiceToUse(ser, use);
                        System.out.println("added");
                    } else System.out.println("not found");
                    break;
                case 6:
                    owner.viewPetsWithServices();
                    break;
            }

        } while (choice <= 6);
    }
}