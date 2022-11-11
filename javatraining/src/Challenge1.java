import java.util.Scanner;
public class Challenge1 {
    public static void main(String[] args) {
        boolean isIncorrect = true;
        while(isIncorrect){
            Scanner input = new Scanner(System.in);
            System.out.println("In what year was the first world cup?");
            System.out.println("A. 1930");
            System.out.println("B. 1950");
            System.out.println("C. 1938");
            char reply = input.next().charAt(0);
            if(reply == 'A'){
                System.out.println("Correct!!!!");
                isIncorrect = false;
            }else {
                System.out.println("Is incorrect, Try again");
            }
        }

    }
}
