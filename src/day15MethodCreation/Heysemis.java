package day15MethodCreation;

import java.util.Scanner;

public class Heysemis {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int sayi = klavye.nextInt();
        int rakam = 0;
        int rakamlarToplami = 0;

        basamakDegeri(sayi, rakamlarToplami, rakam);
        sifirdanKucuk(sayi);
        tekCift(sayi);

    }

    private static void tekCift(int sayi) {
        System.out.println(sayi % 2 == 0 ? "cift sayi" : "tek sayi");

    }

    private static void sifirdanKucuk(int sayi) {
        System.out.println(sayi < 0 ? "sıfırdan kucuk" : "sıfırdan buyuk");
    }

    private static void basamakDegeri(int sayi, int rakam, int rakamlarToplami) {

        if (sayi >= 100 && sayi <= 999) {
            rakam = sayi % 10;
            rakamlarToplami += rakam;
            sayi /= 10;
            rakam = sayi % 10;
            rakamlarToplami += rakam;
            sayi /= 10;
            rakam = sayi % 10;
            rakamlarToplami += rakam;
            sayi /= 10;
            System.out.println("basamak rakamları toplamı:" + rakamlarToplami);
        } else {
            System.out.println("birler basamagi:" + (sayi % 10));

        }

    }
}