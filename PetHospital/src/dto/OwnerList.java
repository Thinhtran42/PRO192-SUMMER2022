package dto;

import java.util.ArrayList;
import java.util.List;

public class OwnerList {
    private List<Owner> OwnerList;

    public OwnerList() {
        OwnerList = new ArrayList<>();
    }
    public boolean addOwnerToList(Owner o){
        return OwnerList.add(o);
    }
    public String findOwner(String id){
        for (int i = 0; i < OwnerList.size(); i++){
            if (OwnerList.get(i).getId().contains(id)){
                return id;
            }
        }
        return "not have";
    }
    public Owner searchOwner(String id){
        for (Owner o : OwnerList){
            if (o.getId().contains(id)) return o;
        }
        return null;
    }
    public void displayAllOwnerInList(){
        for (Owner o : OwnerList){
            System.out.println(o);
        }
    }
}
