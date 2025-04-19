/* --------------------------
Nama File : Latihan5.java
Author : Danna
---------------------------- */
import java.util.*;
class Lat5{
    public static void main(String[] args){
        int kode;
        String nmbarang;

        Scanner input = new Scanner(System.in);

        System.out.println("Daftar Barang");
        System.out.println("A. Alat Olah Raga");
        System.out.println("B. Alat Elektronik");
        System.out.println("C. Alat Masak");
        System.out.println("====================================");
        System.out.print("Masukan kode barang [A..C] :");
        System.out.println("====================================");
        kode = input.nextInt();
        System.out.println("====================================");
        System.out.println("Kode Barang yang anda pilih : " + kode);
        System.out.println("====================================");

        switch (kode) {
        case 1:
            nmbarang = "Alat Olah Raga";
        break;
        case 2:
            nmbarang = "Alat Elektronik";
        break;
        case 3:
            nmbarang = "Alat Masak";
        break;
        default:
            nmbarang = "Anda salah masukan kode";
        break;
    }
        System.out.println("\n Kode yang anda pilih : "+ nmbarang);
    }
}