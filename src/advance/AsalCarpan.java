package advance;

import java.util.Scanner;

public class AsalCarpan {
    static int bolen = 0;
    static boolean isAsal = true;

    public static void main(String[] args) {
        /* TASK :
         * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
         * METHOD create ediniz.
         *
         * Ör: Input : 50
         *     Bolenler : 2,5,10,20,50
         *     Asal Bolenler: 2,5
         *     En buyuk asal carpan: 5
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi = scan.nextInt();//50
        asalCarpan(sayi);
    }

    private static void asalCarpan(int sayi) {
        int asalBolen = 0;
        for (int i = 2; i <= sayi; i++) {

            if (sayi % i == 0) {
                bolen = i;
                asalMı(bolen);//method call-> bolen sayının asal olup olmadıgını kontrol ediyor
            }
            if (isAsal) {
                asalBolen = bolen;
            }

        }
        System.out.println("girdiginiz sayının en buyuk asal boleni : " + asalBolen);

    }

    private static boolean asalMı(int bolen) {

        for (int i = 2; i < bolen; i++) {
            if (bolen % i == 0) {//bolen sayısını bolen sayısına kadar tum tamsayılar boldugunde kalan 0 değilse:
                // bu sayı kendisnden baska hiç bir sayıya tam bolunmez
                isAsal = false;
                break;
            }
        }
        return isAsal;

    }


}


