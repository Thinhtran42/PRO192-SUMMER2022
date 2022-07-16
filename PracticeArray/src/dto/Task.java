package dto;

import jdk.internal.util.xml.impl.Input;
import lib.Inputter;

public class Task {
    private int Id;
    private String title;
    private int beginDate;
    private int endDate;
    private int totalHours;

    public Task() {
    }

    public Task(int id, String title, int beginDate, int endDate, int totalHours) {
        Id = id;
        this.title = title;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.totalHours = totalHours;
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

    public Task input() {
        while (true) {
            try {
                Id = (int) Inputter.inputNumber("Nhap vao id: ");
                title = Inputter.inputString("Nhap title: ");
                beginDate = Inputter.inputDateOrHour("Nhap ngay bat dau: ", 1, 31);
                endDate = Inputter.inputDateOrHour("Nhap ngay ket thuc: ", 1, 31);
                totalHours = Inputter.inputDateOrHour("Nhap tong thoi gian: ", 1, 24);
                break;
            } catch (Exception er) {
                System.out.println("Vui long nhap lai");
            }
        }
        Task task = new Task(Id, title, beginDate, endDate, totalHours);
        return task;
    }

    @Override
    public String toString() {
        return "Task {" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", totalHours=" + totalHours +
                '}';
    }
}
