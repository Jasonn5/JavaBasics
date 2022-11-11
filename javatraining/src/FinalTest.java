import java.util.Scanner;
public class FinalTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student's final grade: ");
        int finalGrade = input.nextInt();

        if(finalGrade >= 70){
            System.out.println("The student passed");
        }else{
            System.out.println("Student failed");
        }

    }
}
