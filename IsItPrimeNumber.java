import java.util.Scanner;

public class IsItPrimeNumber {
    public static boolean IsItPrimeNumber(int number){
        int i=1;
        for (; i<number;i++){
            if ((number&i)==0){
                System.out.println("It is not a prime number.");
                break;
            }else
                System.out.println("It is a prime number.");
            break;
        }return true;

    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter a number that you want to find it is prime number or not: ");
        int number= scanner.nextInt();
        IsItPrimeNumber(number);
    }
}
