import java.util.Scanner;

public class FactorialWithMethod {
    public static void factorial(){
        Scanner scanner=new Scanner(System.in);
        int togetfactorial=1;
        System.out.println("enter a number to get factorial");
        int number= scanner.nextInt();

        while (number>0){
            togetfactorial*=number;
            number--;
        }
        System.out.println("factorial is "+togetfactorial);
    }
    public static void main(String[] args) {
        factorial();

    }
}
