import java.util.Scanner;


public class Task004 {
    public static void main(String[] args) {
        System.out.println("Student's Average with two notes!");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first note: ");
        float firstNote = input.nextFloat();
        
        System.out.print("Enter the second note: ");
        float secondNote = input.nextFloat();
        
        float studentAverage = (firstNote+secondNote)/2;
        System.out.println(String.format("The student's average is %.1f!", studentAverage));

        input.close();
    }
}
