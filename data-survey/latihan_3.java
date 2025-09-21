import java.util.Scanner;

public class latihan_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalbelanja;
        int x = 5000,y = 7000,z = 8000;
        double A,B,C,pajak = 0.2;
        A = input.nextInt();
        A = A * x;
        B = input.nextInt();
        B = B * y;
        C = input.nextInt();
        C = C * z;
        totalbelanja = (A + B + C);
        pajak = totalbelanja * pajak;
        totalbelanja = pajak + totalbelanja;
        System.out.printf("total belanja anda adalah:Rp. %.2f",totalbelanja);
        

        input.close();
    }
}