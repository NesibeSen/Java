package day27_constructor02;

public class VolvoRunner2 {
    public static void main(String[] args) {
        // Her obje obje olusturdugumuzda model, yakit gibi degerleri tek tek atama
        // yapmak istemiyorsaniz

        Volvo arb1 = new Volvo ("XC60", false, 2023, "Benzin");
        System.out.println(arb1); // Model : XC60 Yakit : Benzin Max Hiz : 240

    }
}