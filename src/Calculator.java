import  java.util.Scanner; //  import Scanner class


public class Calculator {
    public  static void main(String[] args){
        // careting Scanner object
        Scanner cal_input = new Scanner(System.in);//crating new Scanner the varable name is cal-input holds user input

        // Ask the user to input two number and ask teh user name
        System.out.println("Enter your name :");
        String name = cal_input.nextLine(); // ask the user name

        System.out.println("Enter the first number:");
        double num1 = cal_input.nextDouble();// ask the user the firstrt num

        System.out.println("Enter the second  number:");
        double num2 = cal_input.nextDouble();// ask the user the second num

        // then add the 2 num user provides
        double sum = num1 + num2;// sum of 2 num
        double avr = sum /2;// get average

        // print the result
        System.out.println("The sum of the two num is: " + sum);
        System.out.println("The avarge of teh two num is:" + avr);
    }
}
