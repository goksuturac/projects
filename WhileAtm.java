import java.util.Scanner;

public class WhileAtm {
    public static void main(String[] args) {

        int bakiye = 1000;
        Scanner scanner = new Scanner(System.in);


        String islemler = "1.islem:bakiye sorgulama\n"
                + "2.islem:para çekme\n"
                + "3.islem:para yatırma\n"
                + "çıkış icin x'e bas";

        System.out.println("************************");
        System.out.println(islemler);
        System.out.println("************************");

        while (true){
            System.out.println("islemi seciniz:");
            String islem= scanner.nextLine();

            if (islem.equals("x")){
                System.out.println("çıkış yapılıyor...");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("bakiyeniz: "+bakiye);

            }
            else if (islem.equals("2")){
                System.out.print("çekmek istediğiniz tutar:");
                int tutar= scanner.nextInt();
                scanner.nextLine();
                if (bakiye-tutar <0){
                    System.out.println("bakiye yetersiz. bakiyeniz: "+bakiye);
                }
                else{
                    bakiye -= tutar;
                    System.out.println("kalan tutar: "+bakiye);
                }
            }
            else if (islem.equals("3")){
                System.out.print("yatırmak istediğiniz tutar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                bakiye +=tutar;
                System.out.println("yeni bakiyeniz: "+bakiye);

            }
            else{
                System.out.println("geçersiz işlem");
            }

        }

    }
}
