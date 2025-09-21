import java.util.Scanner;
public class studicase1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double diskon, total;
        String member;
        int harga;

        System.out.print("Masukkan jumlah harga barang  : ");
        harga = input.nextInt();
        input.nextLine();
        System.out.print("Apakah anda anggota member? (ya/tidak) : ");
        member = input.nextLine();

        if (member.equals("ya")){
            if (harga<=100000) {
                diskon = harga * 0.1;
            }else{
                diskon = harga * 0.2;
            }
            total = harga - diskon;
            System.out.println("Total harga setelah diskon : "+ total);
        }
        if (member.equals("tidak")){
            if (harga>100000) {
                diskon = harga * 0.05;
            }else{ 
                diskon = harga * (10 / 100);
            }
            total = harga - diskon;
            System.out.println("Total harga setelah diskon : "+ total);
        }
     }
}


