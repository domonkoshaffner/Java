public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        //Car holden = new Car();

        porsche.setModel("911");

        System.out.printf("Model is " + porsche.getModel() + "\n");

        porsche.setModel("Carrera");

        System.out.printf("Model is " + porsche.getModel() + "\n");

    }
}
