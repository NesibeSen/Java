package day04datacasting;

import java.util.Scanner;

public class C01Scanner {

    public static void main(String[] args) {

        //kullanicidan ismini alip ismini baş harfini yaz.


        Scanner scan=new Scanner (System.in);
        System.out.println("lutfen isminizi yaziniz");
        char ilkHarf=scan.next().charAt(0);
        System.out.println("girdiginiz ismin ilk harfi: "+ilkHarf);

        //charAT index methodu parametre olarak yazdigimiz indexdeki char i bize getirir.




    }




}
