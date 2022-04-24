package dersCalisma;

public class AscIIYazdir {
    public static void main(String[] args) {


        char ilkHarf = 'a';
        char sonHarf = 'z';
        int ilkDeger = 'a';
        int sonDeger = 'z';

            while (ilkDeger<=sonDeger) {
                for (char i = ilkHarf; i <= sonHarf; i++) {
                System.out.print("ASCII code of" + i + "=" + ilkDeger);
                System.out.println(" ");

                ilkDeger++;
            }


        }
    }
}