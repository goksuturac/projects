import java.util.Scanner;
public class SentinelValue {
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);

        System.out.println("enter an integer (input ends if it is 0): ");
        int data= input.nextInt();

        int sum= 0;

        while (data!=0){
            sum +=data;

            System.out.println("enter an integer (input ends if it is 0): ");
            data=input.nextInt();
        }
        System.out.println("the sum is "+sum);
    }
}
