package behavioral.strategy;

/**
 * Kelas CreditCardPayment
 * 
 * Ini adalah strategi konkret yang mengimplementasikan pembayaran kartu kredit.
 * Ini adalah salah satu strategi pembayaran yang mungkin digunakan
 * dalam konteks pembayaran.
 */
public class CreditCardPayment implements PaymentStrategy {
    // Nomor kartu untuk kartu kredit
    private final String cardNumber;
    
    // Nama pemegang kartu
    private final String cardHolder;

    /**
     * Konstruktor untuk CreditCardPayment
     * 
     * @param cardNumber Nomor kartu kredit
     * @param cardHolder Nama pemegang kartu
     */
    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Memproses pembayaran kartu kredit sebesar $" + amount);
        System.out.println("Kartu: " + maskCardNumber(cardNumber));
        System.out.println("Pemegang Kartu: " + cardHolder);
    }

    @Override
    public String getPaymentMethod() {
        return "Kartu Kredit";
    }

    /**
     * Menyembunyikan nomor kartu kredit untuk keamanan
     * 
     * @param cardNumber Nomor kartu yang akan disembunyikan
     * @return Nomor kartu yang disembunyikan
     */
    private String maskCardNumber(String cardNumber) {
        return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
    }
} 