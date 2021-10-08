import java.util.Scanner;
public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter your first city");
        String firstCity= input.nextLine();

        System.out.println("enter your second city");
        String secondCity= input.nextLine();

        if (firstCity.compareToIgnoreCase(secondCity)<0)
            System.out.println("cities in alphabetical order "+firstCity+","+secondCity);
        else
            System.out.println("cities in alphabetical order "+secondCity+","+firstCity);
    }
}
