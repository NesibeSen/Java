package dersCalisma;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCaseKısaltma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir hafr giriniz S-D-E-T");
        String harf=scan.next().toUpperCase();

        switch (harf) {

            case "S":
                System.out.println("Software");
                break;
            case "D":
                System.out.println("Developer");
            break;
            case "E" :
                System.out.println("Engineer");
                break;
            case "T" :
                System.out.println("In Testing");
            default:
                System.out.println("lutfen sadece belirtilen harflerden birini giriniz");








        }


    }
}
