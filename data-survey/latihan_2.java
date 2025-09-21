import java.util.Scanner;

public class latihan_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jenisFilm = "";
        double hargaTiket = 0, diskon = 0, totalDiskon = 0, totalBayar = 0;
        int jumlahTiket, umur;
        
        System.out.println("PROGRAM PEMESANAN TIKET BIOSKOP");

        // Pilihan jenis film
        System.out.println("Pilih jenis film:");
        System.out.println("1. Regular");
        System.out.println("2. 3D");
        System.out.println("3. IMAX");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihanFilm = input.nextInt();

        switch (pilihanFilm) {
            case 1:
                jenisFilm = "Regular";
                hargaTiket = 50000;
                break;
            case 2:
                jenisFilm = "3D";
                hargaTiket = 75000;
                break;
            case 3:
                jenisFilm = "IMAX";
                hargaTiket = 100000;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        jumlahTiket = input.nextInt();

        System.out.print("Masukkan umur penonton: ");
        umur = input.nextInt();

        // Hitung diskon berdasarkan umur dan jenis film
        if (umur < 12) {
            if (jenisFilm.equals("IMAX")) {
                diskon = 0.4; // Anak-anak IMAX
            } else {
                diskon = 0.5; // Anak-anak Regular & 3D
            }
        } else if (umur > 60) {
            if (jenisFilm.equals("IMAX")) {
                diskon = 0.2; // Lansia IMAX
            } else {
                diskon = 0.3; // Lansia Regular & 3D
            }
        } else {
            diskon = 0.0; // Dewasa
        }

        totalDiskon = hargaTiket * diskon * jumlahTiket;
        totalBayar = (hargaTiket * jumlahTiket) - totalDiskon;

        // Output rincian pembayaran
        System.out.println("\n--- Rincian Pembayaran ---");
        System.out.println("Jenis Film       : " + jenisFilm);
        System.out.println("Jumlah Tiket     : " + jumlahTiket);
        System.out.println("Harga per Tiket  : Rp " + (int)hargaTiket);
        System.out.println("Diskon per Tiket : " + (int)(diskon * 100) + "%");
        System.out.println("Total Diskon     : Rp " + (int)totalDiskon);
        System.out.println("Total yang harus dibayar: Rp " + (int)totalBayar);
    }
}
