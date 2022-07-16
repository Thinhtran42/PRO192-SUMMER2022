import java.util.InputMismatchException;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        while (true){
            try {
                int num;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number: ");
                num = sc.nextInt();
                if ( num < 1 ) throw new Exception();

                System.out.println("The number is " + num);
                break;
            } catch (Exception e){
                System.out.println("The number is invalid ");
            }
        }
    }
}