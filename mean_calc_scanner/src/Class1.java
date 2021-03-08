import java.util.Scanner;

public class Class1 {

    public static void method1() {

        Scanner scanner = new Scanner(System.in);

        double sum_value = 0.0;
        int num_of_values = 0;
        double mean_of_values = 0.0;

        while(true){

            System.out.println("Enter a number!");

            boolean is_an_int = scanner.hasNextInt();

            if(is_an_int){

                int number = scanner.nextInt();

                sum_value += number;
                num_of_values += 1;

                mean_of_values = sum_value / num_of_values;
            }

            else{

                System.out.println("The values add up to: " + (int)sum_value);
                System.out.println("The mean of the values is: " + mean_of_values);

                break;
            }

        }

        scanner.close();
    }
}





