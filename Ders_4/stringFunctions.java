public class stringFunctions {
        public static void main(String[] args) {


            String value ="Pupilica ile Java Temelleri";

            System.out.println(value.toLowerCase());    //toLowerCase() fonksiyonu tüm karakterleri küçük harfe çevirir.
            System.out.println("İle kelimesi var mı: " + value.contains("ile"));    //cantains: belirtilen alt dizgiyi içerip içermediğini kontrol eder.örn(ile)

            System.out.println(value.getBytes());    //string'i byte dizisine çevirir.(çıktısı çok anlamlı görünmez)

            System.out.println(value.charAt(0));     //ilk karakteri döndürür.

            System.out.println(value.codePointAt(2));    //2.indeksteki karakterin unicode kod noktası verir.(unicode:dünya dillerindeki tüm karakterleri temsil etmek için geliştirilmiş evrensel bir kodlama sistemi)

            System.out.println(value.substring(3));   //3.indeksten itibaren alt dizgeyi döndürür.(ilica ile java temelleri)

            //Pupilica
            //upilica P
            //pilica Pu
            //ilica Pup

            for (int i = 0; i < value.length() ; i++) {
                System.out.println(value.substring(i));

            }     //her karakterden başlayarak string'in sonuna kadar olan kısmı yazdırır.

            System.out.println(value.concat("deneme"));    //stringe "deneme" ekler. ("Pupilica ile Java Temellerideneme")

            System.out.println(value.indexOf('a',17));   //17. indeksten sonra ilk 'a' karakterinin indeksini verir.







        }
    }