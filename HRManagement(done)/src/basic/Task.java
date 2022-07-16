package basic;

import jdk.internal.util.xml.impl.Input;

import mylib.Validation;

import java.util.Arrays;

public class Task {
    private int Id;
    private String title;
    private int beginDate;
    private int endDate;
    private int totalHours;

    //cai dat quan he 1 du an duoc lam boi nhieu staff
    private Staff[] staffList;
    private int noStaff;
    final int MAX = 100;

    public Task() {
        Id = 0;
        title = "";
        staffList = new Staff[MAX];
        noStaff = 0;
    }


    public Task(int id, String title, int beginDate, int endDate, int totalHours) {
        Id = id;
        this.title = title;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.totalHours = totalHours;
        staffList = new Staff[MAX];
        noStaff = 0;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(int beginDate) {
        this.beginDate = beginDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public void input() {
        while (true) {
            try {
                Id = (int) Validation.inputNumber("Nhap vao id: ");
                title = Validation.inputString("Nhap title: ");
                beginDate = Validation.inputDateOrHour("Nhap ngay bat dau: ", 1, 31);
                endDate = Validation.inputDateOrHour("Nhap ngay ket thuc: ", 1, 31);
                totalHours = Validation.inputDateOrHour("Nhap tong thoi gian: ", 1, 24);
                break;
            } catch (Exception er) {
                System.out.println("Vui long nhap lai");
            }
        }
//        Task task = new Task(Id, title, beginDate, endDate, totalHours);
//        return task;
    }

    @Override
    public String toString() {
        return "Task{" +
                "Id=" + Id +
                ", title='" + title + '\'' + "}";
    }

    // ham nay de them 1 staff vao staff list
    public boolean addStaff(Staff s) {
        if (noStaff < MAX) {
            staffList[noStaff] = s;
            noStaff++;
            return true;
        }
        return false;
    }

    public void displayAllStaffs() {
        if (noStaff > 0) {
            System.out.println("THE TASK LIST: ");
            for (int i = 0; i < noStaff; i++) {
                staffList[i].outputStaff();
            }
        } else System.out.println("nobody is assigned");
    }
}
