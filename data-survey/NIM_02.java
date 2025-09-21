/*
Nama Destha Satrio Nugraha
NIM 255150401111055
*/
import java.util.*;
public class NIM_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tinggi, IMT;
        int berat;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~ Program Menghitung IMT (Indeks Massa Tubuh) ~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        System.out.print("Masukkan berat badan (kg): ");
        berat = input.nextInt();

        System.out.print("Masukkan tinggi badan (m): ");//menggunakan koma
        tinggi = input.nextDouble();

        IMT = berat / (tinggi * tinggi);
        if (IMT <= 18.5) {
            System.out.printf("Jadi IMT anda adalah %.2f\n" , IMT);
            System.out.println("Mohon maaf, Anda termasuk kurus. Ayo makan lebih banyak tetapi tetap perhatikan gizi lengkap dan seimbang Yaa");
        } else {
            if (IMT > 18.5 && IMT <= 25) {
                System.out.printf("Jadi IMT anda adalah %.2f\n" , IMT);
                System.out.println("Uwow, Anda termasuk normal. Pertahankan pola makan dan gaya hidup sehat!");
            } else {
                if (IMT > 25 && IMT <= 30) {
                    System.out.printf("Jadi IMT anda adalah %.2f\n" , IMT);
                    System.out.println("Anda termasuk gemuk. Mulailah atur pola makan dan rajin olahraga!");
                } else {
                    System.out.printf("Jadi IMT anda adalah %.2f\n" , IMT);
                    System.out.println("Anda termasuk kegemukan. Yuk, jaga kesehatan dengan diet seimbang dan olahraga teratur!");
                }
            }
        }
        input.close();
    }
}
