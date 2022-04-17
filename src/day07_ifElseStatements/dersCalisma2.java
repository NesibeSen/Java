package day07_ifElseStatements;

import java.util.Scanner;

public class dersCalisma2 {
    public static void main(String[] args) {
        System.out.println("Emeklilik yası hesaplama");
        Scanner scan = new Scanner(System.in);

        System.out.println("Cinsiyet K/E?");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Yas?");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K')
           if (yas>=58)
        {
            System.out.println("Emekli olabilirsiniz");

        } else {
            System.out.println("Emekli olamazsınız, Emekli olabilmek icin " + (58 - yas) + "  yil calismaniz gerekmektedir.");}


         if (cinsiyet == 'E')

             if (yas>=60) {
                     System.out.println("Emekli olabilirsiniz");
                 }
        else{
                System.out.println("Emekli olamazsınız, emekli olabilmek icin " + (60 - yas) + "  yil calismaniz gerekmektedir.");

            }

        }
    }
