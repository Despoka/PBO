import java.util.Scanner;

public class assignaskd2coba {
    public static void main(String[] args) {
        String kalimat = "Kalau dilakukan dengan sepenuh hati maka besi batangna pun kalau digosok terus menerus akan menjadi jarum";
        String kata;
        Scanner sc =  new Scanner(System.in);

        do{
            System.out.println("Input kata yang mengandung dalam kalimat");
            kata = sc.nextLine();
            if(kalimat.contains(kata)){
                System.out.println("Kata tersebut terdapat dalam kalimat.");
                System.out.println(" ");
            }else {
                System.out.println("Kata tersebut tidak terdapat dalam kalimat.");
                System.out.println(" ");
            }
            
        }while(kalimat.contains(kata)==false);
        sc.close();
    }
}
