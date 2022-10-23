import java.util.Scanner;

public class gajiKaryawan {
    public static Scanner nt = new Scanner(System.in);
    public static int waktuKerja, lembur, gol;
    public static double gajiPokok, tunjangan, gajiTotal;

    public static void lembur() {
        do {
            System.out.print("Masukan waktu kerja       : ");
            waktuKerja = nt.nextInt();
            lembur = waktuKerja - 173;
        } while (waktuKerja < 173);
    }

    public static void gol1() {
        gajiPokok = (1486500 * 0.995);
        tunjangan = (250000 * 0.995);
        lembur();
        System.out.println("Waktu lembur anda       : " + lembur + " jam");
        lembur = lembur * 20000;
        System.out.println("Gaji lembur anda        : Rp" + lembur);
        gajiTotal = gajiPokok + tunjangan + lembur;
        System.out.println("Waktu kerja anda        : " + waktuKerja + " jam");
        System.out.println("Gaji anda               : Rp" + gajiPokok);
        System.out.println("Tunjangan anda          : Rp" + tunjangan);
        System.out.println("Total gaji anda = Rp" + gajiTotal);
    }

    public static void gol2() {
        gajiPokok = (1926000 * 0.995);
        tunjangan = (300000 * 0.995);
        lembur();
        System.out.println("Waktu lembur anda       : " + lembur + " jam");
        lembur = lembur * 20000;
        System.out.println("Gaji lembur anda        : Rp" + lembur);
        gajiTotal = gajiPokok + tunjangan + lembur;
        System.out.println("Waktu kerja anda        : " + waktuKerja + " jam");
        System.out.println("Gaji anda               : Rp" + gajiPokok);
        System.out.println("Tunjangan anda          : Rp" + tunjangan);
        System.out.println("Total gaji anda = Rp" + gajiTotal);
    }
    public static void gol3() {
        gajiPokok = (2456700 * 0.995);
        tunjangan = (350000 * 0.995);
        lembur();
        System.out.println("Waktu lembur anda       : " + lembur + " jam");
        lembur = lembur * 20000;
        System.out.println("Gaji lembur anda        : Rp" + lembur);
        gajiTotal = gajiPokok + tunjangan + lembur;
        System.out.println("Waktu kerja anda        : " + waktuKerja + " jam");
        System.out.println("Gaji anda               : Rp" + gajiPokok);
        System.out.println("Tunjangan anda          : Rp" + tunjangan);
        System.out.println("Total gaji anda = Rp" + gajiTotal);
    }
    public static void gol4() {
        gajiPokok = (2899500 * 0.995);
        tunjangan = (400000 * 0.995);
        lembur();
        System.out.println("Waktu lembur anda       : " + lembur + " jam");
        lembur = lembur * 20000;
        System.out.println("Gaji lembur anda        : Rp" + lembur);
        gajiTotal = gajiPokok + tunjangan + lembur;
        System.out.println("Waktu kerja anda        : " + waktuKerja + " jam");
        System.out.println("Gaji anda               : Rp" + gajiPokok);
        System.out.println("Tunjangan anda          : Rp" + tunjangan);
        System.out.println("Total gaji anda = Rp" + gajiTotal);
    }


    public static void main(String[] args) {
        System.out.print("Masukan golongan : "); gol=nt.nextInt();
        switch (gol){
            case 1 -> gol1();
            case 2 -> gol2();
            case 3 -> gol3();
            case 4 -> gol4();
        }
    }
}