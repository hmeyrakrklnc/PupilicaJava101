import java.util.InputMismatchException;
import java.util.Scanner;

public class usingSwitch {
    public static void main(String[] args) {

        //Escape Sequence in Java
        //\n: yeni satıra geçmek için kullanılır.
        System.out.println("Aşağadaki trafik ışıklarından birini seçin:\n1.Kırmızı\n2.Sarı\n3.Yeşil\nLütfen seçiminizi sayı olarak yapın");

        //Scanner scanner = new Scanner(System.in);
        //String choose = scanner.next()
        //yerine tek satırda instance al ve kullan:
        String choose = new Scanner(System.in).next();
        // choose: kullanıcının girdiği değeri tutar.
        if (choose.equals("1")){
            System.out.println("DUR!");

        } else if (choose.equals("2")) {
            System.out.println("DİKKATLİ OL");
        } else if (choose.equals("3")) {
            System.out.println("GEÇ");
        }
        else{
            System.out.println("Belirsiz işlem....");
        }

        switch (choose){
            case "1":
                System.out.println("DUR!");
                break;
            case "2":
                System.out.println("DİKKATLİ OL!");
                break;
            case "3":
                System.out.println("GEÇ");
                break;
            default:
                System.out.println("Belirsiz işlem...");
                break;
        }


    }
}
// kullanıcının seçtiği sayıya göre hangi ışıkta nasıl hareket etmesi gerektiğini söyleyen bir kod bloğu.