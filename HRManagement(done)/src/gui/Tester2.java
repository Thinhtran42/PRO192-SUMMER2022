package gui;

import basic.Manager;
import basic.Staff;
import mylib.Validation;

public class Tester2 {
    public static void main(String[] args) {
        int c = 0;
        Staff x = null;

        do {
            System.out.println("\n1. Tao Staff");
            System.out.println("2. Tao Manager");
            System.out.println("3. Xuat");
            try {
                c = (int) Validation.inputNumber("Input choice [1-3]", 1, 3);
            } catch (Exception er) {
                System.out.println("Error");
            }

            switch (c) {
                case 1:
                    x = new Staff();
                    x.inputStaff();
                    break;
                case 2:
                    x = new Manager();
                    x.inputStaff();
                    break;
                case 3:
                    if (x != null) {
                        System.out.println(x);
                    }
                    break;
            }
        } while (c <= 3);
    }

}



