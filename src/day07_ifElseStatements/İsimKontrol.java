package day07_ifElseStatements;

import java.util.Scanner;

public class İsimKontrol {
    public static void main(String[] args) {

        //kullanıcıdan isim iste
        //adı elif olanları davete kabul etme
        //diğerlerini edebilirsin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        String isim = scan.nextLine().toUpperCase();

        if (isim.equals("ELIF")) {
            System.out.println("üzgünüm davete katılamazsınız");
        } else {
            System.out.println("davete katılabilirsiniz");
        }
    }
}
