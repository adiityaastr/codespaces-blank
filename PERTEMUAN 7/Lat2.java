import java.util.Scanner;

class Hitung {
    int tambah;

    int seHitung(int nil1, int nil2) {
        tambah = nil1 + nil2;
        return tambah;
    }
}

public class Lat2 {
    public static void main(String[] args) {
        int a, b, hasil;

        Hitung ngitung = new Hitung();
        Scanner input = new Scanner(System.in);

        // Input bilangan pertama
        System.out.print("Masukkan bilangan pertama: ");
        a = input.nextInt();

        // Input bilangan kedua
        System.out.print("Masukkan bilangan kedua: ");
        b = input.nextInt();

        // Menghitung hasil penjumlahan
        hasil = ngitung.seHitung(a, b);

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan: " + hasil);

        // Menutup Scanner
        input.close();
    }
}