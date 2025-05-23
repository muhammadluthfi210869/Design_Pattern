package behavioral.strategy;

/**
 * Kelas PayPalPayment
 * 
 * Ini adalah strategi konkret yang mengimplementasikan pembayaran PayPal.
 * Ini adalah salah satu strategi pembayaran yang mungkin digunakan
 * dalam konteks pembayaran.
 */
public class PayPalPayment implements PaymentStrategy {
    // Email yang terkait dengan akun PayPal
    private final String email;

    /**
     * Konstruktor untuk PayPalPayment
     * 
     * @param email Email akun PayPal
     */
    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Memproses pembayaran PayPal sebesar $" + amount);
        System.out.println("Akun PayPal: " + email);
    }

    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
} 