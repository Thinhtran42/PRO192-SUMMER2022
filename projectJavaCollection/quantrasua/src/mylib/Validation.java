package mylib;

import java.util.Scanner;

public class Validation {
    public static double inputNumber(String msg, int min, int max) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        double number = Double.parseDouble(sc.nextLine());
        if (number < min || number > max) throw new Exception();
        return number;
    }
    public static String inputString(String msg, String pattern) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        String str = sc.nextLine() ;
        if (!str.matches(pattern))  throw new Exception();
        return str;
    }
}
