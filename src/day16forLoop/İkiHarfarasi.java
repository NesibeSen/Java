package day16forLoop;

public class İkiHarfarasi {
    public static void main(String[] args) {
        //verilen iki harf ve aralarindaki harfleri yazdiran bir kod yaziniz//

        char ilkHarf='m';
        char sonHarf='t';

        for (char i = ilkHarf; i <=sonHarf ; i++) {

            System.out.print(i+ " ");

        }
        double baslangic=10;
        double bitis=20;
        double artis=0.2;

        for (double i = baslangic; i <=bitis ; i+=artis) {
            System.out.print(i + " ");

        }
    }



}
