package dersCalisma;

import java.util.Scanner;

public class StringManup02 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz");
        String cumle=scan.nextLine();
        System.out.println("lutfen bir kelime giriniz");
        String kelime= scan.next();


        System.out.println(cumle.indexOf(kelime) + "girilen kelime cumlede 1 kere kullanilmis");

        System.out.println(cumle.indexOf(kelime) + "girilen kelime cumlede 1 den fazla kullanilmis");

        System.out.println(cumle.indexOf(kelime) + "girilen kelime cumlede kullanilmamis");



    }
}
