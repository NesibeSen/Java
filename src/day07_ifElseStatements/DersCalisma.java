package day07_ifElseStatements;

import java.util.Scanner;

public class DersCalisma {


    public static void main(String[] args) {


       Scanner scan=new Scanner(System.in);

        System.out.println("lütfen a tam sayısını girin");

        int a=scan.nextInt();

        System.out.println("lütfen b tam sayısını giriniz");

        int b=scan.nextInt();

        if (2*a+2*b==4*a) {
            System.out.println("dikdörtgen karedir");
        }        else {
            System.out.println("dikdörtgenindir");
        }
    }
}

