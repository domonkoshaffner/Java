public class Class1 {

    // Prime number finder algorithm

    public static boolean is_prime(int i){

        if(i==1){
            return false;
        }

        for(int j=2; j<=i/2; j++){
            if(i%j == 0){
                return false;
            }
        }
        return true;
    }


    // Going through the range of (0:integer)
    // Checking all the prime numbers

    public static void all_prime_numbers(int i){

        for(int k=2; k<=i; k++){
            if (is_prime(k)){
                System.out.println(k + " is a prime number!");
            }
        }
    }
}
