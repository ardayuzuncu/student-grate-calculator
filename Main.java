import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Midterm grade (0-100): ");
        double midterm = input.nextDouble();
        System.out.print("Final grade (0-100): ");
        double finalGrade = input.nextDouble();
        if (!Double.isFinite(midterm) || !Double.isFinite(finalGrade)
                || midterm < 0 || midterm > 100 || finalGrade < 0 || finalGrade > 100) {
            System.out.println("Invalid grade.");
        } else {
            double average = midterm * 0.4 + finalGrade * 0.6;
            System.out.printf("Average: %.2f%n", average);
            System.out.println(average >= 60 ? "PASS" : "FAIL");
        }
        input.close();
    }
}
