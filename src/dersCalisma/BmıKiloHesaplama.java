package dersCalisma;

import java.util.Scanner;

public class BmıKiloHesaplama {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("kilonuz");
        double kilo = scan.nextDouble();
        System.out.println("boyunuz (lutfen metre cinsinden yaziniz örn. 1,70) ");
        double boy = scan.nextDouble();

        double BMI=kilo/(boy*boy);


        if(BMI<18.5) {
            System.out.println("BMI" + "=" +  BMI + "   zayifsiniz");
        }else{
            if(BMI>18.5 && 25>BMI) {
                System.out.println("BMI" + "=" +  BMI + "   kilonuz ideal");
            }else{
                if((BMI>25 && 30>BMI)) {
                    System.out.println("BMI" + "=" +  BMI + "   sismansiniz");
                }else{
                    if (BMI>=30 ){
                        System.out.println("BMI" + "=" +  BMI + "   obezsiniz");
                    }
                }
            }
        }


        }

    }

