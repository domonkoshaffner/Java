import java.util.Scanner;

public class Class1 {

    // Getting the length inputs

    public static int[] input(){

        //creating scanner obj to get input
        Scanner scanner = new Scanner(System.in);

        //declaring the lengths
        int foot = -999;
        int inches = -999;

        //if the lengths are negative numbers, a new value must be given
        //getting the length in foot
        System.out.println("Please give the length in foot: ");
        while(foot < 0) {
            foot = scanner.nextInt();

            if (foot < 0) {
                System.out.println("Invalid value given. Please give a valid length!");
            }
        }

        //getting the length in inches
        System.out.println("Please give the length in inches: ");
        while (inches < 0){
            inches = scanner.nextInt();

            if (inches < 0) {
                System.out.println("Invalid value given. Please give a valid length!");
            }
        }

        //saving the results in a vector, so the method can return with it
        int[] lengths_vec = new int[2];
        lengths_vec[0] = foot;
        lengths_vec[1] = inches;

        return lengths_vec;
    }


    // Calculating the lengths in the metric system

    public static double calculator(int[] lengths_vec){

        double cm  = ((int) lengths_vec[0]*12 + (int) lengths_vec[1]) * 2.54d;
        return cm;
    }

    // Printing out the results

    public static void printer(double cm, int foot, int inches){

        if(inches == 0){
            System.out.println(foot + " foot = " + cm + " cm");
        }
        else{
            System.out.println(foot + " foot and " + inches + " inches = " + cm + " cm");
        }

    }

}
