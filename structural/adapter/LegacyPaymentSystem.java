package structural.adapter;

/**
 * Kelas LegacyPaymentSystem
 * 
 * Kelas ini merepresentasikan sistem pembayaran lama yang perlu kita adaptasi.
 * Ini adalah "adaptee" dalam pola Adapter, yang berisi fungsionalitas
 * yang ingin kita gunakan kembali tetapi dengan interface yang berbeda.
 */
public class LegacyPaymentSystem {
    // Nomor akun untuk sistem pembayaran
    private final String accountNumber;
    
    // Saldo saat ini dalam akun
    private double balance;

    /**
     * Konstruktor untuk LegacyPaymentSystem
     * 
     * @param accountNumber Nomor akun
     * @param initialBalance Saldo awal
     */
    public LegacyPaymentSystem(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    /**
     * Mengurangi jumlah dari saldo
     * 
     * @param amount Jumlah yang akan dikurangi
     * @return true jika pengurangan berhasil, false jika saldo tidak mencukupi
     */
    public boolean deductAmount(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * Mendapatkan informasi akun saat ini
     * 
     * @return String yang berisi informasi akun
     */
    public String getAccountInfo() {
        return "Akun: " + accountNumber + ", Saldo: " + balance;
    }
} 