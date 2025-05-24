class hitung {
    private int c = 8;

    public int getVAR() {
        return this.c;
    }
}

class Lat2 {
    public static void main(String[] args) {
        hitung tambah = new hitung();
        System.out.println("Hasil Pertambahan = " + tambah.getVAR());
    }
}