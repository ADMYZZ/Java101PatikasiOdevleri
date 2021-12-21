package KosulluIfadelerVeKodBloklari.UserLogin;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName = "patika", password = "java101", inputUserName, inputPassword, compare;

        System.out.print("Kullanıcı adınız : ");
        inputUserName = input.nextLine();
        System.out.print("Şifreniz : ");
        inputPassword = input.nextLine();

        if (inputUserName.equals(userName) && inputPassword.equals(password)){
            System.out.println("Başarılı giriş. Hoşgeldiniz");
        }
        else {
            boolean compareUserNames = inputUserName.equals(userName);
            boolean comparePasswords = inputPassword.equals(password);

            if (compareUserNames == false){System.out.println("Kullanıcı adı yanlış.");}
            if (comparePasswords == false){System.out.println("Kullanıcı şifresi yanlış.");}
            if ((comparePasswords || compareUserNames) == false){System.out.println("Girdiğiniz bilgiler yanlış lütfen kontrol ediniz.");}
                System.out.print("Bilgilerinizi güncellemek istermisiniz.\n E / H : ");
                compare = input.nextLine();
                switch (compare) {
                    case ("e"):
                    case ("E") :
                        System.out.print("Kullanıcı adınızı giriniz : ");
                        inputUserName = input.nextLine();
                        if (inputUserName.equals(userName)) {
                            System.out.print("Yeni şifrenizi giriniz : ");
                            inputPassword = input.nextLine();
                            password = inputPassword;
                        }else {
                            System.out.println("Böyle bir kullanıcı bulunmamaktadır.");
                        }
                        break;
                    case ("h"):
                    case ("H") :
                        System.out.println("İyi günler dileriz.");
                        break;
                    default:
                        System.out.println("Lütfen geçerli bir seçim yapınız.");
                }
        }
    }
}
