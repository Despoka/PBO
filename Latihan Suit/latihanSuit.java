import java.util.Random;
import java.util.Scanner;

public class latihanSuit {
    public static void main(String[] args) {
        String[] arr = {"JEMPOL", "KELINGKING", "TELUNJUK"};
        Scanner sc = new Scanner(System.in);
        String jawab, ulang;

        Random r = new Random();
        System.out.println("Selamat datang kedalam permainan suwit jawa: ");
        do {
            int randomNumber = r.nextInt(arr.length);
            System.out.print("Masukkan Jempol (J) / Kelingking (K) / Telunjuk (T): ");
            jawab = sc.next().toUpperCase();
            System.out.println("Inputan anda: "+jawab);
            System.out.println("Komputer mengeluarkan :" + arr[randomNumber]);
            if (arr[randomNumber].equals("TELUNJUK") && jawab.equals("JEMPOL")) {
                System.out.println("Cie menang jago dah lu");

            } else if (arr[randomNumber].equals("JEMPOL") && jawab.equals("KELINGKING")) {
                System.out.println("Cie menang jago dah lu");

            } else if (arr[randomNumber].equals("KELINGKING") && jawab.equals("TELUNJUK")) {
                System.out.println("Cie menang jago dah lu");

            } else if (arr[randomNumber].equals(jawab)) {
                System.out.println("Yaelah kenapa seri");
            } else {
                System.out.println("Dih kalah NT");
            }
            System.out.print("Apakah anda ingin mengulang? [y/t] ");
            ulang = sc.next();
        }while (ulang.equals("y"));
        System.out.println("Terima kasih telah bermain :)))))))");
    }
}
