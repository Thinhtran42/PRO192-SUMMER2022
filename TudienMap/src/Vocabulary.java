import java.util.*;

public class Vocabulary {
    private Map<String, TreeSet<String>> table;

    public Vocabulary() {
        table = new HashMap<>();
    }

    public void init() {
        TreeSet<String> t1 = new TreeSet<>();
        t1.add("apple");
        t1.add("ant");
        table.put("a", t1);

        TreeSet<String> t2 = new TreeSet<>();
        t2.add("book");
        t2.add("but");
        table.put("b", t2);

        TreeSet<String> t3 = new TreeSet<>();
        t3.add("cook");
        t3.add("can");
        t3.add("could");
        table.put("c", t3);
    }

    //ham nay tim word trong table => true, false
    public boolean searchWord(String word) {
        String firstChar = word.substring(0, 1);
        if (!table.isEmpty() && table.get(firstChar).contains(word)) return true;
        return false;
    }

    public void displayAll() {
        if (!table.isEmpty()) {
            for (String key : table.keySet()) {
                System.out.print("'" + key + "' " + ": ");
                TreeSet<String> value = table.get(key);
                for (String word : value) {
                    System.out.print(word + " ");
                }
                System.out.println("\n");
            }
        } else System.out.println("Data not found");
    }

    //ham nay de add word vo table
    public boolean addWord(String word) {
        String firstChar = word.substring(0, 1);
        if (table.containsKey(firstChar)) {
            TreeSet<String> tmore = table.get(firstChar);
            tmore.add(word);
            displayAll();
            return true;
        } else {
            TreeSet<String> tMore = new TreeSet<>();
            tMore.add(word);
            table.put(firstChar, tMore);
            displayAll();
            return false;
        }
    }

    //ham nay de find max word trong table => tra ve String
    public String findMaxWord() {
        if (!table.isEmpty()) {
            for (String key : table.keySet()) {
                return Collections.max(table.get(key));
            }
        } else System.out.println("No word in Vocabulary");
        return null;
    }

    //ham nay de find max group => tra ve Treeset
    public TreeSet<String> findMaxGroup() {
        if (!table.isEmpty()) {
            TreeSet<String> maxGroup = table.get("a");
            for (String key : table.keySet()) {
                if (maxGroup.size() < table.get(key).size()) {
                    System.out.println(table.get(key).size());
                    maxGroup = table.get(key);
                }
            }
            return maxGroup;
        }
        return null;
    }

    //ham nay de count word trong group => tra ve int
    public int countWord(String key) {
        if (!table.isEmpty() && table.containsKey(key)) {
            return table.get(key).size();
        } else System.out.println("Data not found");
        return 0;
    }

    //ham nay de delete word
    public boolean deleteWord(String word) {
        String firstChar = word.trim().substring(0,1);
        if (searchWord(word)) {
            TreeSet<String> value = table.get(firstChar);
            value.remove(word);
            displayAll();
            return true;
        }
        return false;
    }

    //ham nay de doc file text da cho cat vao table
    public void loadData(String filename){

    }
}


















