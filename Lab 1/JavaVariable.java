package labone;
/*
This class explain how the java variables are declare and initialize
 */
public class JavaVariable {

    public static void main(String[] args) {
        // Variable declarations consist of datatype and variable name
        int myAge; // int datatype and variable name myAge

        String myName; // String datatype

        boolean isTired; // boolean datatype

        // Variable with initial value
        int mySize, numShoes = 50;

        // declare multiple variable name with same type
        String firstName, lastName;

        // Assign value to the variable
        firstName = "Raja Ram ";
        lastName = "Pakur";

        // String concatenation
        String fullName = firstName.concat(lastName);

        System.out.println("Firstname : " + fullName);

        int x = 5, y =6;
        // Addition of int variable type
        System.out.println("Addition of x and y : " + (x+y));

        // Assign one variable value to another
        y = x;
        System.out.println("After assing x value to y: " + (y+x));

        // Descriptive variable name - GOOD
        int minutesPerHour = 60;

        // Short variable name - OK but not so easy to understand
        int m = 60;

        //Real Example
        String studentName = "Rajan Kshedal";
        int studentId = 44;
        int studentAge = 23;
        String studentAddress = "KTM";

        //Area of rectangle
        double length= 4.5;
        double width = 10.2;
        JavaVariable javaVariable = new JavaVariable();
        double area = javaVariable.areaOfRectangle(length, width);
        System.out.println("Area of the rectangle: " + area);






    }

    double areaOfRectangle(double length, double width){
        return length*width;
    }
}
