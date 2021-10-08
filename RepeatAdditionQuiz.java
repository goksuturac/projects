import java.util.Scanner;
public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1= (int)(Math.random()*100);
        int number2= (int)(Math.random()*100);
        Scanner input= new Scanner(System.in);
        System.out.println("what is "+number1+" + "+number2);
        int answer= input.nextInt();
        while (number1+number2 !=answer){
            System.out.println("you are wrong! try again. what is "+number1+" + "+number2);
            answer= input.nextInt();
        }
        System.out.println("you are right");
    }
}
