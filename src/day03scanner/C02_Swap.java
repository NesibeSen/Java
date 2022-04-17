package day03scanner;

public class C02_Swap {
    public static void main(String[] args) {

        //1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz.
        //Orn:sayi1=10 ve sayi2=20 kod calistiktan sonra sayi1=20 ve sayi2=10 //



       int sayi1=10;
       int sayi2=20;
        System.out.println("Swapten önce sayi1: "+sayi1+", sayi2: "+sayi2);

        // Bos bir variable ouşturup sayi1 i oraya atayalim.//

        int temp=sayi1;
        // 2. adımsayi 1 e yen değerini atayalım
        sayi1=sayi2;

        // 3. adim sayi2 ye temp e yedeklediğimiz sayi1 değerini atayalım
        sayi2=temp;

        System.out.println("Swapten sonra sayi1: "+sayi1+", sayi2: "+sayi2);

    }








}
