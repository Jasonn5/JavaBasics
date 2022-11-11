import java.util.Scanner;
public class HighschoolTrainee4 {
    public static void main(String[] args){
        int StudentAge = 22;
        double Prom = 8.5;
        String StudentName = "Jeyson Erik";
        String LastName = "Valdivia Bernal";
        char FirstInitial = 'J';
        char LastInitial = 'V';
        boolean Attendance = true;

        System.out.println ("The Student Age is " + StudentAge) ;
        System.out.println ("The Prom is " + Prom);
        System.out.println ("The StudentName is " + StudentName);
        System.out.println ("The LastName is " + LastName);
        System.out.println ("The First Initial is " + FirstInitial);
        System.out. println ("The last Initial is "+ LastInitial) ;
        System.out.println ("The attendance is " + Attendance) ;

        System.out.println("Enter the new prom :");

        Scanner input = new Scanner(System.in);
        Prom = input.nextDouble();


        System.out.println("Enter the new last Name :");

        Scanner input2 = new Scanner(System.in);
        LastName = input2.nextLine();

        System.out.println("The new prom are " + Prom);
        System.out.println("The new last name is " + LastName);
    }
}
