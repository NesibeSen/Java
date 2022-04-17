package day15MethodCreation;

import java.util.Scanner;

public class DersCalisma {
    public static void main(String[] args) {

        System.out.println("Bir Sayı Giriniz");
        int binler, yuzler, onlar, birler;
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();

        binler = sayi / 1000;   // Binler Basamağı
        sayi = sayi - (1000 * binler);

        yuzler = sayi / 100;   // Yüzler Basamağı
        sayi = sayi - (100 * yuzler);

        onlar = sayi / 10;    // Onlar Basamağı
        sayi = sayi - (10 * onlar);

        birler = sayi;     // Birler Basamağı

        int rakamtopla = binler + yuzler + onlar + birler;

        System.out.println(rakamtopla);



       }


    }
