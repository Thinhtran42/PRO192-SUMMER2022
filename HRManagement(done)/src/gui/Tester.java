package gui;

import basic.Manager;
import basic.Staff;

public class Tester {
    public static void main(String[] args) {
        //Tao 1 Staff
        Staff x = new Staff();
        x.inputStaff();

        //Tao 1 Manager
        Manager y = new Manager();
        y.inputStaff();

        //Tao manager
        Staff z = new Manager();
        z.inputStaff();

    }
}
