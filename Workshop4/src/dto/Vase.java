package dto;

import mylib.Validation;

import java.util.Scanner;

public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {

    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void inputVase(){
        super.intput();
        while (true){
            try {
                height = Validation.inputNumber("Input height: ");
                material = Validation.inputString("Input material: ");
                break;
            } catch (Exception er) {
                System.out.println("Please input height and material of the Vase again! ");
            }
        }
    }
    public void outputVase(){
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }


}
