public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.setFirst_value(5.2);
        calculator.setSecond_value(3.2);

        System.out.printf("The first value is " + calculator.getFirst_value() + "\n");
        System.out.printf("The second value is " + calculator.getSecond_value() + "\n");

        System.out.printf("Addition: " + calculator.getAddition() + "\n");
        System.out.printf("Subtraction: " + calculator.getSubtraction() + "\n");
        System.out.printf("Multiplication: " + calculator.getMultiplication() + "\n");
        System.out.printf("Division: " + calculator.getDivision() + "\n");

    }
}
