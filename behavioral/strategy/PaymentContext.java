package behavioral.strategy;

/**
 * Kelas PaymentContext
 * 
 * Ini adalah kelas konteks dalam pola Strategy.
 * Mempertahankan referensi ke objek strategi dan
 * mendelegasikan pekerjaan ke objek strategi.
 */
public class PaymentContext {
    // Strategi pembayaran saat ini
    private PaymentStrategy strategy;

    /**
     * Konstruktor untuk PaymentContext
     * 
     * @param strategy Strategi pembayaran awal yang akan digunakan
     */
    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Mengubah strategi pembayaran
     * 
     * @param strategy Strategi pembayaran baru yang akan digunakan
     */
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Memproses pembayaran menggunakan strategi saat ini
     * 
     * @param amount Jumlah yang akan dibayar
     */
    public void pay(double amount) {
        System.out.println("Metode pembayaran: " + strategy.getPaymentMethod());
        strategy.pay(amount);
    }
} 