import java.util.Scanner;

public class Looping1 {
    public static void main(String[] args) {
        // ====== 1a. Bilangan Prima dan Bukan Prima ======
        System.out.print("Bilangan Prima: ");
        for (int i = 2; i <= 20; i++) {
            boolean prima = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("Bukan Prima: ");
        for (int i = 0; i <= 20; i++) {
            if (i < 2) {
                System.out.print(i + " ");
                continue;
            }
            boolean prima = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (!prima) System.out.print(i + " ");
        }

        // ====== 1b. Bilangan Genap dan Ganjil ======
        System.out.println("\n");
        System.out.print("Bilangan Genap: ");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("Bilangan Ganjil: ");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }

        // ====== 1c. Huruf Z ke A ======
        System.out.println("\n");
        System.out.println("Huruf dari Z ke A:");
        for (char huruf = 'Z'; huruf >= 'A'; huruf--) {
            System.out.print(huruf + " ");
        }

        // ====== 1d. Lagu Anak Ayam Turun N ======
        System.out.println("\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam: ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            if (i > 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            } else {
                System.out.println("Anak ayam turun 1, mati satu habis semua.");
            }
        }

        input.close();
    }
}
