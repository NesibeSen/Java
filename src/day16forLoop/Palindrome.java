package day16forLoop;

public class Palindrome {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.
        //bir method olusturun

        String input="madam";
        palindromeKontrolEt(input);
    }

    private static void palindromeKontrolEt(String input) {
        String terstenInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            terstenInput += input.charAt(i);
        }
        System.out.println("girdiginiz kelimenin tersten yazilisi" + "   " + terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){
        System.out.println("girdiginiz kelime palindrome");
    }else {
        System.out.println("girdiginiz kelime palindrome degil");


        }
    }
}
