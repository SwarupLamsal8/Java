package Lab1;

import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {


        /*
        Arrays are used to store multiple values in a single variable,
        instead of declaring separate variables for each value.
         */
        // To declare array, define variable type with square brackets
        String[] cars;

        // To insert value
        String[] carBrands = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("Car brands: " + Arrays.toString(carBrands));
        // To Access element
        System.out.println("Access first car brand: " + carBrands[0]);
        // To change an Array element
        carBrands[0] = "Mercedes";
        System.out.println("Access first car brand: " + carBrands[0]);

        // Loop through an Array
        // using for loop
        for (int i = 0; i < carBrands.length; i++) {
            System.out.println(carBrands[i]);
        }
        System.out.println("Using for each: ");
        // using for-each
        for(String brand: carBrands){
            System.out.println(brand);
        }

        // Example
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;
        // Get the length of the array
        int length = ages.length;
        // Loop through the elements of the array
        for (int age : ages) {
            sum += age;
        }
        // Calculate the average by dividing the sum by the length
        avg = sum / length;
        System.out.println("The average age is: " + avg);


    }
}
