package day12stringmanup;
import java.util.Scanner;
public class C07_replaceAll {
    public static void main(String[] args) {
        // kullanicidan isim- soyisim bilgisini alip
        // butun harfleri * yapalim
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi yaziniz");
        String isimSoyisim= scan.nextLine();
        System.out.println(isimSoyisim.replaceAll("\\S","*"));
    }
}
