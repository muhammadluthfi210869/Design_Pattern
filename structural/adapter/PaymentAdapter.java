package structural.adapter;

/**
 * Implementasi Pola Adapter
 * - Mengadaptasi interface lama (LegacyPaymentSystem) ke interface baru (PaymentProcessor)
 * - Menerjemahkan permintaan dari interface baru ke interface sistem lama
 */
public class PaymentAdapter implements PaymentProcessor {
    // Sistem pembayaran lama yang diadaptasi
    private final LegacyPaymentSystem legacySystem;

    /**
     * Konstruktor untuk PaymentAdapter
     * 
     * @param legacySystem Sistem pembayaran lama yang akan diadaptasi
     */
    public PaymentAdapter(LegacyPaymentSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran sebesar " + amount + " " + currency);
        boolean success = legacySystem.deductAmount(amount);
        System.out.println(success ? "Pembayaran berhasil" : "Pembayaran gagal");
    }

    @Override
    public String getPaymentStatus() {
        return legacySystem.getAccountInfo();
    }
} 