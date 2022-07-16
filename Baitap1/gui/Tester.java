package gui;

import java.util.Scanner;

import src.CPU;
import src.Laptop;
import src.Student;

public class Tester {
    public static void main(String[] args) {
        int c = 0;
        Student a = null;
        Student b = null;
        Laptop lap = null;
        CPU cpu = null;

        do {
            System.out.println("1. Nhap thong tin chip (cpu) cua laptop sinh vien");
            System.out.println("2. Tao thong tin laptop sinh vien");
            System.out.println("3. Tao thong tin 2 sinh vien");
            System.out.println("4. Xac nhan nguoi yeu");
            System.out.println("5. Xuat hoa don thanh toan");
            System.out.println("Nhap lua chon");

            Scanner sc = new Scanner(System.in);
            c = sc.nextInt();

            switch (c) {
                case 1:
                    cpu = new CPU();
                    cpu.input();
                    System.out.println("Done");
                    break;
                case 2:
                    lap = new Laptop();
                    lap.inputLaptop();
                    System.out.println("Done");
                    break;
                case 3:
                    a = new Student();
                    b = new Student();
                    a.inputStudent();
                    b.inputStudent();
                    System.out.println("Done");
                    break;
                case 4:
                    System.out.println("1. La nguoi yeu");
                    System.out.println("2. Khong la nguoi yeu (ế)");
                    System.out.println("Nhap lua chon [1/2]");
                    int c2 = sc.nextInt();

                    switch (c2) {
                        case 1:
                            if (a != null & b != null) {
                                a.setIsNguoiYeu(true);
                                b.setIsNguoiYeu(true);
                            } else
                                System.out.println("No data");
                            break;

                        case 2:
                            if (a != null & b != null) {
                                a.setIsNguoiYeu(false);
                                b.setIsNguoiYeu(false);
                            } else
                                System.out.println("No data");
                            break;
                    }
                    System.out.println("Done");
                    break;
                case 5:
                    if (a != null & b != null) {
                        System.out.println("Trung tam phan phat nguoi yeu LOP CO VAN");
                        a.outputStudent();
                        b.outputStudent();
                    } else
                        System.out.println("no data");
                    System.out.println("Done");
                    break;

            }

        } while (c <= 5);
    }
}
