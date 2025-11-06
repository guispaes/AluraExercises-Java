import java.util.Scanner;


public class Task001 {
    public static void main(String [] args){
        Scanner input = new java.util.Scanner(System.in);
        System.out.print("What's your name? ");
        String name = input.nextLine();
        input.close();
        System.out.println("Hello, " + name + "!");
        System.out.println("How are you felling today? "); 
    }
}
