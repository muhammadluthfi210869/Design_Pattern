package structural.adapter;

/**
 * Interface PaymentProcessor
 * 
 * Interface ini merepresentasikan sistem pembayaran baru yang ingin kita gunakan.
 * Ini adalah bagian dari pola Adapter di mana kita mendefinisikan interface target
 * yang akan diimplementasikan oleh adapter.
 */
public interface PaymentProcessor {
    /**
     * Memproses pembayaran dengan jumlah dan mata uang yang ditentukan
     * 
     * @param amount Jumlah yang akan dibayar
     * @param currency Mata uang pembayaran
     */
    void processPayment(double amount, String currency);

    /**
     * Mendapatkan status pembayaran saat ini
     * 
     * @return String yang berisi informasi status pembayaran
     */
    String getPaymentStatus();
} 