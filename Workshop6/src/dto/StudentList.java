package dto;

import lib.Inputter;

import java.util.ArrayList;

public class StudentList extends ArrayList<Student> {
    public StudentList() {
        super();
    }

    //Search Student based on student's code. Return the student found
    //This method supports preventing code duplications
    public Student search(String code) {
        code = code.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equals(code)) return this.get(i); // found
        }

        return null; // not found
    }

    //checking whether a code is duplicate or not
    public boolean isCodeDupplicated(String code) {
        code = code.trim().toUpperCase();
        return search(code) != null;
    }

    public void addStudent() {
        String newCode, newName;
        int newMark;
        boolean codeDupplicated = false;
        do {
            newCode = Inputter.inputPattern("St. code s000", "[sS][\\d]{3}");
            newCode = newCode.trim().toUpperCase();
            codeDupplicated = isCodeDupplicated(newCode);
            if (codeDupplicated) {
                System.out.println("Code is dupplicated");
            }
        } while (codeDupplicated == true);
        newName = Inputter.inputNonBlankStr("Name of new Student: ");
        newName = newName.toUpperCase();

        newMark = Inputter.inputInt("Mark: ", 0, 10);
        // Create new Student
        Student student = new Student(newCode, newName, newMark);
        this.add(student);
        System.out.println("Student " + newCode + " has been added");
    }
    //Search student based on inputted code
    public void searchStudent() {
        if (this.isEmpty())
            System.out.println("Empty list. No search can be performed!");
        else {
            String sCode = Inputter.inputString("Input code for search: ");
            Student st = this.search(sCode);
            if (st == null)
                System.out.println("Student " + sCode + " doesn't existed!");
            else System.out.println("Found: " + st);
        }
    }
    //update name and mark based on student code
    public void updateStudent(){
        if (this.isEmpty())
            System.out.println("Empty list. No update can be performed!");
        else {
            String uCode = Inputter.inputString("Input code of updated student: ");
            Student st = this.search(uCode); // search student
            if (st == null)
                System.out.println("Student " + uCode + " doesn't existed!");
            else {
                //Updated student's name
                String oldName = st.getName();
                String msg = "Old name: " + oldName + ", new name: ";
                String newName = Inputter.inputNonBlankStr(msg);
                st.setName(newName);

            }
        }
    }
}
