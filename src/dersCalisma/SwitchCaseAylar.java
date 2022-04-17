package dersCalisma;

import java.util.Scanner;

public class SwitchCaseAylar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int ayNo=scan.nextInt();

        switch (ayNo) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            default:
                System.out.println("gecerli bir ay sayisi giriniz");


        }
        }

    }

