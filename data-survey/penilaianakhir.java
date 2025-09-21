import java.util.Scanner;
public class penilaianakhir {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Masukkan jumlah kehadiran : ");
        int kehadiran = in.nextInt();
        double perhadir = (kehadiran/14.0)*100.0;
        System.out.print("Masukkan nilai akhir : ");
        int nilaiak = in.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        int uas = in.nextInt();

        if (perhadir<70.0){
            System.out.println("Nilai huruf : E");
            System.out.println("Gagal");
        }else if (nilaiak>=85){
            System.out.println("Nilai huruf : A");
        }else if (nilaiak <= 84 && nilaiak >= 70){
            System.out.println("Nilai huruf : B");
        }else if (nilaiak <= 69 && nilaiak >= 55){
            System.out.println("Nilai huruf : C");
        }else if (nilaiak <= 54 && nilaiak >= 50){
            System.out.println("Nilai huruf : D");
        }else if (nilaiak < 50){
            System.out.println("Nilai huruf : E");
            System.out.println("Gagal");
        }else if (nilaiak>=85 && uas < 50){
            System.out.println("Nilai huruf : B");
        }else if (nilaiak<= 84 && nilaiak >= 70 && uas<50){
            System.out.println("Nilai huruf : C");
        }else if (nilaiak<= 69 && nilaiak >= 50 && uas<50){
            System.out.println("Nilai huruf : D");
        }else if (nilaiak <= 54 && nilaiak >= 50 && uas<50){
            System.out.println("Nilai huruf : E");
            System.out.println("Gagal");
        }
        in.close();
    }
    
}
