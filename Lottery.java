import java.util.Scanner;
public class Lottery {
    public static void main(String[]args){
        int lottery= (int)(Math.random()*100);

        Scanner input=new Scanner(System.in);
        System.out.println("enter your lottery pick two digits");
        int guess=input.nextInt();

        int lotteryDigit1=lottery/10;
        int lotteryDigit2=lottery%10;

        int guessDigit1=guess/10;
        int guessDigit2=guess%10;

        System.out.println("The lottery number is "+lottery);

        if (guess==lottery)
            System.out.println("Perfect match. You win 10,000 dollars");
        else if (guessDigit1==lotteryDigit1
                && guessDigit2==lotteryDigit2)
        System.out.println("match all digits. You win 3,000 dollars");
        else if (guessDigit1==lotteryDigit1
                ||guessDigit1==lotteryDigit2
                ||guessDigit2==lotteryDigit1
                ||guessDigit2==lotteryDigit2)
            System.out.println("match one digit. You win 1,000 dollars");
        else
            System.out.println("no match!");
    }
}
