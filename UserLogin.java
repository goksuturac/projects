import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String system_user_name= "goxu";
        String system_user_password="123";
        int login_number=3;

        Scanner scanner=new Scanner(System.in);

        System.out.println("***************************");
        System.out.println("welcome to the login page");
        System.out.println("***************************");
        while (true){
            System.out.print("user name:");
            String user= scanner.nextLine();
            System.out.print("password:");
            String password= scanner.nextLine();
            if (system_user_name.equals(user)&& system_user_password.equals(password)){
                System.out.println("welcome to the page. have fun!");
            }
            else if (!system_user_name.equals(user)&& system_user_password.equals(password)){
                System.out.println("user name is wrong!");
                login_number-=1;
                System.out.println("you can try for "+login_number+"more time... ");
            }
            else if (system_user_name.equals(user)&& !system_user_password.equals(password)){
                System.out.println("your password is wrong!");
                login_number-=1;
                System.out.println("you can try for "+login_number+" more time...");
            }
            else {
                System.out.println("your user name and password are wrong...");
                login_number-=1;
                System.out.println("you can try for "+login_number+" more time...");
            }
            if (login_number==0){
                System.out.println("system blocked.");
                break;
            }


        }

    }
}
