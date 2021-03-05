public class Class1 {

    // collects numbers which are both divisible by 3 and 5
    // sums up 3 of those numbers

    public static void sum_3_5(){

        int counter = 0;
        int sum = 0;

        for(int i=1; i <= 1000; i++){

            if(i%3 == 0 && i%5 == 0){
                sum += i;
                counter += 1;
            }

            if(counter == 3){
                System.out.println("The sum of the numbers is: " + sum);
                counter = 0;
                sum = 0;
            }
        }
    }
}
