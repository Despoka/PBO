import java.util.Scanner;

public class Soal2{
    public static double konversiJam(int jam1,int jam2){
        return 3600*(jam2-jam1);
    }
    public static double konversiMenit(int menit1,int menit2){
        return 60*(menit1-menit2);
    }
    public static double konversiDetik(int detik1, int detik2){
        return detik2-detik1;
    }
    public static double biayaTotal( int jam1, int jam2,int menit1, int menit2,int detik1,int detik2, int biaya){
        return ((konversiJam(jam2,jam1)+((konversiMenit(menit2,menit1)))+((konversiDetik(detik2,detik1)))/5) * biaya);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam1;
        int jam2;
        int menit1;
        int menit2;
        int detik1;
        int detik2;
        int biaya=150;
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
        System.out.printf("Biaya yang dikeluarkan adalah: Rp."+biayaTotal(jam2,jam1,menit2,menit1,detik2,detik1,biaya)+"0,-");
    }
}
