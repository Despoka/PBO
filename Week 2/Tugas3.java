import java.util.Random;
import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        String[] arr = {"j", "k", "t"};
        Scanner sc = new Scanner(System.in);
        String jawab, ulang, pilihanKomputer;

        Random r = new Random();
        System.out.println("Selamat datang kedalam permainan suwit jawa: ");
        do {
            int randomNumber = r.nextInt(arr.length);
            System.out.print("Masukkan Jempol (J) / Kelingking (K) / Telunjuk (T): ");
            jawab = sc.next();
            jawab = jawab.toLowerCase();

            if (randomNumber == 0) {
                pilihanKomputer = "Jempol";
            } else if (randomNumber == 1) {
                pilihanKomputer = "Kelingking";
            } else {
            pilihanKomputer = "Telunjuk";
        }
        System.out.println(" ");
        System.out.println("Komputer ngeluarin: " + pilihanKomputer + "!");
        System.out.println(" ");
            if (arr[randomNumber].equals("t") && jawab.equals("j")) {
                System.out.println("Cie menang jago dah lu");

            } else if (arr[randomNumber].equals("j") && jawab.equals("k")) {
                System.out.println("Cie menang jago dah lu");

            } else if (arr[randomNumber].equals("k") && jawab.equals("t")) {
                System.out.println("Cie menang jago dah lu");

            } else if (arr[randomNumber].equals(jawab)) {
                System.out.println("Yaelah kenapa seri");
            } else {
                System.out.println("Dih kalah NT");
            }
            System.out.println(" ");
            System.out.print("Apakah anda ingin mengulang? [y/t] ");
            ulang = sc.next();
            ulang = ulang.toLowerCase();
        }while (ulang.equals("y"));
        System.out.println("Terima kasih telah bermain.");
        sc.close();
    }
}