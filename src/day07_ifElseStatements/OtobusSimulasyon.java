package day07_ifElseStatements;

import java.util.Scanner;

public class OtobusSimulasyon {
    public static void main(String[] args) {


        //Kullanıcının bakiyesini iste,
        //bilet türünü iste.
        //öğrenci ise bakiye-3,75 tl yap
        //tam ise bakiye-4,90 tl yap
        //

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen bakiyenizi giriniz");
        double bakiye = scan.nextDouble();


        System.out.println("lütfen bilet türünü giriniz");
        char bilet1 = scan.next().toUpperCase().charAt(0);


        if (bilet1 == 'T')
            if (bakiye >= 4.90)
            {
                System.out.println("tam bilet bastınız " + "kalan bakiye" + (bakiye - 4.90));
            } else {
                System.out.println("bakiyeniz yetersiz");}

                if (bilet1 == 'O')
                    if (bakiye >= 3.75) {
                        System.out.println("ogrenci bilet bastınız " + "kalan bakiye" + (bakiye - 3.75));
                    } else {
                        System.out.println("bakiyeniz yetersiz");
                    }
            }

    }

