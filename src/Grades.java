import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your grade?");
        int grade = scan.nextInt();

        switch (grade) {
            case 1 -> System.out.println("Very Good");
            case 2 -> System.out.println("Good");
            case 3 -> System.out.println("Satisfactory");
            case 4 -> System.out.println("Sufficient");
            case 5 -> System.out.println("Not Sufficient");
            default -> System.out.println("No Grade");
        }
    }
}
