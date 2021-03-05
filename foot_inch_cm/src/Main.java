public class Main {

    public static void main(String[] args) {

        //getting the input
        int[] lengths = Class1.input();

        //calculating the lengths
        double result = Class1.calculator(lengths);

        //printing the results
        Class1.printer(result, lengths[0], lengths[1]);
    }
}
