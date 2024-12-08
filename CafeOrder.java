import java.util.Scanner;

public class CafeOrder {

    // Fungsi rekursif untuk menghitung total harga pesanan
    public static int hitungTotalRekursif(int[] pesanan, int index) {
        if (index == pesanan.length) {
            return 0;
        } else {
            return pesanan[index] + hitungTotalRekursif(pesanan, index + 1);
        }
    }

    // Fungsi iteratif untuk menghitung total harga pesanan
    public static int hitungTotalIteratif(int[] pesanan) {
        int total = 0;
        for (int harga : pesanan) {
            total += harga;
        }
        return total;
    }

    // Program utama
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] hargaMenu = {20000, 12000, 10000, 15000};

        System.out.println("Masukkan jumlah pesanan untuk setiap item menu:");
        System.out.print("1. Kopi (Rp20.000) : ");
        int kopi = scanner.nextInt();
        System.out.print("2. Teh (Rp12.000) : ");
        int teh = scanner.nextInt();
        System.out.print("3. Cireng (Rp10.000) : ");
        int cireng = scanner.nextInt();
        System.out.print ("4. Kentang Goreng (Rp15.000) : ");
        int kentang = scanner.nextInt();

        // Hitung total pesanan
        int[] pesanan = {kopi * hargaMenu[0], teh * hargaMenu[1], cireng * hargaMenu[2], kentang * hargaMenu[3]};

        // Menggunakan fungsi rekursif
        int totalRekursif = hitungTotalRekursif(pesanan, 0);
        // Menggunakan fungsi iteratif
        int totalIteratif = hitungTotalIteratif(pesanan);

        System.out.println("Total harga pesanan sebelum diskon (rekursif): Rp" + totalRekursif);
        System.out.println("Total harga pesanan sebelum diskon (iteratif): Rp" + totalIteratif);

        // Penerapan diskon jika total harga lebih dari Rp100.000
        if (totalRekursif > 100000) {
            double totalSetelahDiskon = totalRekursif * 0.9;
            System.out.println("Total harga pesanan setelah diskon (rekursif): Rp" + totalSetelahDiskon);
        }
        if (totalIteratif > 100000) {
            double totalSetelahDiskon = totalIteratif * 0.9;
            System.out.println("Total harga pesanan setelah diskon (iteratif): Rp" + totalSetelahDiskon);
        }

        scanner.close();
    }
}
