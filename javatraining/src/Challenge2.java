import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours do you work per week?");
        int hourPerWeek = input.nextInt();
        System.out.println("How much do you earn per hour?");
        int hourlyWage = input.nextInt();
        System.out.println("Your gross annual salary is: " + hourPerWeek*hourlyWage*52);
    }
}
