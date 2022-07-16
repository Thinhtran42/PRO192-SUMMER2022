// Viet ham menu

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        //khoi tao bien
        Point A = null;
        Point B = null;
        int choice = 0;

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("   ");
            System.out.println("----------------MENU-------------------");
            System.out.println("1. Sinh vien");
            System.out.println("2. Point");
            System.out.println("3. Phan so");
            System.out.println("Lua chon khac : Thoat chuong trinh ! ");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Case 1 se nhap du lieu 2 diem vao

                    System.out.println("Nhap vao diem A : ");
                    A = new Point();
                    A.input();

                    System.out.println("Nhap vao diem B : ");
                    B = new Point();
                    B.input();

                    break;
                case 2: // case 2 se xuat 2 diem ra man hinh neu 2 bien A B khong null
                    if (A != null) {
                        System.out.println("Diem A: ");
                        A.output();
                    }
                    if (B != null) {
                        System.out.println("Diem B: ");
                        B.output();
                    } else {
                        System.out.println("Chuong trinh bi crash ....");
                    }
                    break;
                case 3:
                    if (A != null && B != null) {
                        double kc = A.getDistance(B);
                        System.out.println("Khoang cach cua 2 diem A, B : " + kc);
                    } else {
                        System.out.println("Crash .... ");
                    }
                    break;
                default:
                    System.out.println("Da thoat chuong trinh ! ");
                    break;

            }

        } while (choice <= 3);
    }
}