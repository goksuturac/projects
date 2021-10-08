import java.util.Scanner;
public class ComputeAndInterpretBMI {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your weight in pounds");
        double weight= input.nextDouble();

        System.out.println("Enter your height in inches");
        double height= input.nextDouble();

        final double kilograms_per_pound=0.45359237;
        final double meters_per_inch=0.0254;

        double weightInKilograms= weight*kilograms_per_pound;
        double heightInMeters=height*meters_per_inch;
        double bmi=weightInKilograms/(heightInMeters*heightInMeters);

        System.out.println("Body Mass Index is "+bmi );
        if (bmi<18.5)
            System.out.println("underweight");
        else if (bmi<25)
            System.out.println("normal");
        else if (bmi<30)
            System.out.println("overweight");
        else
            System.out.println("obese");
    }
}
