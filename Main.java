import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // idman olusturma programi

        Scanner scanner = new Scanner(System.in);
        Scanner strScanner = new Scanner(System.in);

        System.out.println("IDMAN PROGRAMINA HOSGELDINIZ");
        String idmanlar = "Gecerli Hareketler\n" +
                "Burpee\n" +
                "Pushup\n" +
                "Situp\n" +
                "Squat\n";

        System.out.println(idmanlar);
        System.out.println("Bir idman olusturun...");

        System.out.print("Burpee Sayisi: ");
        int burpee = scanner.nextInt();

        System.out.print("Pushup Sayisi: ");
        int pushup = scanner.nextInt();

        System.out.print("Situp Sayisi: ");
        int situp = scanner.nextInt();

        System.out.print("Squat Sayisi: ");
        int squat = scanner.nextInt();

        Idman idman = new Idman(burpee, pushup, situp, squat);

        System.out.println("Idmaniniz basliyor...");

        while (idman.idmanBittiMi() == false) {
            System.out.print("Hareket Turu (Burpee, Pushup, Situp, Squat) : ");
            String tur = strScanner.nextLine();

            System.out.print("Bu hareketten kac tane yapacaksiniz: ");
            int sayi = scanner.nextInt();

            idman.hareketYap(tur, sayi);
        }
        System.out.println("Antrenmaniniz bitti. Tekrar gorusmek uzere...");

    }
}
