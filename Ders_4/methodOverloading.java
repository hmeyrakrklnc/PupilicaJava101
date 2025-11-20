public class methodOverloading {
        public static void main(String[] args) {

            alanHesapla(3, "Kare");

        }
        /*
        1.alanHesapla(double birim1, String sekil)
           amaç: kare veya daire alanı hesaplamak.
           *birim1: kare için kaner uzunluğu, daire için yarıçap
           *sekil: "kare" veya "daire" stringi
           *"kare" seçilirse: kenar üzeri iki
           *"daire" seçilirse: pi sayısı çarpı yarıçap üzeri iki diğer durumlarda 0 döner.
        2.alanHesapla(double birim1, double birim2, String sekil)
           amaç:üçgen ve dikdörtgen alanı hesaplamak.
           *birim1: taban veya kısa kenar.
           *birim2: yükseklik veya uzun kenar.
           *sekil: "üçgen" veya "dikdörtgen" stringi
           *"üçgen" seçilirse: (taban çarpı yükseklik) bölü 2
           *"dikdörtgen" seçilirse: kenar1 çarpı kenar2, diğer durumlarda 0 döner.
         */

        /**
         * Parametre olarak aldığı değerleri kullanarak kare veya daire şekillerinin alanlarını hesaplar.
         *
         * @param  birim1  Kare için kenar, daire için yarı çap uzunluğu
         * @param  sekil 'Daire' veya 'Kare'
         * @return      seçilen şeklin alanı
         * @see         Double
         */
        static double alanHesapla(double birim1, String sekil){

            double sonuc = 0;
            switch (sekil){
                case "Kare":
                    return Math.pow(birim1,2);
                case "Daire":
                    return Math.PI * Math.pow(birim1,2);

                default:
                    return 0;

            }
        }

        static double alanHesapla(double birim1, double birim2, String sekil){
            double sonuc = 0;
            switch (sekil){
                case "Üçgen":
                    return (birim1 * birim2) / 2;
                case "Dikdörtgen":
                    return birim1 * birim2;

                default:
                    return 0;

            }
        }
}