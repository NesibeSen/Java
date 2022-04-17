package day19scopeArrays.Scope;

public class ScopeStaticVariables {
/* instance variable lar objeye bağımlıdır ve her obje farklı degerler alabilir.
    buna ornek olarak ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable in son degerini bulmak icin sadece o objeyi dikkate aliriz.



    statik variable lar ise class variable olarak tanimlanir ve tum class uyeleri icin aynidir.
    okul ismi okul mudurunun adi gibi
    eger static variable in degeri degistirilirse herkes icin degisir.
 */




    static String okulIsmi = "yildiz koleji";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {
        System.out.println(okulIsmi);//yildiz koleji
        System.out.println(okulNo);// 0
        okulNo = 102;
        System.out.println(okulNo); // 102
        System.out.println(okulAcikMi);

        staticMethod();
        System.out.println(okulNo);


    }


        public static void staticMethod () {
         okulNo=200;
            System.out.println(okulNo); // 200

        }
    }
