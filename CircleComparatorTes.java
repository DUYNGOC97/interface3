package interface3;

import inheritance1.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTes {
    public static void main(String[] args) {
        Circle[] circle1 = new Circle[3];
        circle1[0] = new Circle(8.5,"green");
        circle1[1] = new Circle(5.2);
        circle1[2] = new Circle(5.2,"black");

        System.out.println("pre sorted ");
        for (Circle circle:circle1){
            System.out.println(circle);
        }
        Comparator circlec = new CircleComparator();
        Arrays.sort(circle1,circlec);
        System.out.println("after sorted ");
        for (Circle circle:circle1){
            System.out.println(circle);
        }
    }
}
