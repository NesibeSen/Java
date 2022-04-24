package dersCalisma;

import java.util.Scanner;

public class TerstenYazdirma {
    public static void main(String[] args) {
        System.out.println("bir sayi giriniz");
        Scanner scan=new Scanner(System.in);
        String sayi=scan.nextLine();
        StringBuffer a = new StringBuffer(sayi);
        System.out.println(a.reverse());
    }
}
