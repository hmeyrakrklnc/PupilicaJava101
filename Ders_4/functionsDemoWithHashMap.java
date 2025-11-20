import java.util.HashMap;
import java.util.Scanner;
public class functionsDemoWithHashMap {
    public static void main(String[] args) {

        /*
        BU JAVA KODU PLAKA-ŞEHİR EŞLEŞTİRME SİSTEMİDİR.


         * 1. Kullanıcı menü içinden seçim yapar.
         *    1. Plaka kaydet
         *    2. Plaka ara
         *    3. Çıkış yap
         * 2. Seçime göre;
         *    1'i seçerse Kullanıcıdan plaka girmesini iste.
         *        Eğer plaka yoksa, eklesin
         *        Varsa "zaten var" desin.
         *    2'yi seçerse, aranacak plakayı istesin
         *        Varsa şehri yazsın.
         *        Yoksa "bulunamadı" desin.
         * */
        showMenu();


    }

    static void showMenu() {   //kullanıcıya menü gösterir ve seçim yapmasını ister.
        int userChoose = chooseFromMenu();     //1,2 ve 3ü seçmesini ister. Hataları yakalar(sayı 1-3 arasında ise uyarır, eğer sayı değilse try-catch ile hatayı yakalar.)
        navigate(userChoose);    //kullanıcının seçimine göre ilgili metoda yönlendirir.
    }


    static int chooseFromMenu() {
        System.out.println("Lütfen aşağıdaki seçeneklerden birini işaretleyin:\n1. Plaka kaydet\n2. Plaka ara\n3. Çıkış yap");

        int choose = 0;
        boolean isFault = false;

        do {
            isFault = false;
            try {
                Scanner scanner = new Scanner(System.in);
                choose = scanner.nextInt();
                if (choose > 3) {
                    System.out.println("Seçiminiz 1, 2 veya 3  olmalı");
                    isFault = true;
                }
            } catch (Exception ex) {
                System.out.println("Lütfen sadece 1,2 veya 3 girin");
                isFault = true;
            }
        } while (isFault);

        return choose;


    }

    static void navigate(int choose) {
        switch (choose) {
            case 1:
                getPlateDataFromUser();  //kullanıcıdan plaka ve şehir bilgisi alır. eğer plaka zaten varsa uyarır yoksa addPlate() ile ekler.
                break;
            case 2:
                searchPlateInDictionary();  //kullanıcıdan plaka alır ve plates.get() ile şehir billgisini bulmaya çalışır eğer null ise kayıt bulunamamıştır. varsa şehir yazdırır ve başka plaka aramak isteyip istemediği sorulur.
                break;
            case 3:
                System.out.println("Çıkış yapıldı");
        }
    }


    static HashMap<String, String> plates = new HashMap<>();   // plaka şehir eşleştirilmesi için kullanılır

    static boolean addPlate(String plate, String city) {  //plaka daha önce eklenmiş mi diye kontrol eder varsa false döner yoksa plates.put() ile ekler ve true döner.  

        if (plates.containsKey(plate)) {
            return false;
        }

        plates.put(plate, city);
        return true;

    }

    static void getPlateDataFromUser() {
        boolean isSuccess = false;
        String answer = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen plaka girin");
            String plate = scanner.next();
            System.out.println("Şehri girin:");
            String city = scanner.next();
            isSuccess = addPlate(plate, city);
            if (!isSuccess) {
                System.out.println("Bu plaka zaten kayıtlı. Yeni plaka giriniz.");

            } else {
                System.out.println("Başka plaka kaydetmek ister misiniz? (E/H)");
                answer = scanner.next();

            }

        } while (!isSuccess || answer.equals("E"));

        showMenu();

    }

    private static void searchPlateInDictionary() {

        String answer = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Aranacak plakayı girin:");
            String plateKey = scanner.next();
            String cityValue = plates.get(plateKey);
            if (cityValue == null) {
                System.out.println("Bu plakaya ait bir kayıt bulunamadı");
                break;
            } else {
                System.out.println("Bu plaka " + cityValue + " iline aittir");
                System.out.println("Başka bir plaka kodu ile arama yapmak ister misiniz? E/H");
                answer = scanner.next();
            }
        } while (answer.equals("") || answer.equals("E")) ;

            showMenu();


        }


    }