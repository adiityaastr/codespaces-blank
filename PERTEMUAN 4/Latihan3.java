import java.util.Scanner; // Import Scanner for user input

class Latihan3 {
    public static void main(String[] args) {
        int pendapatan;
        double jasa, komisi, total;

        // Deklarasi objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan pendapatan sales Rp.");
        pendapatan = input.nextInt();

        // Struktur if-else untuk menghitung jasa dan komisi
        if (pendapatan >= 0 && pendapatan <= 200000) {
            jasa = 10000;
            komisi = 0.1 * pendapatan;
        } else if (pendapatan <= 500000) {
            jasa = 20000;
            komisi = 0.15 * pendapatan;
        } else {
            jasa = 30000;
            komisi = 0.2 * pendapatan;
        }

        // Menghitung total pendapatan
        total = komisi + jasa;

        // Menampilkan hasil
        System.out.println("\nUang jasa Rp. " + (int) jasa);
        System.out.println("Uang Komisi Rp. " + (int) komisi);
        System.out.println("====================================");
        System.out.println("Uang Total Rp. " + (int) total);

        // Menutup Scanner
        input.close();
    }
}
