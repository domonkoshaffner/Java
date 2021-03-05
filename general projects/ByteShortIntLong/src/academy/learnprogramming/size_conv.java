package academy.learnprogramming;
import java.util.Random;

public class size_conv {

    // Generating random year

    public static int random_year(){

        Random rand = new Random();
        int year = 10000;
        int counter = 0;

        while (year > 9999 || year < 1) {

            counter += 1;
            year = rand.nextInt();
        }

        System.out.println("The number of false tries of generating year: " + counter);
        return year;
    }

    // Calculations

    public static void is_leap_year(int year){

        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println(year + " is a leap year!");
                    return;
                }
            }
        }

        System.out.println(year + " is not a leap year.");
        return;

    }


}

