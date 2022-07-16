package lib;

import java.util.Scanner;

public class Inputter {
    public static double inputNumber(String msg) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        double number = Double.parseDouble(sc.nextLine());
        if(number < 0) throw new Exception();
        return number;
    }

    public static String inputString(String msg) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        String str = sc.nextLine();
        if (str.trim().isEmpty()) throw new Exception();

        return str;
    }

    public static int inputDateOrHour(String msg, int min, int max) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("msg");
        int date = sc.nextInt();
        if (date > max || date < min) throw new Exception();

        return date;
    }
}
