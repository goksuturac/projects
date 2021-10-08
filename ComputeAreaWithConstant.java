import java.util.Scanner;
public class ComputeAreaWithConstant {
    public static void main (String[]args){
        final double PI= 3.1415;
        Scanner input=new Scanner(System.in);
        System.out.println("enter a radius");
        double radius= input.nextDouble();
        double area= radius*radius*PI;
        System.out.println("the area for the circle of radius"+radius+": "+area);
    }
}
