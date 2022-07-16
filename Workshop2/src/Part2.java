import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        while (true) {
            try {
                String str = "";
                String pattern = "^(SE|se|Se)[0-9]+$";
                System.out.print("Enter the string: ");
                Scanner sc = new Scanner(System.in);
                str = sc.nextLine();

                if (!str.matches(pattern))
                    throw new Exception();

                System.out.println("The String is: " + str);
                break;
            } catch (Exception e){
                System.out.println("The String is invalid.");
            }
        }
    }
}
