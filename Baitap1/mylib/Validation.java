package mylib;

import java.util.Scanner;

public class Validation {
    public static int inputNumber(String msg) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        int number = Integer.parseInt(sc.nextLine());

        return number;
    }

    public static String inputString(String msg) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        String str = sc.nextLine();
        return str;
    }

    public static String inputString(String msg, String pattern) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        String str = sc.nextLine();

        if (!str.matches(pattern)) throw new Exception();

        return str;
    }


    public static boolean inputBoolean(String msg) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        boolean isTrueFalse = sc.nextBoolean();

        return isTrueFalse;
    }
}