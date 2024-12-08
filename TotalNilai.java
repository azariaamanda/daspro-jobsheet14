import java.util.Scanner;
public class TotalNilai {
    
    public static int hitungRekursif(int[] angka, int n) {
        if (n == 0) {
            return 0;
        }
        return angka[n - 1] + hitungRekursif(angka, n - 1);
    }
    public static int hitungIteratif(int[] angka, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) { 
            total += angka[i];
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc2.nextInt();

        int[] angka = new int[n];
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[n - i] = sc2.nextInt();
        }
    
        int totalRekursif = hitungRekursif(angka, n);
        System.out.println("Total dari " + n + " angka menggunakan rekursi adalah: " + totalRekursif);

        int totalIteratif = hitungIteratif(angka, n);
        System.out.println("Total dari " + n + " angka menggunakan iterasi adalah: " + totalIteratif);
    }    
}
