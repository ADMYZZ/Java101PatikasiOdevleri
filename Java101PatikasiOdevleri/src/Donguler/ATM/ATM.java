package Donguler.ATM;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String userName, password;
        int right = 3, selection, balance = 1500, price;

        while(right >0) {

            System.out.print("Kullanıcı adınız : ");
            userName = input.nextLine();
            System.out.print("Şifreniz : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                    do {
                    System.out.println("""
                            1-Para yatırma
                            2-Para Çekme
                            3-Bakiye Sorgula
                            4-Çıkış Yap""");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    selection = input.nextInt();

                        switch (selection) {
                            case (1) -> {
                                System.out.println("-----------------------------------");
                                System.out.print("Yatırmak istediğiniz miktarı giriniz : ");
                                price = input.nextInt();
                                balance += price;
                                System.out.println("Bakiyeniz : " + balance);
                            }
                            case (2) -> {
                                System.out.println("-----------------------------------");
                                System.out.print("Çekmek istediğiniz miktarı giriniz : ");
                                price = input.nextInt();
                                if (balance < price) {
                                    System.out.println("-----------------------------------");
                                    System.out.println("Bakiye yetersiz.");
                                } else {
                                    balance -= price;
                                    System.out.println("-----------------------------------");
                                    System.out.println("Bakiyeniz : " + balance);
                                }
                            }
                            case (3) -> {
                                System.out.println("-----------------------------------");
                                System.out.println("Bakiyeniz : " + balance);
                            }
                            case (4) -> {
                                System.out.println("-----------------------------------");
                                System.out.println("Hoşçakalın.");
                            }
                            default -> {
                                System.out.println("-----------------------------------");
                                System.out.println("Tekrar seçim yapınız.");
                            }
                        }
                    }while (selection != 4);
                    break;
            }else {
                right--;
                if (right == 0) {
                    System.out.println("-----------------------------------");
                    System.out.println("Hesabınız bloke oldu. Lütfen müşteri hizmetleri ile iletişime geçiniz.");
                }else {
                    System.out.println("-----------------------------------");
                    System.out.println("Yanlış kullanıcı adı ve şifre. Kalan hakkınız : " + right);
                }
            }
        }
    }
}
