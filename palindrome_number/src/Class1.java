public class Class1 {

    // Function for summing up the digits in a number

    public static void palindrome(int j) {

        //transforming the number to a string
        String num = String.valueOf(j);

        //getting the length of the string for the iteration
        int len_it= num.length();

        //iterating through all the values
        for(int i=0; i <= len_it/2; i++){

            //getting the numbers from the string
            char start = num.charAt(i);
            char end = num.charAt(len_it-1-i);

            //iterating through the numbers
            if (start != end){
                System.out.println(j + " is not a palindrome number.");
                return;
            }
        }

        System.out.println(j + " is a palindrome number!");

    }
}

//getting the numbers from the chars
//char digit_char = num.charAt(i);

//char to int
//int digit_num = Character.getNumericValue(digit_char);
