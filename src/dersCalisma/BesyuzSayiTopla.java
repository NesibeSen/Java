package dersCalisma;

import java.util.Scanner;

public class BesyuzSayiTopla {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        int sayi=0;
        int toplam=0;



        while (toplam<500){
            System.out.println("lutfen bir sayı giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;

            }
        System.out.println("artık yeter girilen sayıların toplamı" + toplam);
        }

    }

