import java.util.Scanner;

public class Part2_2 {
    public String inputString(String msg) throws Exception{
        String pattern = "^(SE|se|Se)[0-9]+$";
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        str = sc.nextLine();

        if(!str.matches(pattern))
            throw new Exception();

        return str;
    }

    public static void main(String[] args) {
        Part2_2 obj = new Part2_2();
        while (true){
            try {
                String str = obj.inputString("Input the string: ");
                System.out.println("The String is " + str);
                break;
            } catch (Exception e){
                System.out.println("The String is invalid !");
            }
        }
    }
}
