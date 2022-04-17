package dersCalisma;

import java.util.Scanner;

public class StringManup01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Lutfen bir cumle yazinizi");
        String cumle= scan.nextLine();
        System.out.println("Lutfen bir harf yaziniz");
        String harf=scan.next();


        System.out.println(cumle.indexOf(harf));



    }
}
