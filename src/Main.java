import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Hümeyra");


        // (açıklama satırı için iki slaş kullanılr.)

        /*
        burası paragraf biçimindeki açıklama satırlarıdır.
        **/


        //javada temel veri tipleri

        /*
        1.sözel veriler
        2.sayısal veriler
        3.Mantıksal veri
         */

        int bulundugumYil = 2025;
        int doğumyili = 2006;

        int yas = bulundugumYil - doğumyili;
        // the bug yöntemi
        System.out.println(yas);

        bulundugumYil = LocalDate.now().getYear();
        System.out.println("Lütfen doğum yılınızı giriniz");

        //ekrandan girilen veriyi okumak için scanner nesnesi oluşturunuz
        Scanner scanner = new Scanner(System.in);

        int dogumYili = scanner.nextInt();

        yas = bulundugumYil - dogumYili;
        System.out.println("Yaşınız:" +yas);

                 //Veri tipleri dönüşümü//

        //Implicit (otomatik) casting:
        //Çeviri ve casting:
        //Casting: aynı türde verilerin birbirlerine dönüşmesi
        //çeviri (convert): farklı türde verilerin  birbirlerine dönüşmesi

        byte sayi = 100;
        int otomatikcasting = sayi;
        //long test = otomatikcasting;

        //explicit (zorla) casting:
        int x = 130;
        byte b = (byte) x;
        System.out.println("b değişkeninin değeri:"+b);

        //Convert
        String number = "56";
        int num = Integer.parseInt(number);

             //TAM SAYILAR

       byte enKucukByte = -128;  //8 bit
       byte enBuyukByte = 127;

       short onaltiBit = 32767;  // 16 bit

        int otuzikiBit = 2000000000;
        long altmısdortbi = 2000000000000L;
        //ihtiyaca göre fonksyionları bu değişkenlerle yazabilirsin

        //ONDALIKLI SAYILAR:
        float ates = 36.55f; //düşük hassasiytli işlemler için (f harfi koymayı unutma)
        double fiyat  = 3.99; //hassasiyeti daha yüksek işlemler için

        int sayi1 = 15;
        int sayi2 = 6;
        int bolumInt = sayi1 / sayi2;

        double sayi3 = 15;
        double sayi4 = 6;
        double bolumDouble = sayi3 / sayi4;

        System.out.println("Tam sayı sonuç:" + bolumInt);
        System.out.println("Ondalıklı sayı sonuç:" + bolumDouble );

        // tam sayılarda varsayılan 'int', ondalıklı sayılarda varsayılan 'double'dır.

        char ilkharf = 'A';
        //ALİ
        String isim = "Ali";

        boolean derstenGectiMi = true;
        boolean buyukMu = sayi4 > 3;
    }
}