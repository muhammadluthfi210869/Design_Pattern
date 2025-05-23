package behavioral.strategy;

/**
 * Interface PaymentStrategy
 * 
 * Interface ini mendefinisikan strategi dalam pola Strategy.
 * Mendeklarasikan operasi yang harus diimplementasikan oleh semua
 * strategi pembayaran konkret.
 */
public interface PaymentStrategy {
    /**
     * Memproses pembayaran dengan jumlah yang ditentukan
     * 
     * @param amount Jumlah yang akan dibayar
     */
    void pay(double amount);

    /**
     * Mendapatkan nama metode pembayaran
     * 
     * @return Nama metode pembayaran
     */
    String getPaymentMethod();
} 