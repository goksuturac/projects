import java.util.Scanner;

public class FindTheBDN {
    public static int FindBDN(int numberOne, int numberTwo){
        int BDN=1;
        for (int i=1;i<=numberOne && i<=numberTwo;i++){
            if ((numberOne %i == 0) && (numberTwo %i ==0)){
                BDN=i;
            }
        }return BDN;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a first number to find BDN ");
        int numberOne= scanner.nextInt();
        System.out.print("enter a second number to find BDN ");
        int numberTwo= scanner.nextInt();
        System.out.println("the BDN is "+  FindBDN(numberOne,numberTwo));

    }
}
