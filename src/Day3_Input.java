
import java.util.Scanner;// i want to use the Scanner tool from the utility toolbox


public class Day3_Input {
    public static void main(String[] args) {
        Scanner new_input = new Scanner(System.in);

        System.out.println("What is Your name: ");
        String name = new_input.nextLine();// read a full line of text (until Enter is pressed)

        System.out.println("What is Your age:");
        int age = new_input.nextInt();//Reads only the next whole number

        System.out.println("What is Your GPA: ");
        double GPA = new_input.nextDouble();// Reads a decimal number

        System.out.println("Hey,"+ name +" You are " + age +" years old and your GPA is " + GPA );



    }
}