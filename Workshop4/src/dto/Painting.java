package dto;

import mylib.Validation;

import java.util.Scanner;

public class Painting extends Item {
    private int height;
    private int weight;
    private boolean isWaterColor;
    private boolean isFramed;

    public Painting(){

    }

    public Painting(int value, String creator, int height, int weight, boolean isWaterColor, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.weight = weight;
        this.isWaterColor = isWaterColor;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isWaterColor() {
        return isWaterColor;
    }

    public void setWaterColor(boolean waterColor) {
        isWaterColor = waterColor;
    }

    public boolean isFramed() {
        return isFramed;
    }

    public void setFramed(boolean framed) {
        isFramed = framed;
    }

    public void inputPainting(){
        super.intput();
        while (true){
            try {
                height = Validation.inputNumber("Input height: ");
                weight = Validation.inputNumber("Input weight: ");
                isWaterColor = Validation.inputBoolean("Is water color: ");
                isFramed = Validation.inputBoolean("Is framed: ");

                break;
            } catch (Exception er) {
                System.out.println("Please input information of Painting again! ");
            }
        }

    }
    public void outputPainting(){
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Is Water Color : " + isWaterColor);
        System.out.println("Is Framed: " + isFramed);
    }
}
