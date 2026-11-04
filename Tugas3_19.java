import java.util.Scanner;

public class Tugas3_19 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jmlToko = sc.nextInt();

        if (jmlToko < 1) {
            System.out.println("Jumlah toko minimal 1!");
        } else {
            int totalSemua = 0;
            int barangTertinggi = -1;
            int tokoTerbanyak = 0;

            int toko = 1;
            while (toko <= jmlToko) {
                int pelanggan;
                do {
                    System.out.print("Toko " + toko + " - jumlah pelanggan: ");
                    pelanggan = sc.nextInt();
                    if (pelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (pelanggan < 0);

                int totalBarangToko = 0;
                for (int p = 1; p <= pelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("  Pelanggan " + p + " - jumlah barang: ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }

                System.out.println("Toko " + toko + " - pelanggan: " + pelanggan
                        + ", total barang: " + totalBarangToko);
                totalSemua += totalBarangToko;

                if (totalBarangToko > barangTertinggi) {
                    barangTertinggi = totalBarangToko;
                    tokoTerbanyak = toko;
                }
                toko++;
            }

            System.out.println("Total barang seluruh toko: " + totalSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}
