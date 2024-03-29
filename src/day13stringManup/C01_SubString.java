package day13stringManup;

public class C01_SubString {
    public static void main(String[] args) {
        String str= "Java ile IT cok guzel";
        System.out.println(str.substring(5)); // ile IT cok guzel
        // yukardaki String'i Mehmet hoca ile IT cok guzel
        System.out.println(str.replace("Java","Mehmet hoca"));
        System.out.println("Mehmet hoca " + str.substring(5));
        System.out.println(str.substring(9)); // yazilan index inclusive
        // Eger bir index'den sona kadar olan parcayi degil
        // belirli bir parvcayi almak istersek
        // 2 parametre yazmak gerekir str.substring(baslangicIndexi, bitisIndexi)
        // baslangic indexi ==> inclusive/dahil
        // bitis indexi ==> eclusive/haric
        System.out.println(str.substring(0,5)); // Java
        System.out.println(str.substring(0,1)); // J
        String harf=str.substring(5,6); // bana 6.karakter String olarak bulun
        System.out.println(harf);
        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7)); // hiclik dondurur
        // System.out.println(str.substring(5,2)); // bitis index'i baslangic indexinden kucuk olamaz
        System.out.println(str.substring(str.length()-1));  // son harfi verir
        System.out.println(str.substring(str.length()-5)); // son 5 harfi yazdiralim
        System.out.println(str.substring(str.length()));// son harften sonraki kismi yani hiclik verir

    }
}
