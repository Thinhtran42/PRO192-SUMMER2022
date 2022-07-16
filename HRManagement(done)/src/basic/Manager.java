package basic;

import mylib.Validation;

public class Manager extends Staff {
    private int bonus;

    //quan he 1- nhieu
    private Staff[] staffList;
    private int noStaff;
    final int MAX = 100;


    public Manager() {
        super();
        bonus = 0;
        staffList = new Staff[MAX];
        noStaff = 0;
    }

    public Manager(int id, String name, String gender, int basic, int bonus) {
        super(id, name, gender, basic);
        this.bonus = bonus;
        staffList= new Staff[MAX];
        noStaff = 0;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void inputStaff() {
        super.inputStaff();
        while (true) {
            try {
                bonus = (int) Validation.inputNumber("Input bonus [1-20]", 1, 20);
                break;
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

    @Override
    public void outputStaff() {
        super.outputStaff();
        System.out.println(", " + bonus);
    }

    @Override
    public String toString() {
        return super.toString() + " ,bonus: " + bonus + "$";
    }

    //ham nay de them 1 staff vao mang staffList
    public boolean addStaff(Staff staff) {
        if (noStaff < MAX) {
            staffList[noStaff] = staff;
            noStaff++;
            return true;
        }
        return false;
    }

    //ham nay de xuat ds cac staff duoc manager quan ly
    public void displayStaffList() {
        if (noStaff > 0) {
            System.out.println("THE STAFF LIST : ");
            for (int i = 0; i < noStaff; i++) {
                staffList[i].outputStaff();
                System.out.println("TODO List: ");
                staffList[i].displayTodoList();
            }
        } else System.out.println("THE STAFF LIST IS EMPTY");
    }

    //ham nay tim staff dua vao id
    public Staff findStaff(int id) {
        for (int i = 0; i < noStaff; i++) {
            if (staffList[i].getId() == id) {
                return staffList[i];
            }
        }
        return null;
    }
}
