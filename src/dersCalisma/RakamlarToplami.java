package dersCalisma;

import java.util.Scanner;

public class RakamlarToplami {
    public static void main(String[] args) {
        int rakam=0;
        int rakamlarToplami=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();


        while (sayi>0) {

            rakam=sayi%10;
            rakamlarToplami+=rakam;
            sayi/=10;

        }

        System.out.println(rakamlarToplami);

    }
}
