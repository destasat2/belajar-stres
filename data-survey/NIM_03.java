/*
Nama Destha Satrio Nugraha
NIM 255150401111055
*/
import java.util.Scanner;
public class NIM_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jamKerja, total, upah, lembur, denda;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~ Program Menghitung Total Upah dari Pegawai ~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.print("Masukkan jumlah jam kerja : ");
        jamKerja = input.nextInt();
        if (jamKerja > 60) {
            upah = 60 * 5000;
            lembur = (jamKerja - 60) * 6000;
            denda = 0;
        } else {
            if (jamKerja < 50) {
                upah = jamKerja * 5000;
                lembur = 0;
                denda = (50 - jamKerja) * 1000;
            } else { 
                    upah = jamKerja * 5000;
                    lembur = 0;
                    denda = 0;

            }
        }
        total = upah + lembur - denda;
        System.out.println("Jam kerja : " + jamKerja);
        System.out.println("Upah      = Rp. " + upah);
        System.out.println("Lembur    = Rp. " + lembur);
        System.out.println("Denda     = Rp. " + denda);
        System.out.println("-------------------------");
        System.out.println("Total = Rp. " + total);
        input.close();
    }
}
