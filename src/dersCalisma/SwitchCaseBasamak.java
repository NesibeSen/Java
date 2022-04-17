package dersCalisma;

import java.util.Scanner;

public class SwitchCaseBasamak {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        switch (sayi) {

            case 10 :
                System.out.println("iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("dort basamakli en kucuk sayi");

            default:
                    System.out.println("girdigin sayiyi degistir");
        }



    }
}
