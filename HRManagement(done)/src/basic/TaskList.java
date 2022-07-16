package basic;

import java.util.Arrays;

public class TaskList {
    private Task[] list = null;
    private int count;
    final private int MAX = 4;

    public TaskList() {
        list = new Task[MAX];
        count = 0;
    }

    public TaskList(Task[] list, int count) {
        this.list = list;
        this.count = count;
    }

    public Task[] getList() {
        return list;
    }

    public void setList(Task[] list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // Add Task
    public boolean addTask(Task task) {
        if (count < MAX) {
            list[count] = task;
            count++;
            return true;
        }
        return false;
    }

    // find
//    public int findTask(int id) {
//        for (int i = 0; i < count; i++) {
//            if (list[i].getId() == id) {
//                return i;
//            }
//        }
//        return -1;
//    }
    //find tra ve dia chi object
    public Task findTask(int id){
        for (int i = 0; i < count; i++){
            if (list[i].getId() == id){
                return list[i];
            }
        }
        return null;
    }

    // update Task
    public boolean updateTask(int id) {
        Task rs = this.findTask(id);
        if (rs != null){
            rs.input();
            return true;
        }
        return false;
    }

    // remove/ delete
    public boolean removeTask(int id){
        Task viTri = findTask(id);
        if (viTri != null){
            for (int i = 0; i < count; i++){
                list[i] = list[i+1];
            }
            count--;
            return true;
        }
        return false;
    }

    public void displayAll() {
        for (int i = 0; i < count; i++){
            System.out.println(list[i]);
        }
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "list=" + Arrays.toString(list) +
                ", count=" + count +
                ", MAX=" + MAX +
                '}';
    }
}
