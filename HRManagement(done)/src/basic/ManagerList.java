package basic;

import java.util.Arrays;

public class ManagerList {
    Manager[] managerList;
    int noManager;
    final int MAX = 10;

    public ManagerList() {
        managerList = new Manager[MAX];
        noManager = 0;
    }

    public ManagerList(Manager[] managerList, int noManager) {
        this.managerList = new Manager[MAX];
        this.noManager = noManager;
    }

    public boolean addManager(Manager manager) {
        if (noManager < MAX){
            managerList[noManager] = manager;
            noManager++;
            return true;
        }
        return false;
    }

    public void displayAllManager(){
        if (noManager > 0){
            System.out.println("List of Manager: ");
            for (int i = 0; i < noManager; i++){
                System.out.println(managerList[i]);
            }
        } else {
            System.out.println("NO data of List Manager");
        }
    }

    @Override
    public String toString() {
        return "ManagerList{" +
                "managerList=" + Arrays.toString(managerList) +
                ", noManager=" + noManager +
                ", MAX=" + MAX +
                '}';
    }
}
