import java.util.Scanner;

public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, multiply and display the result
    If not, add them and display the results.
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        System.out.print("Please enter your First number:");
       double  num1 = read.nextDouble();
        System.out.print("Please enter your Second number:");
       double num2 = read.nextDouble();

        add(num1,num2);
        multiply(num1,num2);
    }

    public static void multiply(double num1,double num2){
        if (num1>num2){

            System.out.println(num1*num2);
        }
    }

    public static void add(double num1, double num2){
        if (num1<num2){

            System.out.println(num1+num2);
        }
}













}