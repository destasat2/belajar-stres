import java.util.Scanner;

public class genapganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1. Header Judul Program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("----- PROGRAM MENENTUKAN GENAP GANJIL -----");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        //2. Definisikan Variable
        int bilangan;

        Scanner scanner = new Scanner(System.in);

        //3. Komunikasi input
        System.out.print("Masukkan bilangan : ");
        bilangan = scanner.nextInt();
        //4. Proses pengolahan
        if (bilangan % 2 == 0) {
        //5. Output hasil
            System.out.println("Bilangan " + bilangan + " adalah bilangan genap");
        }
        else {
            System.out.println("Bilangan " + bilangan + " adalah bilangan ganjil\n");
        }
        //6.Footer
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Copyright : Destha Satrio, 2025");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        input.close();
    }
    
}