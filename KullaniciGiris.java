package Pratik7;
import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {
        String userName,passWord;
        char sifreCevap;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.print("Lütfen şifrenizi giriniz: ");
        passWord = input.nextLine();
        if (userName.equals("patika")) {
            if (passWord.equals("java123")) {
                System.out.println("Sisteme başarılı bir şekilde giriş yaptınız.");
            } else {
                System.out.println("Hatalı şifre girişi !!!");
                System.out.print("Şifrenizi sıfırlamak ister misiniz? E/H : ");
                sifreCevap = input.next().charAt(0);

                if (sifreCevap == 'E') {

                    System.out.print("Lütfen yeni şifrenizi giriniz: ");
                    String newPassword = input.next();

                    if (newPassword.equals(passWord) || newPassword.equals("dev")) {
                        System.out.print("Şifre oluşturulamadı");
                    } else {
                        System.out.print("Şifre oluşturuldu.");
                    }
                } else if (sifreCevap == 'H') {
                    System.out.print("Şifre oluşturma işlemi iptal edildi..");

                } else {
                    System.out.print("Lütfen geçerli bir parametre giriniz. E (Evet) veya H (Hayır) !!!");
                }
            }
        } else {
            System.out.println("Hatalı kullanıcı adı girişi !!!");
        }
    }
}

















