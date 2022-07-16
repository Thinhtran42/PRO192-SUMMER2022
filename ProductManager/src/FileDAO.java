import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileDAO {
    public static ArrayList<Product> loadData(String fileName) throws Exception {
        // mo file
        FileReader f = new FileReader(fileName);
        BufferedReader bf = new BufferedReader(f);

        // doc file
        ArrayList<Product> list = new ArrayList<>();
        while(bf.ready()){
            String s = bf.readLine();
            //chuyen s thanh object
            String []arr = s.split("[,.]");
            if (arr.length==4){
                Product p = new Product(Integer.parseInt(arr[0].trim()),arr[1].trim(), Integer.parseInt(arr[2].trim()), arr[3].trim());
                list.add(p);
            }
        }

        // dong file
        f.close();
        bf.close();
        return list;
    }
}
