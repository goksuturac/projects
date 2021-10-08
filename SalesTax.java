import java.util.Scanner;
public class SalesTax {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter purchase amount");
        double purchaseAmount= input.nextDouble();
        double tax= purchaseAmount*0.18;
        System.out.println("Sale tax is "+tax);
    }
}
