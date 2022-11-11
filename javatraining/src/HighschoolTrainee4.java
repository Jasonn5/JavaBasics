import java.util.Scanner;
public class HighschoolTrainee4 {
    public static void main(String[] args){
        int StudentAge = 22;
        double Prom = 8.5;
        char FirstInitial = 'J';
        char LastInitial = 'V';
        boolean Attendance = true;

        System.out.println ("The Student Age is " + StudentAge) ;
        System.out.println ("The Prom is " + Prom);
        System.out.println ("The First Initial is " + FirstInitial);
        System.out. println ("The last Initial is "+ LastInitial) ;
        System.out.println ("The attendance is " + Attendance) ;

        System.out.println("Enter the new prom :");

        Scanner input = new Scanner(System.in);
        Prom = input.nextDouble();

        System.out.println("The new prom are " + Prom);
    }
}
