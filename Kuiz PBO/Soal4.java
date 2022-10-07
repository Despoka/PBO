import java.util.Scanner;
public class Soal4 {

    private double input;
    private String grade;

    public Soal4 (double inputAngka){
        this.input = inputAngka;

        if(inputAngka >= 90 && inputAngka <= 100){
            this.grade="A";
        }
        else if(inputAngka >= 80){
            this.grade="A-";
        }
        else if(inputAngka >= 75){
            this.grade="B+";
        }
        else if(inputAngka >= 70){
            this.grade="B";
        }
        else if(inputAngka >= 65){
            this.grade="B-";
        }
        else if(inputAngka >= 60){
            this.grade="C+";
        }
        else if(inputAngka >= 55){
            this.grade="C";
        }
        else if(inputAngka >= 50){
            this.grade="C-";
        }
        else if(inputAngka >= 40){
            this.grade="D";
        }
        else if (inputAngka >= 0){
        this.grade="E";
        }
    }
    public String nilaiHuruf(){
        return this.grade;
    }

    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        double nilaiHuruf = nt.nextDouble();

        Soal4 hf = new Soal4(nilaiHuruf);
        System.out.println("Nilai Angka kamu: " + nilaiHuruf);
        System.out.println("Nilai Huruf kamu: " + hf.nilaiHuruf() );

    }
}