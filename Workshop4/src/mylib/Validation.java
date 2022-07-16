package mylib;

import java.util.Scanner;

public class Validation {
    public static int inputNumber(String msg) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print(msg);
        int number = Integer.parseInt(sc.nextLine());
        if (number < 0) throw new Exception();

        return number;
    }

    public static boolean inputBoolean(String msg) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        boolean checked = sc.nextBoolean();
        return checked;
    }

    public static String inputString(String msg) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        String str = sc.nextLine();
        if (str.trim().length() == 0) throw new Exception();
        return str;
    }
}
