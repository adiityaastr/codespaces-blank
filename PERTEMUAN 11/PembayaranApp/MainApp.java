public class MainApp {
    
    public static void main(String[] args) {
        Pembayaran method1 = new TransferBank();
        Pembayaran method2 = new Ewallet();
        Pembayaran method3 = new COD();

        method1.prosesPembayaran(100000);
        method2.prosesPembayaran(200000);
        method3.prosesPembayaran(300000);
    }
}