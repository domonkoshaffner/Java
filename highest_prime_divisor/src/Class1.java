public class Class1 {

    // Checking if the number is prime

    public static boolean isprime(int num2) {

        boolean flag = false;

        for(int i = 2; i <= num2 / 2; i++) {

            if (num2 % i == 0){
                flag = true;
                break;
            }
        }

        return flag;
    }

    // Method for iterating through the numbers and finding the highest prime number in the divisors

    public static void number(int num1) {

        if(num1 < 0){
            System.out.println("invalid number given.");
            return;
        }

        int diviser_prime = 0;

        for(int i = 2; i <= num1; i++){

            if(num1 % i == 0){
                if(!isprime(i)){
                    diviser_prime = i;
                }
            }
        }

        System.out.println("The highest prime divisor is: " + diviser_prime + ".");

    }
}

