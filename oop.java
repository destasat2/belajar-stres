// Contoh dasar OOP: Membuat class dan objek
class Mobil {
    // Properti
    String merk;
    int tahun;

    // Konstruktor
    Mobil(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    // Method
    void info() {
        System.out.println("Merk: " + merk + ", Tahun: " + tahun);
    }
}

public class oop {
    public static void main(String[] args) {
        // Membuat objek dari class Mobil
        Mobil mobil1 = new Mobil("Toyota", 2020);
        mobil1.info();

        Mobil mobil2 = new Mobil("Honda", 2022);
        mobil2.info();
    }
}

System.out.println("Hello, World!"); // Menampilkan teks ke layar
System.out.println("bububaba bububaba"); // Menampilkan teks lain