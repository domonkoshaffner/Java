import java.util.Scanner;

public class Class1 {

    // Method for calculating the minutes and seconds to hours, minutes, seconds

    public static void input(int minutes, int seconds) {

        // Exceptions

        if (minutes < 0 || seconds < 0){
            System.out.println("\nInvalid values given.");
            return;
        }


        // Calculations

        int sec_rem = seconds % 60;
        int new_mins = (seconds - sec_rem) / 60 + minutes;

        int min_rem = new_mins % 60;
        int hours = (new_mins - min_rem) / 60;


        // Transforming the results to strings

        String minutes_string = String.valueOf(min_rem);
        String seconds_string = String.valueOf(sec_rem);
        String hour_string = String.valueOf(hours);


        // Checking if they are < or >= than 10

        if (sec_rem < 10){
            seconds_string = "0" + seconds_string;
        }
        if (min_rem < 10){
            minutes_string = "0" + min_rem;
        }
        if (hours < 10){
            hour_string = "0" + hour_string;
        }


        // Printing out the results

        System.out.println("\nThe result is: " + hour_string+ "h " + minutes_string + "m " + seconds_string + "s");

    }


    // Method for calculating the seconds to hours, minutes, seconds

    public static void input(int seconds) {

        // Exceptions

        if (seconds < 0){
            System.out.println("Invalid values given.");
            return;
        }


        // Calculations

        int sec_rem = seconds % 60;
        int new_mins = (seconds - sec_rem) / 60;

        int min_rem = new_mins % 60;
        int hours = (new_mins - min_rem) / 60;


        // Transforming the results to strings

        String minutes_string = String.valueOf(min_rem);
        String seconds_string = String.valueOf(sec_rem);
        String hour_string = String.valueOf(hours);


        // Checking if they are < or >= than 10

        if (sec_rem < 10){
            seconds_string = "0" + seconds_string;
        }
        if (min_rem < 10){
            minutes_string = "0" + min_rem;
        }
        if (hours < 10){
            hour_string = "0" + hour_string;
        }


        // Printing out the results

        System.out.println("\nThe result is: " + hour_string+ "h " + minutes_string + "m " + seconds_string + "s");

    }


}
