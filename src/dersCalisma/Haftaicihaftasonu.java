package dersCalisma;

import java.util.Scanner;

public class Haftaicihaftasonu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("haftanin gununu giriniz");
        int sayi = scan.nextInt();

        switch (sayi) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:

            System.out.println("haftaici");
             break;

            case 6:
            case 7:

            System.out.println("haftasonu");

            break;

            default:
                System.out.println("gecerli bir sayi giriniz");


        }
    }
}