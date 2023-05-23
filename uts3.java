//Mawar Ahdayani Samual
//227064516023

import java.util.Scanner;

public class uts3 {
    public static void main(String[] args) {
        // Kategori tiket yang tersedia
        String[] categories = {"Category 1", "Category 2", "Category 3", "Category 4"};
        int[] prices = {5000000, 4000000, 3250000, 2500000};

        // Cetak kategori tiket yang tersedia
        System.out.println("Kategori tiket yang tersedia:");
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i] + " (Rp" + prices[i] + ")");
        }

        // Mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih kategori tiket (1-4): ");
        int categoryIndex = scanner.nextInt() - 1; // Mengubah input pengguna menjadi indeks array
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int quantity = scanner.nextInt();

        // Membuat invoice pembelian
        System.out.println("=============================================");
        System.out.println("INVOICE PEMBELIAN");
        System.out.println("=============================================");
        System.out.println("Kategori Tiket: " + categories[categoryIndex]);
        System.out.println("Jumlah Tiket  : " + quantity);
        int totalPrice = prices[categoryIndex] * quantity;
        System.out.println("Harga Tiket   : Rp" + totalPrice);
        System.out.println("=============================================");

        // Mengambil input jumlah uang yang akan dibayarkan
        System.out.print("Masukkan jumlah uang yang akan dibayarkan: ");
        int amountPaid = scanner.nextInt();

        // Menghitung kembalian
        int change = amountPaid - totalPrice;
        System.out.println("Kembalian     : Rp" + change);
        System.out.println("=============================================");
    }
}
