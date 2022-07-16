package gui;

import dto.Item;
import dto.Painting;
import dto.Statue;
import dto.Vase;

import java.awt.*;
import java.util.Scanner;

public class AntiqueShop {
    public static void main(String[] args) {
        String[] options = {"Create a Vase", "Create a Statue", "Create a Painting", "Display the item"};
        Item item = null;
        int c = 0;
        do {
//            System.out.println("1.Create a Vase:");
//            System.out.println("2.Create a Statue:");
//            System.out.println("3.Create a Painting:");
//            System.out.println("4.Display the item:");
            c = Menu.getChoice(options);
            switch (c) {
                case 1:
                    item = new Vase();
                    ((Vase) item).inputVase();
                    System.out.println("done");
                    break;
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    System.out.println("done");
                    break;
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPainting();
                    System.out.println("done");
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase){
                            ((Vase)item).outputVase();
                        } else if (item instanceof Statue){
                            ((Statue)item).outputStatue();
                        } else if (item instanceof Painting){
                            ((Painting)item).outputPainting();
                        }
                    } else {
                        System.out.println("You need create an object");
                    }
                    break;

            }
        } while (c <= 4);

    }
}
