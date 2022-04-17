package dersCalisma;

import java.util.Scanner;

public class BuyukKucukCumle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle = scan.nextLine().toLowerCase();

        if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        }

        if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else {
            System.out.println("cumle kucuk ya da buyuk kelimesi icermiyor");
        }
        }

    }