import java.util.Scanner;

public class Lingkaran {
    private double radius;

    public Lingkaran(double r) {
        radius = r;
    }

    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }

    public void cetakhasil() {
        System.out.println("Radius      : " + radius);
        System.out.println("Luas        : " + hitungLuas());
        System.out.println("Keliling    : " + hitungKeliling());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai radius: ");
        double r = input.nextDouble();

        Lingkaran lingkaran1 = new Lingkaran(r);

        lingkaran1.cetakhasil();

        input.close();
    }
}
