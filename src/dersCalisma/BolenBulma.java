package dersCalisma;

import java.util.Scanner;

public class BolenBulma {
    public static void main(String[] args) {
        int bolen=1;
        int sayac=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();



        while (sayi>=bolen) {

            if (sayi % bolen == 0) {
                System.out.print(bolen +" ");
                sayac++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println("sayiyi " + sayac + "  adet bolen vardir");

            }
        }




