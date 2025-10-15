import java.util.Scanner;

public class Looping2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n (maks 10): ");
        int n = input.nextInt();

        System.out.println("Tabel Perkalian " + n + " x " + n + ":");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
        input.close();
    }
}
