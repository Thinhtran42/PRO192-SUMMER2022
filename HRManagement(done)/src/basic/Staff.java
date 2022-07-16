package basic;

import mylib.Validation;

import java.util.Arrays;

public class Staff extends Object {
    private int id;
    private String name;
    private String gender;
    private int basic;
    //cai dat quan he nhan vien lam nhieu du an
    private Task[] assignedTaskList;
    private int[] workingHour;
    private int noTask;
    final int MAX = 100;


    public Staff() {
        id = 0;
        name = "";
        gender = "";
        basic = 0;
        assignedTaskList = new Task[MAX];
        workingHour = new int[MAX];
        noTask = 0;
    }

    public Staff(int id, String name, String gender, int basic) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.basic = basic;
        this.assignedTaskList = new Task[MAX];
        workingHour = new int[MAX];
        this.noTask = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public void inputStaff() {
        while (true) {
            try {
                id = (int) Validation.inputNumber("Input id[1-100]: ", 1, 100);
                name = Validation.inputString("Input name: ", "^[a-zA-Z ]+$");
                gender = Validation.inputString("Input gender [F/M]: ", "^[FfMm]$");
                basic = (int) Validation.inputNumber("Input basis [1-1000] : ", 1, 1000);
                break;
            } catch (Exception er) {
                System.out.println("error");
            }
        }
    }

    public void outputStaff() {
        System.out.println(id + ", " + name + ", " + gender + ", " + basic);
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name.toUpperCase() + ", gender: " + gender.toUpperCase() + ", basic: " + basic + "$";
    }

    // ham nay de them 1 task vao assign staff list
    //input: t la du an staff lam, hour la so gio staff lam
    public boolean addTask(Task t, int hour) {
        if (noTask < MAX) {
            assignedTaskList[noTask] = t;
            workingHour[noTask] = hour; //mang song song
            noTask++;
            t.addStaff(this);
            return true;
        }
        return false;
    }

    public void displayTodoList() {
        if (noTask > 0) {
            for (int i = 0; i < noTask; i++) {
                System.out.println(assignedTaskList[i]);
                System.out.println("Working Hour: " + workingHour[i]);
            }
        } else System.out.println("no task");
    }
}
