import java.util.Scanner;


public class Task002 {
    public static void main(String[] args){
        System.out.println("Adding two numbers!");
        Scanner input = new java.util.Scanner(System.in);
        System.out.print("Type the first number: ");
        Integer numberOne = input.nextInt();
        System.out.print("Type the second number: ");
        Integer numberTwo = input.nextInt();
        input.close();
        Integer sum = numberOne + numberTwo;
        System.out.println(numberOne + " + " + numberTwo + " = " + sum);
    }    
}
