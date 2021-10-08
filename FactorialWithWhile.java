import java.util.Scanner;

public class FactorialWithWhile {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter an integer");
        int number= input.nextInt();

        int factorial=1;

        while (number>0){
            factorial *=number;
            number--;
        }
        System.out.println("factorial= "+factorial);
    }
}
