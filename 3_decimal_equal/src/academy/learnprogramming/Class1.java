package academy.learnprogramming;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Class1 {

    // Scanning in two numbers

    public static double[] scnanning_num(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a double number!");
        double number1 = scanner.nextDouble();
        System.out.println("Please enter another double number!");
        double number2 = scanner.nextDouble();

        double res_vec[]  = new double[2];
        res_vec[0] = number1;
        res_vec[1] = number2;

        return res_vec;
    }

    // Comparing the two numbers

    public static void num_comp(double[] res_vec){

        DecimalFormat df = new DecimalFormat("#.000");

        String rounded_num1 = df.format(res_vec[0]);
        String rounded_num2 = df.format(res_vec[1]);

        if(rounded_num1.equals(rounded_num2)){
            System.out.println("The numbers equal by the first 3 decimals!");
        }
        else{
            System.out.println("The numbers do not equal by the first 3 decimals.");
        }

    }

}
