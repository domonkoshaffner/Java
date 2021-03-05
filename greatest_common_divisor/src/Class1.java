public class Class1 {

    // Function for summing up the digits in a number

    public static void greatest_common_divisor(int num1, int num2) {

        if(num1 < 1 || num2 < 1){
            System.out.println("Invalid values given.");
            return;
        }

        int smaller_num = Math.min(num1, num2);
        int larger_num = Math.max(num1, num2);

        for(int i = smaller_num; i > 0; i--){

            if(smaller_num % i == 0){
                if(larger_num % i == 0){
                    System.out.println("The greatest common divisor of " + smaller_num + " and " + larger_num + " is: " + i);
                    return;
                }
            }
        }
    }
}

