import java.util.Random;
import java.util.Scanner;

//java.util.Random ile bilgisayarın rastgele bir sayı seçebilmesi için gereken random sınıfı projeye dahil eder.
//java.util.Scanner ise kullanıcının klavyeden girdiği verileri okuyabilmek için gereken scaner sınıfı dahl eder.

public class sayiBulmaca {

    public static void main(String[] args) {

        /*
        Amaç: Bilgisayarın tuttuğu bir sayıyı, tahmin etmeye çalışmak.
        1. program, 1 ile 100 arasında rastgele bir sayı seçer.
        2. kullanıcı sayıyı bilemediği için SÜRECE
           -kullanıcı, tahmini sayı girer.
        3. Girilen sayı tutulanla karşılaştırılır.
           a. Tutulan > Tahmin ise "yukarı" yazar
           b. Tutulan < Tahmin "aşağı" yazar.
           c. Eşit ise oyun biter.
        4. Eşitlik sağlanmazsa 2. adıma döner.
         */

        Random sayiUretici = new Random();   // Random nesnesi oluşturur. rastgele sayı üretir.
        Scanner tarayici = new Scanner(System.in);   //klavyeden girilen girdiyi dinleyecek.
        String cevap = "";

        do {
            int tutulan = sayiUretici.nextInt(1,100);
            boolean sayiBilindiMi = false;
            int tahminSayisi = 0;
            while (!sayiBilindiMi) {
                System.out.println("Tahmininizi girin.....");
                int tahmin = tarayici.nextInt();
                tahminSayisi++;
                String yon = "";
                if (tutulan > tahmin) {
                    yon = "YUKARI";
                } else if (tutulan < tahmin) {
                    yon = "Aşağı";
                } else {
                    sayiBilindiMi = true;
                }

                System.out.println(yon);


            }
            System.out.println("Tebrikler!" + tahminSayisi + " denemede bildiniz");
            System.out.println("Tekrar oynamak ister misiniz (E/H)?");
            cevap = tarayici.next();
        }while (cevap.equals("E"));
    }
}


