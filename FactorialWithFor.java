import java.util.Scanner;
public class FactorialWithFor {
    public static void main(String[] args) {

        int factorial=1;
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");

        int number= input.nextInt();

        for(int i=1; i<=number; i++){
            factorial *=i;
        }
        System.out.println("your number's factorial is "+ factorial);

    }
}
