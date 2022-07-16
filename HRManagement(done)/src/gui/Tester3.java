package gui;

import basic.*;

import java.util.Scanner;

public class Tester3 {
    public static void main(String[] args) {
        int c = 0;
        Manager manager = new Manager();
        ManagerList managerList = new ManagerList();
        TaskList taskList = new TaskList();
        do {
            System.out.println("==============MENU===============");
            System.out.println("1. tao 1 manager");
            System.out.println("2. them 1 nhan vien cho manager quan li ");
            System.out.println("3. them 1 task vao ds task cua cty ");
            System.out.println("4. xuat ds cac du an dang co");
            System.out.println("5. gan du an cho nhan vien lam ");
            System.out.println("6. xuat danh sach nhan vien cua manager cung voi cac du an nhan vien lam");
            System.out.println("7. Xuat danh sach cac manager");
            System.out.println("nhap 1 so:");
            Scanner sc = new Scanner(System.in);
            c = sc.nextInt();

            switch (c) {
                case 1:
                    manager = new Manager();
                    manager.inputStaff();
                    if (managerList.addManager(manager)) System.out.println("added");
                    else System.out.println("no add");
                    break;
                case 2:
                    Staff s = new Staff();
                    s.inputStaff();
                    if (manager.addStaff(s)) System.out.println("added");
                    else System.out.println("no add");
                    break;
                case 3:
                    Task t = new Task();
                    t.input();
                    if (taskList.addTask(t)) System.out.println("added");
                    else System.out.println("no add");
                    break;
                case 4:
                    taskList.displayAll();
                    break;
                case 5:
                    manager.displayStaffList();
                    taskList.displayAll();
                    System.out.println("user nhap ma du an can gan: ");
                    int taskId = sc.nextInt();
                    Task task = taskList.findTask(taskId);
                    System.out.println("user nhap ma nhan vien de gan: ");
                    int staffId = sc.nextInt();
                    Staff staff = manager.findStaff(staffId);
                    if (task != null && staff != null) {
                        int hour;
                        System.out.println("user nhap so h lam du an: ");
                        hour = sc.nextInt();
                        staff.addTask(task, hour); // gan 1 du an dang co cho 1 nhan vien dang co // khong duoc gan nguoc lai
                        System.out.println("added");
                    } else System.out.println("not found");
                    break;
                case 6:
                    manager.displayStaffList();
                    break;
                case 7:
                    managerList.displayAllManager();
                    break;
            }

        } while (c <= 7);
    }
}
