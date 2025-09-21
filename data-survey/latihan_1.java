import java.util.Scanner;
public class latihan_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int umur,tiket = 50000;
        String hari = "";
        double total;
        
        System.out.print("Masukkan umur anda : ");
        umur = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan hari contoh (Senin) : ");
        hari = input.nextLine();

        switch (hari){
            case "Senin":
            if (umur<12){
                double diskonAw = tiket * 0.5;
                double diskonAk = diskonAw * 0.1;
                total = tiket - diskonAw - diskonAk;
                System.out.println("Total harga tiket: Rp " + total);
            }else if (umur>=60){
                double diskonAw = tiket * 0.3;
                double diskonAk = diskonAw * 0.1;
                total = tiket - diskonAw - diskonAk;
                System.out.println("Total harga tiket: Rp " + total);
            }else{
                double diskonAk = tiket * 0.1;
                total = tiket - diskonAk;
                System.out.println("Total harga tiket: Rp " + total);
            }break;
            case "Selasa":
            case "Rabu":
            case "Kamis":
            case "Jumat":
            case "Sabtu":
            case "Minggu":

            if (umur<12){
                double diskonAw = tiket * 0.5;
                total = tiket - diskonAw;
                System.out.println("Total harga tiket: Rp " + total);
            }else if (umur>=60){
                double diskonAw = tiket * 0.3;
                total = tiket - diskonAw;
                System.out.println("Total harga tiket: Rp " + total);
            }else{
                System.out.println("Total harga tiket: Rp " + tiket);
            }break;
            default:
            System.out.println("Hari tidak valid, pastikan huruf pertama Alfabet");
        }
        input.close();
    }
}
 