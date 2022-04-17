package day05matematikselIslemler;

public class C02_PrePostIncrement {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        sayi2= sayi1++;
        System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3);
        sayi3=++sayi1;
        System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3);


        System.out.println(sayi3++);//once sayı3 un son degerini yazdiricak12) sonra sayi3=13 yapacak ama bunu yazdiramayacak.
        System.out.println(--sayi2);//once azalt sonra yazdir. sayi2 nin son degeri 10 idi. once 9 yapacak sonra yazdiracak.
    }
}
