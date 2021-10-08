import java.util.Scanner;

public class CalculatorWithMethods {
    public static int addition(int a, int b){
        return (a+b);
    }
    public static int addition(int a, int b, int c){
        return(a+b+c);
    }
    public static int subtraction(int a, int b){
        return (a-b);
    }
    public static int multiply(int a, int b){
        return (a*b);
    }
    public static int multiply(int a, int b, int c){
        return (a*b*c);
    }
    public static double divide(int a, int b){
        return ((double) a/b);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
                String operations="1:addition for two integer\n" +
                "2:addition for three integer\n" +
                "3:subtraction\n" +
                "4:multiply for two integer\n" +
                "5:multiply for three integer\n" +
                "6:divide teo integer\n" +
                "7:finish the progress";
        System.out.println("*******************************");
        System.out.println(operations);
        System.out.println("*******************************");
        while (true){
            System.out.print("select your process: ");
            String process=scanner.nextLine();
            if (process.equals("1")){
                System.out.print("enter first integer to add");
                int numberOne= scanner.nextInt();
                System.out.print("enter second integer to add");
                int numberTwo=scanner.nextInt();
                scanner.nextLine();
                System.out.println("it equals to "+addition(numberOne,numberTwo));
            }else if (process.equals("2")){
                System.out.println("enter a first integer to add");
                int numberOne= scanner.nextInt();
                System.out.println("enter a second integer to add");
                int numberTwo= scanner.nextInt();
                System.out.println("enter a third integer to add");
                int numberThree= scanner.nextInt();
                scanner.nextLine();
                System.out.println("it equals to "+addition(numberOne,numberTwo,numberThree));
            }else if (process.equals("3")){
                System.out.println("enter an integer to subtraction");
                int numberOne= scanner.nextInt();
                System.out.println("enter an integer to subtraction");
                int numberTwo= scanner.nextInt();
                scanner.nextLine();
                System.out.println("it equals to "+subtraction(numberOne,numberTwo));
            }else if (process.equals("4")){
                System.out.println("enter first integer to multiply");
                int numberOne= scanner.nextInt();
                System.out.println("enter second integer to multiply");
                int numberTwo= scanner.nextInt();
                scanner.nextLine();
                System.out.println("it equals to "+multiply(numberOne,numberTwo));
            }else if (process.equals("5")){
                System.out.println("enter first integer to multiply");
                int numberOne= scanner.nextInt();
                System.out.println("enter second integer to multiply");
                int numberTwo= scanner.nextInt();
                System.out.println("enter third integer to multiply");
                int numberThree= scanner.nextInt();
                scanner.nextLine();
                System.out.println("it equals to "+ multiply(numberOne,numberTwo,numberThree));
            }else if (process.equals("6")){
                System.out.println("enter an integer to divide");
                int numberOne= scanner.nextInt();
                System.out.println("enter second integer to subtraction");
                int numberTwo= scanner.nextInt();
                scanner.nextLine();
                System.out.println("it equals to "+divide( numberOne, numberTwo));
            }else if (process.equals("7")){
                System.out.println("this is the end...");
                break;
            }else
                System.out.println("you entered a unable character...");
        }



    }
}
