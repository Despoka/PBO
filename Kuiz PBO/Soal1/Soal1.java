package Soal1;

import java.util.Scanner;

public class Soal1 {
    Scanner nt = new Scanner(System.in);
    private String awal1, awal2;
    private int alas, tinggi, jari2, diameter;
    private double luas, phi;

    public void luasLingkaran1() {
        this.phi = 3.14;
        System.out.print("Jari - jari: ");
        this.jari2 = nt.nextInt();
        this.luas = this.phi * this.jari2 * this.jari2;
        System.out.println("Luas lingkaran anda: " + this.luas);
    }

    public void luasLingkaran2() {
        this.phi = 3.14;
        System.out.print("Diameter: ");
        this.diameter = nt.nextInt();
        this.luas = 0.25 * this.phi * this.diameter * this.diameter;
        System.out.println("Luas lingkaran anda: " + this.luas);
    }

    public void luasSegitiga() {
        System.out.print("Alas: ");
        this.alas = nt.nextInt();
        System.out.print("Tinggi: ");
        this.tinggi = nt.nextInt();
        this.luas = 0.5 * this.alas * this.tinggi;
        System.out.println("Luas segitiga anda: " + this.luas);
    }

    public void ulang() {
        awal1();
        awal2();
    }


    public void awal1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Pilih program olah anda: lingkaran1(jari-jari)/lingkaran2(diameter)/segitiga ");
        awal1 = nt.nextLine().toLowerCase();

        if (awal1.equals("lingkaran1")) {
            luasLingkaran1();
        } else if (awal1.equals("lingkaran2")) {
            luasLingkaran2();
        } else if (awal1.equals("segitiga")) {
            luasSegitiga();
        } else {
            System.out.println("Pilihan anda salah");
        }
    }

    public void awal2() {
        Scanner nt = new Scanner(System.in);
        System.out.println("");
        System.out.print("Apakah anda ingin mengulang? (y/n): ");
        awal2 = nt.nextLine().toLowerCase();

        if (awal2.equals("y")) {
            ulang();
        } else if (awal2.equals("n")) {
            System.out.println("");
            System.out.println("Terima kasih telah menggunakan program ini!");
        } else {
            System.out.println("Ulangi jawaban anda");
            awal2();
        }
    }
}

class mencariLuas {
    public static void main(String[] args) {
        Soal1 luas = new Soal1();
        luas.ulang();
    }
}
