import java.util.Scanner;

public class Class1 {

    public static void input(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first integer number!");
        int first_num = scanner.nextInt();
        System.out.println("\nPlease enter the second integer number!");
        int second_num = scanner.nextInt();
        System.out.println("\nPlease enter the third integer number!");
        int third_num = scanner.nextInt();

        if( first_num + second_num == third_num){
            System.out.println("\nThe first two numbers equal to the third one!");
        }
        else{
            System.out.println("\nThe first two numbers do not equal to the third one.");
        }

    }

}
