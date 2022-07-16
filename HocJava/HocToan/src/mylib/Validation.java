package mylib;

import java.util.Scanner;

public class Validation {

    //Ham nay de nhap vao 1 so tu ban phim
    public static int inputNumber(String msg) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);

        int number = Integer.parseInt(sc.nextLine());
        return number;
    }

}
