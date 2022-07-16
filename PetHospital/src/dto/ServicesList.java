package dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ServicesList {
    private List<Services> ServicesList;

    public ServicesList() {
        ServicesList = new ArrayList<>();
    }

    public boolean addServicesToList(Services services){
        return ServicesList.add(services);
    }
    public int findService(int id){
        for (int i = 0; i < ServicesList.size(); i++){
            if (ServicesList.get(i).getId() == id){
                return id;
            }
        }
        return -1;
    }
    public Services searchService(int id){
        for (int i = 0; i < ServicesList.size(); i++){
            if (ServicesList.get(i).getId() == id){
                return ServicesList.get(i);
            }
        }
        return null;
    }
//    public boolean sortById(int id){
//        Collections.sort(ServicesList);
//    }

    public void displayAllServiceInList(){
        System.out.println("All Services in list: ");
        for (Services s : ServicesList){
            System.out.println(s);
        }
    }
}
