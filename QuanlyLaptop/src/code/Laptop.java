package code;

import mylib.Validation;

public class Laptop {
    private int id;
    private String brandName;
    private CPU cpu;

    public Laptop() {
        id = 0;
        brandName = "";
        cpu = new CPU();
    }

    public Laptop(int id, String brandName, CPU cpu) {
        this.id = id;
        this.brandName = brandName;
        this.cpu = cpu;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public CPU getCpu() {
        return this.cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void inputLaptop() {
        cpu.input();
        while (true) {
            try {
                id = Validation.inputNumber("Nhap id: ");
                brandName = Validation.inputString("Nhap brand name: ", "^[a-zA-Z]+([a-zA-Z ]+)*$");
                break;
            } catch (Exception e) {
                System.out.println("Error, Input again");
            }
        }
    }

    public void outputLaptop() {
        System.out.println("Id: " + id);
        System.out.println("Brand name: " + brandName);
        cpu.output();
    }

}
