package gui;

import dto.Task;
import dto.TaskList;
import lib.Inputter;

import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Task task;
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("===============MENU=================");
            System.out.println("1. Add Task");
            System.out.println("2. Find Task");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Display all");
            System.out.println("Thoat chuong trinh");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap Task: ");
                    task = new Task();
                    Task taskToAdd = task.input();
                    taskList.addTask(taskToAdd);
                    break;
                case 2:
                    if (taskList.getCount() != 0) {
                        System.out.print("Nhap id can tim: ");
                        int id = sc.nextInt();
                        Task taskFinded = taskList.findTask(id);
                        System.out.println(taskFinded);
                    } else System.out.println("no data");
                    break;
                case 3:
                    System.out.println("Nhap id task can update: ");
                    int id = sc.nextInt();
                    taskList.updateTask(id);
                    break;
                case 4:
                    if (taskList.getCount() != 0){
                        System.out.println("Nhap id de xoa: ");
                        int idToRemove = sc.nextInt();
                        taskList.removeTask(idToRemove);
                    } else System.out.println("no data");
                    break;
                case 5:
                    if (taskList.getCount() != 0) {
                        System.out.println("All Task have inputed");
                        taskList.displayAll();
                    } else
                        System.out.println("no data");
                    break;
            }
        } while (choice <= 5);

        System.out.println("done");
    }


}
