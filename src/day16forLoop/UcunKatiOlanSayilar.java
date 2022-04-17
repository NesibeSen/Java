package day16forLoop;

import java.util.Scanner;

public class UcunKatiOlanSayilar {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Lutfen 100 den kucuk bir tamsayi giriniz");
        int sayi=scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {

            if (i%3==0){
                System.out.print(i+" " );
            }

        }
    }
}
