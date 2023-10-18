import java.util.Scanner;

public class Toko05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*****Program Toko*****");
        System.out.print("Masukkan Nama Pelanggan:");
        String nama = sc.nextLine();

        System.out.println("Apakah Pelanggan adalah Member? (y/t)");
        boolean isMember = sc.nextLine().equalsIgnoreCase("y");

        double totalSebelumDiskon = 0;
        double totalDiskonProduk = 0;
        int totalItem = 0;

        while (true) {
            System.out.print("Masukkan Nama Produk: ");
            String namaProduk = sc.nextLine();

            System.out.print("Jumlah produk: ");
            int kuantitasProduk = sc.nextInt();

            System.out.print("Harga: ");
            double hargaProduk = sc.nextDouble();

            System.out.print("Masukkan Diskon (%): ");
            double diskonProduk = sc.nextDouble();
            sc.nextLine();

            double subtotal = kuantitasProduk * hargaProduk * (1 - diskonProduk / 100);
            totalSebelumDiskon += subtotal;
            totalDiskonProduk += kuantitasProduk * hargaProduk * diskonProduk / 100;
            totalItem += kuantitasProduk;

            System.out.println("Apakah Ingin Tambah Produk? (y/t)");
            if (!sc.nextLine().equalsIgnoreCase("y")) {
                break;
            }
        }

        double diskonMember = isMember ? (totalSebelumDiskon >= 200000 ? 0.1 : 0.05) : 0;
        double totalDiskon = totalDiskonProduk + totalSebelumDiskon * diskonMember;
        double totalAkhir = totalSebelumDiskon - totalSebelumDiskon * diskonMember;

        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Tipe: " + (isMember ? "Member" : "Bukan Member"));
        System.out.println("Total Item Barang yang Dibeli: " + totalItem);
        System.out.println("Total Harga Sebelum Diskon: " + totalSebelumDiskon);
        System.out.println("Total Diskon: " + totalDiskon);
        System.out.println("Total Akhir yang Harus Dibayar Pelanggan: " + totalAkhir);
    }
}
