import java.util.Scanner;

public class Class1 {

    public static void method1(double height, double width, double area_buckets) {

        double area = height*width;

        int buckets_needed = (int) Math.ceil(area / area_buckets);

        System.out.println("Bob needs " + buckets_needed + " buckets of paint for the wall.");

    }
}





