package dto;

import mylib.Validation;

import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue(){

    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void inputStatue(){
        super.intput();
        while (true){
            try {
                weight = Validation.inputNumber("Input weight: ");
                colour = Validation.inputString("Input colour: ");
                break;
            } catch (Exception er){
                System.out.println("Please input the information of Statue again ");
            }
        }
    }
    public void outputStatue(){
        super.output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
}
