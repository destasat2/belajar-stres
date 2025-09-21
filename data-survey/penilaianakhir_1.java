import java.util.Scanner;

public class penilaianakhir_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1. Header Judul Program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("-------- PROGRAM PENILAIAN AKHIR --------");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //2. Definisikan Variable
        int kehadiran,nilaiak,uas;
        double perhadir;
        String nilaiHuruf = "";

        //3. Komunikasi input
        System.out.print("Masukkan jumlah kehadiran : ");
        kehadiran = in.nextInt();
        perhadir = (kehadiran/14.0)*100.0;
        System.out.print("Masukkan nilai akhir : ");
        nilaiak = in.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        uas = in.nextInt();
        //4. Proses pengolahan
        if (perhadir < 70.0) {
            nilaiHuruf = "E";
        } else if (nilaiak >= 85 && uas >= 50) {
            nilaiHuruf = "A";
        } else if (nilaiak <= 84 && nilaiak >= 70 && uas >= 50) {
            nilaiHuruf = "B";
        } else if (nilaiak <= 69 && nilaiak >= 55 && uas >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiak <= 54 && nilaiak >= 50 && uas >= 50) {
            nilaiHuruf = "D";
        } else if (nilaiak < 50 && uas >= 50) {
            nilaiHuruf = "E";
        } else if (nilaiak >= 85 && uas < 50) {
            nilaiHuruf = "B";
        } else if (nilaiak <= 84 && nilaiak >= 70 && uas < 50) {
            nilaiHuruf = "C";
        } else if (nilaiak <= 69 && nilaiak >= 55 && uas < 50) {
            nilaiHuruf = "D";
        } else if (nilaiak <= 54 && nilaiak >= 50 && uas < 50) {
            nilaiHuruf = "E";
        }
        //5. Output hasil
        System.out.println("Nilai huruf : " + nilaiHuruf);
        if (nilaiHuruf.equals("E")) {
            System.out.println("Status: Gagal");
        } else {
            System.out.println("Status: Lulus");
        }
        //6.Footer
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Copyright : Destha Satrio, 2025");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
    }
    
}