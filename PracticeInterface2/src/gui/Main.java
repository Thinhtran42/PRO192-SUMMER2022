package gui;

import dto.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(30, "Macbook pro", 1000);
        System.out.println(laptop);
        laptop.onLaptop();
    }
}
