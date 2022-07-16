package lib;

import java.util.Scanner;

public class Inputter {
    public static Scanner sc = new Scanner(System.in);
    public static int inputInt(String msg, int min, int max){
        if (min > max){
            int t = min;
            min = max;
            max = t;
        }
        int data;
        do {
            System.out.println(msg);
            data = Integer.parseInt(sc.nextLine());
        } while (data < min || data > max);
        return data;
    }
    //get a string without condition
    public static String inputString(String msg){
        System.out.println(msg);
        String data = sc.nextLine();
        return data;
    }

    //get a non-blank string
    public static String inputNonBlankStr(String msg) {
        String data;
        do {
            System.out.println(msg);
            data = sc.nextLine().trim();
        } while (data.length() == 0);
        return data;
    }
    //get a String following a pattern
    public static String inputPattern(String msg, String pattern){
        String data;
        do {
            System.out.println(msg);
            data = sc.nextLine().trim();
        } while (!data.matches(pattern));
        return data;
    }


}
