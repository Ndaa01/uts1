import java.util.Scanner;

public class HitungIP05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*****Program Hitung IP*****");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Jumlah Mata Kuliah:");
        int jumlahMk = input.nextInt();
        input.nextLine();

        double totalNilai = 0;
        int totalSks = 0;
        int jumlahRemidi = 0;

        for (int i = 0; i < jumlahMk; i++) {
            System.out.print("Masukkan Nama Mata Kuliah: ");
            String namaMk = input.nextLine();

            System.out.print("Masukkan Jumlah SKS: ");
            int sks = input.nextInt();
            input.nextLine();

            System.out.print("Masukkan Nilai: ");
            String nilai = input.nextLine();

            double konversiNilai;
            switch (nilai) {
                case "A": konversiNilai = 4.0; break;
                case "B+": konversiNilai = 3.5; break;
                case "B": konversiNilai = 3.0; break;
                case "C+": konversiNilai = 2.5; break;
                case "C": konversiNilai = 2.0; break;
                case "D": konversiNilai = 1.0; break;
                case "E": konversiNilai = 0.0; break;
                default: throw new IllegalArgumentException("Nilai Tidak Valid");
            }
           
            if (nilai.equals("D") || nilai.equals("E")) {
                jumlahRemidi++;
            }

            totalNilai += konversiNilai * sks;
            totalSks += sks;
        }

        double ip = totalSks > 0 ? totalNilai / totalSks : 0;

        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Indeks Prestasi (IP): " + ip);
        System.out.println("Total Mata Kuliah: " + jumlahMk);
        System.out.println("Total SKS: " + totalSks);
        System.out.println("Jumlah Mata Kuliah yang Harus Diperbaiki/Remidi: " + jumlahRemidi);
    }
}
