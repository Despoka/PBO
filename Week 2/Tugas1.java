import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);  
        do{
            System.out.println("Silahkan masukkan nilai angka mulai dari 0 - 10");
            input = sc.nextInt();
            
        }
        while (!(input >= 0 && input <=10));
        sc.close();
    }
}
