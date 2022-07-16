package dto;

import mylib.Validation;

import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;

    public Item(){

    }
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void intput(){

        while (true){
            try {
                value = Validation.inputNumber("Input value: ");
//                if (value < 0) throw new Exception();
                creator = Validation.inputString("Input the creator: ");
//                if ( creator.trim().length() == 0) throw new Exception();
                break;
            } catch (Exception er) {
                System.out.println("Input value, creator again, please !");
            }
        }

    }
    public void output(){
        System.out.println("The value: " + value);
        System.out.println("The creator: " + creator);
    }
}
