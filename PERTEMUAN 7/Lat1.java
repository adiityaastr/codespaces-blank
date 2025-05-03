class Burung {
    String jenis, nama;
    int usia;
}

class BurungGagak {
    String jenis, nama;
    int usia;
}

public class Lat1 { // Changed class name to match Java conventions
    public static void main(String[] args) {
        Burung burungElang = new Burung(); // Changed variable name to camelCase
        burungElang.jenis = "Elang Jawa";
        burungElang.nama = "Coklat";
        burungElang.usia = 5;

        Burung BurungGagak = new Burung(); // Changed variable name to camelCase
        BurungGagak.jenis = "Gagak Hitam";
        BurungGagak.nama = "Hitam";
        BurungGagak.usia = 3;
        
        System.out.println("=====================================");
        System.out.println("Jenis Burung: " + BurungGagak.jenis);
        System.out.println("Nama Burung: " + BurungGagak.nama);
        System.out.println("Usia Burung: " + BurungGagak.usia);
        System.out.println("=====================================");

        System.out.println("Jenis Burung: " + burungElang.jenis);
        System.out.println("Nama Burung: " + burungElang.nama);
        System.out.println("Usia Burung: " + burungElang.usia);
    }
}