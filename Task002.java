import java.util.Scanner;


public class Task002 {
    public static void main(String[] args){
        System.out.println("Adding two numbers!");
        Scanner input = new java.util.Scanner(System.in);
        System.out.print("Type the first number: ");
        int numberOne = input.nextInt();
        System.out.print("Type the second number: ");
        int numberTwo = input.nextInt();
        input.close();
        int sum = numberOne + numberTwo;
        System.out.println(numberOne + " + " + numberTwo + " = " + sum);
    }    
}
