import javax.swing.*;
import java.util.Scanner;
public class GuessNumberOneTime {
    public static void main(String[] args) {
        int number=(int)(Math.random()*101);

        Scanner input= new Scanner(System.in);

        System.out.println("make a guess between 0 ad 100");

        int guess=-1;
        while (number != guess){
            System.out.println("enter a guess");
        guess= input.nextInt();
        if (guess==number)
            System.out.println("are you a wizard?");
        else if (guess>number)
            System.out.println("your guess is too high");
        else
            System.out.println("your guess is too low");}
    }
}
