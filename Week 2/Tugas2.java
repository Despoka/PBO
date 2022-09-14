import java.util.Scanner;

class asd{
    public static void main(String[] args) {
        String kalimat = "kalau dilakukan dengan sepenuh hati maka besi batangan pun kalau digosok terus menerus akan menjadi jarum";
        int foundKalimat = 0;
        String[] kalimatSplit = kalimat.split(" ", -1);
        String[] inputKalimatSplit; 
        Scanner input = new Scanner(System.in);
        System.out.println("Kalimat: " + kalimat + "\n");
        System.out.print("Masukan kalimat untuk dicari: ");
        inputKalimatSplit = input.nextLine().split(" ", -1);

        boolean found = false; 
        for (int i = 0; i < inputKalimatSplit.length && !found; i++) {
            for (int j = 0; j < kalimatSplit.length && !found; j++) {
                if (inputKalimatSplit[i].equals(kalimatSplit[j])) {
                    foundKalimat = i; 
                    found = true;
                }
            }
        }
        
        if (found) {
            System.out.println(inputKalimatSplit[foundKalimat] + " ada di kalimat");
        } else {
            System.out.println("Tidak ditemukan");
        }
    }
}