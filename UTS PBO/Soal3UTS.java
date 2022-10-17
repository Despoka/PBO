import java.util.Scanner;

public class Soal3UTS {
    public static int angka,sum = 0;
    static Scanner sc = new Scanner(System.in);
    public static int jumlahAngka(){
        angka = sc.nextInt();
        return sum += angka;
    }

    public static void main(String[] args) {
        int jumlahAngka = jumlahAngka();
        System.out.println("Input 10 buah bilangan angka yang akan ditotalkan");
        for (int i=1;i<=10;i++){
            System.out.print(i+" ");
            jumlahAngka();
        }
        System.out.println("Maka hasil dari penjumlahan 10 angka berikut adalah: ");
        System.out.println(jumlahAngka);
    }
}

