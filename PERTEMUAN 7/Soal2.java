import java.util.Scanner;

class KonversiSuhu {
    // Method untuk mengonversi Fahrenheit ke Celcius
    double fahrenheitKeCelcius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5 / 9;
    }
}

public class Soal2 {
    public static void main(String[] args) {
        // Membuat objek KonversiSuhu
        KonversiSuhu konversi = new KonversiSuhu();

        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai Fahrenheit
        System.out.print("Masukkan nilai Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Menghitung konversi ke Celcius
        double celcius = konversi.fahrenheitKeCelcius(fahrenheit);

        // Menampilkan hasil
        System.out.printf("Nilai Fahrenheit: %.2f\n", fahrenheit);
        System.out.printf("Nilai Celcius: %.4f\n", celcius);

        // Menutup Scanner
        input.close();
    }
}