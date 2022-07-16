package mylib;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Validation {
    // ham nay de nhap 1 so tu ban phim
    // tra ve so da nhap
    //dieu kien kiem tra: so nhap >= min va <= max
    public static double inputNumber(String msg, double min, double max) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(msg);
        double number = sc.nextDouble();
        if (number < min || number > max) throw new Exception();
        return number;
    }

//    public static double inputNumber(String msg) throws Exception {
//        Scanner sc = new Scanner(System.in);
//
//        double number = Double.parseDouble(sc.nextLine());
//        System.out.println(msg);
//        return number;
//    }


    //ham nay de nhap 1 chuoi tu ban phim
    //tra ve chuoi da nhap
    //dieu kien validate: tuy vao noi su dung

    public static String inputString(String msg, String pattern) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        String str = sc.nextLine();
        if (!str.matches(pattern)) throw new Exception();

        return str;
    }

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
        System.out.print(msg);
        int date = sc.nextInt();
        if (date > max || date < min) throw new Exception();

        return date;
    }

}
