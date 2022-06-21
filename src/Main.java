
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kilo ,boy, kitleIndeksi;

        Scanner vucut =new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz :");
        boy = vucut.nextDouble();

        System.out.print("Kilonuzu Giriniz :");
        kilo = vucut.nextDouble();

        kitleIndeksi = kilo/ (boy*boy);

        System.out.print("Vucut Kitle Indeksi :" +  kitleIndeksi ) ;

    }
}
