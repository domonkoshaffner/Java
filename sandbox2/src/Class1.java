import java.util.Scanner;

public class Class1 {

    public static void method1() {

        System.out.println("Please enter 10 valid integer numbers!");

        int sum = 0;
        int cnt = 1;

        while(cnt < 11) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Number #" + cnt + ":");

            boolean is_int = scanner.hasNextInt();

            if(is_int) {
                int num = scanner.nextInt();
                scanner.nextLine();
                sum += num;
                cnt += 1;
            }
            else{
                System.out.println("Invalid value given. Please give a valid number!");
            }
        }

        System.out.println("The result is: " + sum);

    }
}

