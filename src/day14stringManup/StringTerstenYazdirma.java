package day14stringManup;

public class StringTerstenYazdirma {
    public static void main(String[] args) {
        //soru: kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi ilk harfi büyük
        //diğerleri kucuk olarak tersten yazdirin

        String input="Mino";

        String tersStr= input.substring(3).toUpperCase()+
                        input.substring(2,3).toLowerCase()+
                        input.substring(1,2).toLowerCase()+
                        input.substring(0,1).toLowerCase();

        System.out.println(tersStr);





    }
}
