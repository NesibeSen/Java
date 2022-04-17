package day23MultiDimencionalArray;

import java.util.Scanner;

public class C07 {

    public static void main(String[] args) {
        //Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        String arr[] = cumle.split(" ");
        System.out.println("Girdiginiz cumledeki kelime sayisi : " + arr.length);

    }
}