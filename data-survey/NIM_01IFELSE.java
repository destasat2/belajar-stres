/*
Nama Destha Satrio Nugraha
NIM 255150401111055
*/
import java.util.Scanner;
public class NIM_01IFELSE{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int pilihan;
        double panjang, lebar, jarilingkaran, keliling, luas;
        double a, b, r; //sisi segitiga
        double s;//Setengah keliling untuk menghitung luas lingkaran

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~ Program Menghitung Luas dan Keliling ~~~~~\n");
        System.out.println("Menu :");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga \n");
        System.out.print("Masukkan pilihan (1/2/3) : ");
        pilihan = input.nextInt();
        if (pilihan == 1) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Menghitung luas dan keliling persegi panjang\n");
            System.out.print("Masukkan panjang : ");
            panjang = input.nextDouble();
            System.out.print("Masukkan lebar   : ");
            lebar = input.nextDouble();
            luas = panjang * lebar;
            keliling = 2 * panjang + lebar;
            System.out.println("Luas persegi panjang adalah " + luas + " cm²");
            System.out.println("Keliling persegi panjang adalah " + keliling + " cm");
        } else {
            if (pilihan == 2) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Menghitung luas dan keliling lingkaran");
                System.out.print("Masukkan Jari-jari lingkaran : ");
                jarilingkaran = input.nextDouble();
                luas = 3.14 * jarilingkaran * jarilingkaran;
                keliling = 2 * 3.14 * jarilingkaran;
                System.out.println("Luas lingkaran adalah " + luas + " cm²");
                System.out.println("Luas keliling lingkaran adalah " + keliling + " cm");
            } else {
                if (pilihan == 3) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Menghitung luas dan keliling segitiga");
                    System.out.print("Masukkan a (sisi segitiga) : ");
                    a = input.nextDouble();
                    System.out.print("Masukkan b (sisi segitiga) : ");
                    b = input.nextDouble();
                    System.out.print("Masukkan r (sisi segitiga) : ");
                    r = input.nextDouble();
                    keliling = a + b + r;
                    s = keliling / 2;
                    luas = Math.sqrt(s * (s - a) * (s - b) * (s - r));
                    System.out.println("Luas segitiga adalah " + luas + " cm²");
                    System.out.println("Keliling segitiga adalah " + keliling + " cm");

                    input.close();
                } else {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Data tak ditemukan, program dihentikan ...");
                } 
            }
        }
    }
}


    


