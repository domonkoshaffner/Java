public class Class1 {

    public static void number(int num1) {

        String num_string = String.valueOf(num1);

        System.out.println("\nThe number is: " + num1 + ".\n");

        for (int i = 0; i < num_string.length(); i++){

            char character = num_string.charAt(i);
            int n_th_num = Character.getNumericValue(character);

            int index_num = i+1;

            switch (n_th_num){

                case 0:
                    printing(index_num, "zero");
                    break;
                case 1:
                    printing(index_num, "one");
                    break;
                case 2:
                    printing(index_num, "two");
                    break;
                case 3:
                    printing(index_num, "three");
                    break;
                case 4:
                    printing(index_num, "four");
                    break;
                case 5:
                    printing(index_num, "five");
                    break;
                case 6:
                    printing(index_num, "six");
                    break;
                case 7:
                    printing(index_num, "seven");
                    break;
                case 8:
                    printing(index_num, "eight");
                    break;
                case 9:
                    printing(index_num, "nine");
                    break;
            }
        }
    }

    public static void printing(int index_num, String num){

        System.out.println("The " + index_num + ". number is: " + num + ".");

    }

}

