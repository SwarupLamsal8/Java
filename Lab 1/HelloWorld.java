package Lab1;

import Lab2.*;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        JavaVariable javaVariable = new JavaVariable();
        javaVariable.areaOfRectangle(5.5d,2.3d);
        LabTwo labTwo = new LabTwo();
        System.out.println(labTwo.labTest());
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        int factorialValue = labTwo.calFactorial(5);
        System.out.println("Factorial value" + factorialValue);
        labTwo.printSeries(10);
    }
}
