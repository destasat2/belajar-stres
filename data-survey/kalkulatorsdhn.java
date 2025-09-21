import java.util.Scanner;

public class kalkulatorsdhn {
    public static void main(String[] args) {
        
        //1. Header Judul Program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("--------- PROGRAM KALKULATOR ---------");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //2. Definisikan Variable
        double angka1, angka2, hasil;
        char operasi;
    
        Scanner scanner = new Scanner(System.in);
        //3. Komunikasi Input
        System.out.println("======== Kalkulator Sederhana ========");
        System.out.print("Masukkan bilangan 1              : ");
        angka1 = scanner.nextDouble();

        System.out.print("Masukkan bilangan 2              : ");
        angka2 = scanner.nextDouble();

        System.out.print("Masukkan operasi (+, -, x, /, ^) : ");
        operasi = scanner.next().charAt(0);
        
        
        //4. Proses pengolahan & 5. Output hasil
        switch (operasi) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil dari penjumlahan " + (int)angka1 +" dan " + (int) angka2 +": " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil dari pengurangan "+ (int)angka1 +" dan " + (int) angka2 +": " + hasil);
                break;
            case 'x':
                hasil = angka1 * angka2;
                System.out.println("Hasil dari perkalian "+ (int)angka1 +" dan " + (int) angka2 +" : " + hasil);
                break;
            case '^':
                hasil = Math.pow (angka1, angka2);
                System.out.println("Hasil dari pangkat "+ (int)angka1 +" dan " + (int) angka2 +": " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.printf("Hasil dari pembagian "+ (int)angka1 +" dan " + (int) angka2 +"    : %.2f\n" ,hasil );
                } else {
                    System.out.println("Error : Pembagian dengan angka 0 tidak dapat dilakukan......");
                }
                break;
            default:
                System.out.println("Operator tidak valid!"); 
            }
        //6.Footer
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Copyright : Destha Satrio, 2025");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
    }
    
}