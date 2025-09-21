import java.util.*;

public class praktikum2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
        int pengurangan, perkalian;
        double persen, penjumlahan;
        String nama, kelurahan;

        System.out.println("Program penghitung pemakaian listrik sederhana");
        System.out.println("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.println("Kelurahan : ");
        kelurahan = input.nextLine();
        System.out.println("Masukkan posisi awal Kwh Meter : ");
        a = input.nextInt();
        System.out.println("Masukkan posisi akhir Kwh Meter : ");
        b = input.nextInt();
        pengurangan = b - a;
        System.out.println("Masukkan biaya beban saat ini : ");
        c = input.nextInt();
        System.out.println("Masukkan PPJ (dalam persen) : ");
        d = input.nextInt();
        persen = (double) d / 100 * c;
        System.out.println("===================PLN Java===================");
        penjumlahan = c + persen;
        
        System.out.println("Nama : " + nama);
        System.out.println("Kelurahan : " + kelurahan);
        System.out.println("Pemakaian bulan ini : " + pengurangan);
        System.out.println("Tarif Listrik : " + c);
        System.out.println("PPJ 10% : " + persen);
        System.out.println("Total Bayar : " + penjumlahan);
        System.out.println("==============================================");
    }
}
