import java.util.Scanner;
public class Soal1UTS {
    public static int jam1,jam2,menit1,menit2,detik1,detik2;
    public static int biaya=150;
    public static float pulsa;
    public static double konversiJam(){
        return 3600*(jam2-jam1);
    }
    public static double konversiMenit(){
        return 60*(menit2-menit1);
    }
    public static double konversiDetik(){
        return detik2-detik1;
    }
    public static double biayaTotal() {
        return (konversiJam() + konversiMenit() + konversiDetik()) / 5 * biaya;
    }
    public static float pulsa(){
        return pulsa = (float)biayaTotal() / 150;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input jam semula: ");
        jam1 = sc.nextInt();
        System.out.print("Input menit semula: ");
        menit1 = sc.nextInt();
        System.out.print("Input detik semula: ");
        detik1 = sc.nextInt();
        System.out.print("Input jam selesai menelpon: ");
        jam2 = sc.nextInt();
        System.out.print("Input menit selesai menelpon: ");
        menit2 = sc.nextInt();
        System.out.print("Input detik selesai menelpon: ");
        detik2 = sc.nextInt();
        System.out.printf("Biaya yang dikeluarkan adalah: Rp."+biayaTotal()+"0,-");
        System.out.println(" ");
        System.out.println("Dengan total pulsa yang dipakai sebanyak = "+pulsa());
    }
}
