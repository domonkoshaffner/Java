import java.util.Scanner;

public class Class1 {

    public static void method1() {

        Scanner scanner = new Scanner(System.in);

        int current_min = 0;
        int current_max = 0;

        boolean first = true;

        while(true)
        {
            System.out.println("Enter a number:");
            boolean is_an_int = scanner.hasNextInt();

            if(is_an_int){

                int number = scanner.nextInt();

                if(first){
                    current_min = number;
                    current_max = number;
                    first = false;
                }

                if(number > current_max){
                    current_max = number;
                }

                if(number < current_min){
                    current_min = number;
                }
            }
            else {
                break;
            }

            scanner.nextLine();

        }

        System.out.println("min = " + current_min);
        System.out.println("max = " + current_max);

        scanner.close();
    }
}

