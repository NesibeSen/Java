package day19scopeArrays.Scope;

public class Scope {

    int sayi;
    String bransIsmi="Java";
    boolean okuldaMi;

    public static void main(String[] args) {
        // sayi varşable statk olmadığı icin main methoddan direk kullanilamaz.
        //Instance variable lara statik methodlardan ulasabilmek icin Obje olusturmamiz gerekir.

        Scope obje=new Scope(); // okul icin ogremen ve ogrenci gibi.

        System.out.println(obje.sayi);// 0
        obje.sayi=10;
        System.out.println(obje.sayi);
        obje.bransIsmi="SQL";
        System.out.println(obje.okuldaMi);

        // // // // // // //

        Scope obje2=new Scope();
        System.out.println(obje2.sayi);//0
        System.out.println(obje2.bransIsmi);// Java


        obje.okuldaMi=true;
        System.out.println(obje2.okuldaMi);// false


    }









}



