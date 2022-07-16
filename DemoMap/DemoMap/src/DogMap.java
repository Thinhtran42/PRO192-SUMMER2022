import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

// luu cac con dog vao HashMap
//cot key la id cua dog, vi key id khong trung va tim kiem dua vao id
//value chua dia chi cua con cho
public class DogMap {
    private HashMap<Integer, Dog> h;

    public DogMap(){
        h = new HashMap<>();
    }
    //ham nay de them 1 chu cho vao bang h
    public boolean addDog(Dog dog){
        if (h.put(dog.getId(),dog) != null) return true;
        return false;
    }
    //ham nay de xuat HashMap, ca cot key va value
    public void displayAll(){
//        Set<Integer> cotKey = h.keySet();
//        for (Integer id : cotKey){
//            System.out.print(id + "-->");
//            System.out.println(h.get(id)); //get tra ve value object trong map
//        }


        Collection<Dog> result = h.values();
        for (Dog d : result) System.out.println(d);
    }

    //ham nay de tim dog dua vao id
    public Dog findDog(int id){
        return h.get(id);
    }
    // ham nay de lam cay to
    public void killDog(int id){
        h.remove(id);
    }

}
