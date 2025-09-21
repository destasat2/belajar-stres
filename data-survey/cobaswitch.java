/*
Nama Destha Satrio Nugraha
NIM 255150401111055
*/
import java.util.Scanner;
public class cobaswitch{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int pilihan, open, open1, open2;
        double panjang, lebar, jarilingkaran, keliling, luas, sisi, diameter;
        double a, b, r; //sisi segitiga
        double s;//Setengah keliling untuk menghitung luas lingkaran

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~ Program Menghitung Luas dan Keliling ~~~~~\n");
        System.out.println("Menu :");
        System.out.println("1. Menghitung luas dan keliling persegi");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga \n");
        System.out.print("Masukkan pilihan (1/2/3) : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Menu : \n");
                System.out.println("1. Menghitung luas dan keliling persegi panjang");
                System.out.println("2. Menghitung luas dan keliling persegi");
                System.out.print("Masukkan pilihan (1/2) : ");
                open = input.nextInt();
            switch (open) {
                case 1:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Menghitung luas dan keliling persegi panjang\n");
                System.out.print("Masukkan panjang : ");
                panjang = input.nextDouble();
                System.out.print("Masukkan lebar   : ");
                lebar = input.nextDouble();
                luas = panjang * lebar;
                keliling = 2 * (panjang + lebar);
                System.out.printf("Luas persegi panjang adalah %.2f cm²\n" , luas);
                System.out.printf("Keliling persegi panjang adalah %.2f cm\n" , keliling);
                break;
                case 2:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Menghitung luas dan keliling persegi");
                System.out.print("Masukkan sisi : ");
                sisi = input.nextDouble();
                luas = sisi * sisi;
                keliling = 4 * sisi;
                System.out.printf("Luas persegi panjang adalah %.2f cm²\n" , luas);
                System.out.printf("Keliling persegi panjang adalah %.2f cm\n" , keliling);
                break;
            default:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Data tak ditemukan, program dihentikan ...");}
                break;
            case 2:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Menu : \n");
                System.out.println("1. Menghitung luas dan keliling lingkaran jika diketahui jari-jarinya");
                System.out.println("2. Menghitung luas dan keliling lingkaran jika diketahui diameternya");
                System.out.print("Masukkan pilihan (1/2) : ");
                open1 = input.nextInt();
            switch (open1) {
                case 1:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Menghitung luas dan keliling lingkaran jika diketahui jari-jarinya");
                System.out.print("Masukkan Jari-jari lingkaran : ");
                jarilingkaran = input.nextDouble();
                luas = 3.14 * jarilingkaran * jarilingkaran;
                keliling = 2 * 3.14 * jarilingkaran;
                System.out.printf("Luas lingkaran adalah %.2f cm²\n" , luas);
                System.out.printf("Luas keliling lingkaran adalah %.2f cm\n" , keliling);
                break;
                case 2: 
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Menghitung luas dan keliling lingkaran jika diketahui diameternya");
                System.out.print("Masukkan diameter lingkaran : ");
                diameter = input.nextDouble();
                luas = 0.25 * 3.14 * (diameter * diameter);
                keliling = 3.14 * diameter;
                System.out.printf("Luas lingkaran adalah %.2f cm²\n" , luas);
                System.out.printf("Luas keliling lingkaran adalah %.2f cm\n" , keliling);
                break;
            default:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Data tak ditemukan, program dihentikan ...");}
                break;
            case 3:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Menu : \n");
                System.out.println("1. Menghitung luas dan keliling segitiga jika diketahui sisi-sisi saja");
                System.out.println("2. Menghitung luas dan keliling segitiga siku-siku");
                System.out.print("Masukkan pilihan (1/2) : ");
                open2 = input.nextInt();
            switch (open2) {
                case 1:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Menghitung luas dan keliling segitiga jika diketahui sisi-sisi saja");
                System.out.print("Masukkan a (sisi segitiga) : ");
                a = input.nextDouble();
                System.out.print("Masukkan b (sisi segitiga) : ");
                b = input.nextDouble();
                System.out.print("Masukkan r (sisi segitiga) : ");
                r = input.nextDouble();
                keliling = a + b + r;
                s = keliling / 2;
                luas = Math.sqrt(s * (s - a) * (s - b) * (s - r));
                System.out.printf("Luas segitiga adalah %.2f cm²\n" , luas);
                System.out.printf("Keliling segitiga adalah %.2f cm\n" , keliling);
                break;
                case 2:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Menghitung luas dan keliling segitiga siku-siku");
                System.out.print("Masukkan tinggi (cm)     : ");
                a = input.nextDouble();
                System.out.print("Masukkan alas (cm)       : ");
                b = input.nextDouble();
                System.out.print("Masukkan r (sisi miring) : ");
                r = input.nextDouble();
                keliling = a + b + r;
                luas = a * b / 2;
                System.out.printf("Luas segitiga adalah %.2f cm²\n" , luas);
                System.out.printf("Keliling segitiga adalah %.2f cm\n" , keliling);
                break;
            default:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Data tak ditemukan, program dihentikan ...");}
                break;
            default:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Data tak ditemukan, program dihentikan ...");
                } 
        input.close();
    }
}
    



    


