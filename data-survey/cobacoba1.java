import java.util.Scanner;

public class cobacoba1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

         while (true) { 
        System.out.println("======== Kalkulator Sederhana ========");
        System.out.print("Masukkan angka pertama        : ");
        angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, ^): ");
        operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua          : ");
        angka2 = input.nextDouble();
        boolean valid = true; 

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil                 : " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil                 : " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil                 : " + hasil);
            case '^':
                hasil = Math.pow (angka1, angka2);
                System.out.println("Hasil                 : " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil             : " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan angka nol tidak diperbolehkan.");
                    valid = false; 
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                valid = false; 
            }

           
            if (valid) {
                System.out.print("Hitung lagi? (y/n): ");
                char ulang = input.next().charAt(0);
                if (ulang == 'n' || ulang == 'N') {
                    System.out.println("Terima kasih, program selesai.");
                    break;
                }
            } else {
                System.out.println("Silakan coba lagi dari awal.\n");
        }
    }
        input.close();
    }
}
