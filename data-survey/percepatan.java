import java.util.Scanner;

public class percepatan {
    public static void main(String[] args) {
        //1. Header Judul Program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("---- PROGRAM MENGHITUNG PERCEPATAN ----");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //2. Definisikan Variable
        double kecepatanAwal, kecepatanAkhir, waktu, percepatan;

        Scanner scanner = new Scanner(System.in);
        
        //3. Komunikasi input
        System.out.print("Masukkan kecepatan awal (m/s)  : ");
        kecepatanAwal = scanner.nextDouble();

        System.out.print("Masukkan kecepatan akhir (m/s) : ");
        kecepatanAkhir = scanner.nextDouble(); 

        System.out.print("Masukkan waktu (s)             : ");
        waktu = scanner.nextDouble();

        //4. Proses pengolahan
        percepatan = (kecepatanAkhir - kecepatanAwal) / waktu;
        //5. Output hasil
        System.out.println("Percepatan yang dihasilkan adalah: " + percepatan + " m/s²");
        //6.Footer
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Copyright : Destha Satrio, 2025");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
    }
    
}