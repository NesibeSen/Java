package dersCalisma;

import java.util.Scanner;

public class DersCalisma1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("haftanin kacinci gunu");
        int gunSayisi=scan.nextInt();

        switch (gunSayisi) {

            case 1:
                System.out.println("Pazartesi");
            break;
            case 2:
                System.out.println("Sali");
                break;

            case 3:
            System.out.println("Carsamba");
            break;
            case 4:
            System.out.println("Persembe");
            break;
            case 5:
            System.out.println("Cuma");
            break;
            case 6:
            System.out.println("cumartesi");
            break;
            case 7:
            System.out.println("Pazar");
            default:
                System.out.println("gecerli bir sayi girmelisiniz");
        }}

    }

