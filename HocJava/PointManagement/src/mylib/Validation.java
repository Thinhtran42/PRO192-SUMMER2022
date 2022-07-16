package mylib;

import java.util.Scanner;

public class Validation {

    //input number
    public static double inputNumber(String msg) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        double number = Double.parseDouble(sc.nextLine());
        return number;
    }


}
