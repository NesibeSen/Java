package dersCalisma;

import java.util.Scanner;

public class MailAdresiİste {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen mail adresinizi giriniz");
        String mail=scan.nextLine();

        if (mail.contains("@gmail.com")) {
            System.out.println("mail adresiniz kaydedildi");
        }else{
            System.out.println("gecerli bir mail adresi giriniz");
        }
     }
}
