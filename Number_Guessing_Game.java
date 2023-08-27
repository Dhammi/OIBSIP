
import java.util.*;
public class Number_Guessing_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int user_count=0;
        int computer_count=0;
        int count=0;
        System.out.println("**************************");
        System.out.println("**** Guess The Number ****");
        System.out.println("**************************");
        System.out.println();

        while (count<5) {
            System.out.println("--------------------------------");
            int computer = (int) (Math.random() * 100);
            System.out.println("Enter the number between 1 to 99");
            int user = sc.nextInt();


            System.out.println("--------------------------------");
            if (computer == user) {
                System.out.println("Your guessing is right");
                user_count++;
            } else {
                System.out.println("Your Guessing is wrong");
                computer_count++;
            }
            count++;
        }
        System.out.println("***************************");
        System.out.println("          Your Score       ");
        System.out.println("Computer : "+computer_count);
        System.out.println("User : "+user_count);
        System.out.println("***************************");
        }
    }

