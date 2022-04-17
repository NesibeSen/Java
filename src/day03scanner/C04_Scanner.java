package day03scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // Scanner kullanmak için 3 adım takip ediyoruz.
        //1. adım kendimize bir scanner () -> oluturmak

        Scanner scan=new Scanner(System.in);
        //eşitligin saginda yeni bir scanner olusturulur ve olusturulan bu scanner scan variable na assign edilir.//

        //2.adim ullanicidan istedigimiz degeri girmes icin aciklayici bir bilgi gyazmasini isteyin.//

        System.out.println("lutfen isminizi giriniz");

        // 3. adim kullanicinin girdigi degeri uygun bir variable olusturup kaydedin.

        String kullaniciIsmi=scan.next();//Sadece ilkkelimeyi alir.
        // ilk boşluğa kadar kabul eder. iki ve daha fazla isim girilecekse nexyline() parametresi secilebilir.

        System.out.println("kullanicinin girdigi isim:" + kullaniciIsmi);



    }








}
