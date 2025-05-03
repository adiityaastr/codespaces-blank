class Burung {
    String jenis, nama;
    int usia;

    // Constructor with corrected name and parameters
    Burung(String jenis, String nama, int usia) {
        this.jenis = jenis;
        this.nama = nama;
        this.usia = usia;
    }

    // Method to display bird information
    void tampilkanInfo() {
        System.out.println("Jenis Burung: " + jenis);
        System.out.println("Nama Burung: " + nama);
        System.out.println("Usia Burung: " + usia);
    }
}

public class Lat1 {
    public static void main(String[] args) {
        
        // Create a Burung object
        new Burung("Elang Jawa", "Coklat", 5);

        // Display bird information 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("Burung ke-" + (i + 1));
            burung.tampilkanInfo();
        }
    }
}