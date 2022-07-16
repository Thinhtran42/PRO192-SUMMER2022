import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        Vocabulary vocab = new Vocabulary();
        do {
            System.out.println("1. Init vocab vocabulary");
            System.out.println("2. Display all in vocab vocabulary");
            System.out.println("3. Search word");
            System.out.println("4. Add word");
            System.out.println("5. Find max word");
            System.out.println("6. Find max group");
            System.out.println("7. Count word in Group");
            System.out.println("8. Delete word");

            System.out.println("Others choice...");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    vocab.init();
                    break;
                case 2:
                    vocab.displayAll();
                    break;
                case 3:
                    System.out.print("Input the word you want to search: ");
                    String w = sc.nextLine();
                    Boolean checked = vocab.searchWord(w);
                    System.out.println(checked);
                    break;
                case 4:
                    System.out.print("Input the word you want to add: ");
                    String word = sc.nextLine();
                    if (vocab.addWord(word)) System.out.println("Add new word with key is existed !");
                    else System.out.println("Add new word without key is existed");
                    break;
                case 5:
                    System.out.println("Max word: " + vocab.findMaxWord());
                    ;
                    break;
                case 6:
                    System.out.println(vocab.findMaxGroup());
                    break;
                case 7:
                    System.out.print("Input key (String): ");
                    String inputKey = sc.nextLine();
                    System.out.println("The group has key '" + inputKey + "': " + vocab.countWord(inputKey));
                    break;
                case 8:
                    System.out.print("Input word need remove: ");
                    String wordRemove = sc.nextLine();
                    if (vocab.deleteWord(wordRemove)) {
                        System.out.println("has deleted");
                    }
                    else System.out.println("can not delete");
                    break;
            }
        } while (choice <= 8);
    }
}